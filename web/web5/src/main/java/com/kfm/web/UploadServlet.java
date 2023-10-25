package com.kfm.web;

import com.kfm.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
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
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Collection<Part> parts = req.getParts();
        String ip = req.getRemoteHost();
        ip="0:0:0:0:0:0:0:1".equals(ip)?"127.0.0.1":ip;
        StringBuilder downloadLinks = new StringBuilder();
        StringBuilder message = new StringBuilder();
        for (Part part : parts) {
            String fileName = part.getSubmittedFileName();
            //文件名
            String filePath = Constant.UPLOAD_PATH + File.separator + fileName;
            //文件路径
            File file = new File(filePath);
            // 如果目录不存在就去创建目录
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            String address= "http://" +ip+":8080/download?file="+fileName;
            String name = fileName.substring(0,fileName.lastIndexOf("."));
            part.write(filePath);
            downloadLinks.append("<a href='").append(address).append("'>下载").append(name).append("</a><br>");
            message.append("<p style='color: blueviolet'>").append(fileName).append("上传成功</p>");
        }
        String html = "<html><body>";
        html += message;
        html += "<p>下载地址如下：</p>";
        html += downloadLinks;
        html += "</body></html>";
        resp.getWriter().write(html);
    }
}
