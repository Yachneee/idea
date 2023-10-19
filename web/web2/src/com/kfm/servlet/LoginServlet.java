package com.kfm.servlet;


import com.kfm.entity.User;
import com.kfm.utils.UserOpe;
import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.GifCaptcha;
import com.wf.captcha.utils.CaptchaUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Administrator
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.html").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String captcha = req.getParameter("captcha");
        if (!CaptchaUtil.ver(captcha, req)) {
            CaptchaUtil.clear(req);
            // 清除session中的验证码
            resp.sendRedirect(req.getContextPath()+"/error");
            return;
        }
        try {
            User user = UserOpe.select(username, password);
            if(user!=null){
                System.out.println(username+" 登陆成功");
                resp.sendRedirect(req.getContextPath()+"/index");
            }else {
                System.out.println(username+" 登陆失败，用户名或密码不对");
                resp.sendRedirect(req.getContextPath()+"/error");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            resp.sendRedirect(req.getContextPath()+"/error");
        }
    }
}
