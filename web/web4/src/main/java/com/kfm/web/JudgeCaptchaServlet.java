package com.kfm.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author Administrator
 */
@WebServlet("/judge")
public class JudgeCaptchaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String captcha = req.getParameter("captcha");
        Cookie[] cookies = req.getCookies();
        HashMap<String,String> hashMap=new HashMap<>();
        for (Cookie cookie : cookies) {
            hashMap.put(cookie.getName(),cookie.getValue());
        }
        resp.setContentType("text/html;charset=UTF-8");
        String cap= hashMap.get("captcha");
        if(Objects.equals(captcha,cap)){
            resp.getWriter().write("<h1>验证成功</h1>");
            System.out.println("验证成功");
        }else {
            resp.getWriter().write("<h1>验证失败</h1>");
        }
    }
}
