package com.kfm.servlet;

import com.kfm.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String dir = Constant.UPLOAD_PATH;
        File folder = new File(dir);
        resp.getWriter().write(writeFileT(folder));
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
    private String writeFileT(File upload){
        File[] files = upload.listFiles(File::isFile);
        StringBuilder fileT = new StringBuilder("<style>table, tr,td{border:1px solid black;} " +
                ".container{background-color:#b89db8;width:540px;margin:20px auto;border-bottom:50px solid transparent;text-align:center; " +
                "body {font-family: Arial, sans-serif;background-color: #d8d8d8;}}</style><div class=\"container\">");
        if(files!=null&& files.length > 0){
            fileT.append("<h2>目录").append(upload).append("中的文件列表</h2><table>").append("<tr>").append("<td>文件名</td>").append("<td>文件大小</td>").append("<td>修改时间</td>").append("<td>下载</td>").append("</tr>");
            for (File f : files) {
                fileT.append("<tr>" + "<td>").append(f.getName()).append("</td>")
                        .append("<td>").append(f.length() / 1024.0).append("KB</td>")
                        .append("<td>").append(f.lastModified()).append("</td>").append("<td>")
                        .append("<a href=\"/web3/download?file=").append(f.getName()).append("\">下载图片</a>").append("</td>")
                        .append("</tr>");
            }
            return fileT + "</table></div>";
        }else {
            return fileT+"<h3>服务端上传目录为空</h3></div>";
        }
    }
}
