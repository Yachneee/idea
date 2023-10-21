package web;

import mapper.UserDao;
import utils.FormatUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Administrator
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FormatUtil.setCharset(req,resp);
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("/login");
            return;
        }
        session.removeAttribute("user");
        try {
            new UserDao().closeCon();
        } catch (SQLException e) {
            System.out.println("关闭流失败");
            e.printStackTrace();
        }
        resp.getWriter().write("<h1>再见</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
