package web;



import com.wf.captcha.utils.CaptchaUtil;
import service.RegisterService;
import utils.FormatUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;


/**
 * @author Administrator
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FormatUtil.setCharset(req,resp);
        String captcha = req.getParameter("captcha");
        if(CaptchaUtil.ver(captcha,req)){
            String password = req.getParameter("password");
            String password1 = req.getParameter("password1");
            if(Objects.equals(password1,password)){
                CaptchaUtil.clear(req);
                String username = req.getParameter("username");
                String name = req.getParameter("name");
                String birth = req.getParameter("birth");
                String phone = req.getParameter("phone");
                String email = req.getParameter("email");
                boolean register = new RegisterService().register(username, name, password, birth, phone, email);
                if(register){
                    resp.sendRedirect("/login");
                }else {
                    resp.getWriter().write("<h3 style='color:red;'>注册失败</h3>");
                }
            }else {
                resp.getWriter().write("<h3 style='color:red;'>两次输入密码不同</h3>");
            }
        }else {
            resp.getWriter().write("<h3 style='color:red;'>验证码错误</h3>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.html").forward(req,resp);
    }
}
