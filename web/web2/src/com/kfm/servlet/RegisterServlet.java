package com.kfm.servlet;

import com.kfm.utils.UserOpe;
import com.wf.captcha.utils.CaptchaUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

/**
 * @author Administrator
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String password2 = req.getParameter("password2");
        String email = req.getParameter("email");
        String captcha = req.getParameter("captcha");
        if (!CaptchaUtil.ver(captcha, req)) {
            CaptchaUtil.clear(req);
            // 清除session中的验证码
            resp.sendRedirect(req.getContextPath()+"/error");
        }
        if(Objects.equals(password,password2)){
            try {
                if(UserOpe.selectByUsername(username)!=null){
                    System.out.println(username+" 已被注册");
                }else {
                    UserOpe.add(email,username,password);
                    System.out.println(username+" 注册成功");
                }
                resp.sendRedirect(req.getContextPath()+"/login");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("注册失败，两次输入密码不同！");
            resp.sendRedirect(req.getContextPath()+"/error");
        }
    }
}
