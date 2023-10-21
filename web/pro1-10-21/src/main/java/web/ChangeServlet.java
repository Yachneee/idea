package web;

import com.wf.captcha.utils.CaptchaUtil;
import entity.User;
import service.ChangeService;
import utils.FormatUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

/**
 * @author Administrator
 */
@WebServlet("/change")
public class ChangeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("/login");
            return;
        }
        req.getRequestDispatcher("change.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FormatUtil.setCharset(req,resp);
        String captcha = req.getParameter("captcha");
        if(CaptchaUtil.ver(captcha,req)){
            String password = req.getParameter("password");
            String password1 = req.getParameter("password1");
            if(Objects.equals(password1,password)){
                HttpSession session = req.getSession();
                User user = (User)session.getAttribute("user");
                if(new ChangeService().change(user, password)){
                    resp.getWriter().write("<h3 style='color:green;'>密码修改成功</h3>");
                }else {
                    resp.getWriter().write("<h3 style='color:red;'>密码修改失败</h3>");
                }
            }else {
                resp.getWriter().write("<h3 style='color:red;'>两次输入密码不同</h3>");
            }
        }else {
            resp.getWriter().write("<h3 style='color:red;'>验证码错误</h3>");
        }
    }
}
