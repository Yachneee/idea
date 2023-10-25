package web;

import entity.FileT;
import entity.User;
import service.ShowService;
import service.UploadService;
import utils.FormatUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Administrator
 */
@WebServlet("/show")
public class ShowServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        FormatUtil.setCharset(req,resp);
        User user = (User)session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("/login");
        }else {
            try {
                String html = new ShowService().show(user.getUsername());
                resp.getWriter().write(html);
                resp.getWriter().write("<img src='/image/"+user.getUsername()+".jpg'>");
            } catch (SQLException e) {
                resp.getWriter().write("<h3 style='color:red;'>获取失败</h3>");
            }
        }
    }
}