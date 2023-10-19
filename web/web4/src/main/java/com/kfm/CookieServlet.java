package com.kfm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author Administrator
 */
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie name=new Cookie("name", URLEncoder.encode("张三", StandardCharsets.UTF_8));
        Cookie gender = new Cookie("gender", URLEncoder.encode("男", StandardCharsets.UTF_8));
        resp.addCookie(name);
        resp.addCookie(gender);
    }
}
