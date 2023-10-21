package service;

import entity.FileT;
import mapper.FileDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
public class ShowService {
    public String show(String username) throws SQLException {
        FileDao fileDao = new FileDao();
        List<FileT> fileTs = fileDao.selectAll();
        StringBuilder fileT = new StringBuilder("<style>table, tr,td{border:1px solid black;} " +
                ".container{background-color:#b89db8;width:900px;margin:20px auto;border-bottom:50px solid transparent;text-align:center; " +
                "body {font-family: Arial, sans-serif;background-color: #d8d8d8;}</style><div class=\"container\">");
        if(fileTs!=null&& !fileTs.isEmpty()){
            fileT.append("<h2>Hello, ").append(username).append("!</h2>").append("<h2>已上传的文件列表</h2><table>")
                    .append("<tr>").append("<td>文件名</td>").append("<td>文件大小</td>").append("<td>上传时间</td>").append("<td>下载连接</td>").append("<td>上传者IP</td>").append("</tr>");
            for (FileT f : fileTs) {
                fileT.append("<tr><td>").append(f.getName()).append("</td>")
                        .append("<td>").append(f.getSize() / 1024.0).append("KB</td>")
                        .append("<td>").append(f.getCreate_time()).append("</td>")
                        .append("<td>").append(f.getDownload_link()).append("</td>")
                        .append("<td>").append(f.getUpload_ip()).append("</td>")
                        .append("</tr>");
            }
            return fileT + "</table></div>";
        }else {
            return fileT+"<h2>服务端上传目录为空</h2></div>";
        }
    }
}
