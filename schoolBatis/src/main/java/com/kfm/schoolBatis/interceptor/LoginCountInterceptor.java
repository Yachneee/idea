package com.kfm.schoolBatis.interceptor;

import com.kfm.schoolBatis.entity.bean.IpInfo;
import com.kfm.schoolBatis.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Administrator
 */
@Component
public class LoginCountInterceptor implements HandlerInterceptor {
    @Autowired
    private IpInfo ipInfo;
    @Value("${school.login_count}")
    private Integer max;
    @Autowired
    private AccessIpInterceptor accessIpInterceptor;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String method = request.getMethod();
        if ("get".equalsIgnoreCase(method)) {
            return true;
        }
        Map<String, Integer> ipMap = ipInfo.getIpMap();
        String ip = IpUtil.getIpAddress(request);
        Integer count = ipMap.get(ip);
        if (count == null) {
            ipMap.put(ip, 1);
            return true;
        } else {
            count++;
            if (count > max) {
                //拉入黑名单
                accessIpInterceptor.blackIPList.add(ip);
                response.sendRedirect(request.getContextPath() + "/error");
                return false;
            } else {
                ipMap.put(ip, count);
                return true;
            }
        }
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Object user = request.getSession().getAttribute("user");
        if(user!=null){
            ipInfo.getIpMap().remove(IpUtil.getIpAddress(request));
        }
    }
}
