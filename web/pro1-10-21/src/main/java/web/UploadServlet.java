package web;

import service.UploadService;
import utils.FormatUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

/**
 * @author Administrator
 */
@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("/login");
            return;
        }
        req.getRequestDispatcher("upload.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FormatUtil.setCharset(req,resp);
        Collection<Part> parts = req.getParts();
        String ip="0:0:0:0:0:0:0:1".equals(req.getRemoteHost())?"127.0.0.1":req.getRemoteHost();
        try {
            String html = new UploadService().upload(parts, ip);
            resp.getWriter().write(html);
        } catch (SQLException e) {
            resp.getWriter().write("<h3 style='color:red;'>上传失败</h3>");
        }
    }
}
