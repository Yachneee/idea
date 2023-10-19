package com.kfm.servlet;

import com.kfm.dao.FileDao;
import com.kfm.entity.FileT;
import com.kfm.utils.Constant;
import com.kfm.utils.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Collection;

/**
 * @author Administrator
 */
@WebServlet("/uploadFiles")
@MultipartConfig
public class UploadFilesServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Collection<Part> parts = req.getParts();
        String ip = req.getRemoteHost();
        StringBuilder downloadLinks = new StringBuilder();
        StringBuilder message = new StringBuilder();
        for (Part part : parts) {
            String type = part.getContentType();
            //类型
            String name = part.getSubmittedFileName() ;
            //文件名
            if (Constant.ALLOW_TYPES.contains(type)) {
                String filePath = Constant.UPLOAD_PATH + File.separator + name;
                //文件路径
                File file = new File(filePath);
                // 如果目录不存在就去创建目录
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                long l = System.currentTimeMillis();
                String time = FileUtils.getTime(l);
                String address="/web3/download?file="+name;
                long size = part.getSize();
                String onlyName = name.substring(0,name.lastIndexOf("."));
                try {
                    int add  = FileDao.add(ip, onlyName, type,String.valueOf(size), time, address);
                    if(add>0){
                        System.out.println(name+"上传数据库成功");
                    }else {
                        System.out.println(name+"上传数据库失败");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                part.write(filePath);
                downloadLinks.append("<a href='").append(address).append("'>下载").append(onlyName).append("</a><br>");
                message.append("<p>").append(name).append("上传成功</p>");
            } else {
                message.append("<p>").append(name).append("上传失败，文件格式不支持</p>");
            }
        }
        String html = "<html><body>";
        html += message;
        html += "<p>下载地址如下：</p>";
        html += downloadLinks;
        html += "</body></html>";
        resp.getWriter().write(html);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/uploadFiles.html").forward(req,resp);
    }
}

