package com.kfm.servlet;

import com.kfm.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Part file = req.getPart("file");
        String name = file.getSubmittedFileName();
        String dir = Constant.UPLOAD_PATH;
        String fileName = dir + File.separator + name;
        File f = new File(fileName);
        if (!f.getParentFile().exists()) {
            boolean mkdirs = f.getParentFile().mkdirs();
            if(mkdirs){
                System.out.println("创建"+f.getParentFile()+"成功");
            }
        }
        try {
            file.write(fileName);
            resp.getWriter().write("<h3>上传成功</h3>");
        } catch (IOException e) {
            e.printStackTrace();
            resp.getWriter().write("<h3>上传失败</h3>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
