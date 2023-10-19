package com.kfm.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/post")
public class HttpServletDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post请求");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("Yachne".equals(username)&&"lyq".equals(password)){
            System.out.println(username+"登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
