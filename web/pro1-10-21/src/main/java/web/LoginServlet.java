package web;


import com.wf.captcha.utils.CaptchaUtil;
import entity.User;
import service.LoginService;
import utils.FormatUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FormatUtil.setCharset(req,resp);
        String captcha = req.getParameter("captcha");
        if(CaptchaUtil.ver(captcha,req)){
            CaptchaUtil.clear(req);
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            User user=new LoginService().login(username,password);
            if(user!=null){
                HttpSession session = req.getSession();
                session.setAttribute("user",user);
                req.setAttribute("user",user);
                req.getRequestDispatcher("/hello.jsp").forward(req,resp);
            }else {
                resp.getWriter().write("<h3 style='color:red;'>登录失败</h3>");
            }
        }else {
            resp.getWriter().write("<h3 style='color:red;'>验证码错误</h3>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.html").forward(req,resp);
    }
}
