package com.kfm.boot.filter;



import com.kfm.boot.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Administrator
 */
//@Component
//@WebFilter("/*")
public class UserFilter implements Filter {
    private static final List<String> ALLOW_PATH = List.of("/login", "/register", "/error", "/", "/captcha");
    private static final String[] RESOURCE_PATH = {"/css/", "/js/", "/fonts/", "/images/", "/fonts/", "/api/", "/favicon.ico"};

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String path = request.getContextPath();
        String uri = request.getRequestURI();
        uri = uri.substring(path.length());
        if (ALLOW_PATH.contains(uri)) {
            filterChain.doFilter(request, response);
            return;
        }
        for (String s : RESOURCE_PATH) {
            if (uri.startsWith(s)) {
                filterChain.doFilter(request, response);
                return;
            }
        }
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            request.getSession().setAttribute("msg", "还没有登陆,先去登录");
            response.sendRedirect("/login");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
