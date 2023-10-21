package service;

import mapper.FileDao;
import utils.Constant;
import utils.FormatUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

/**
 * @author Administrator
 */

public class UploadService {
    public String upload(Collection<Part> parts, String ip) throws SQLException, IOException {
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
            String link= "http://" +ip+":8080/download?file="+fileName;
            String name = fileName.substring(0,fileName.lastIndexOf("."));
            part.write(filePath);
            downloadLinks.append("<a href='").append(link).append("'>下载").append(name).append("</a><br>");
            message.append("<p style='color: blueviolet'>").append(fileName).append("上传成功</p>");
            long l = System.currentTimeMillis();
            new FileDao().insert(name,part.getSize(), FormatUtil.getTime(l),ip,link);
        }
        String html = "<html><body>";
        html += message;
        html += "<p>下载地址如下：</p>";
        html += downloadLinks;
        html += "</body></html>";
        return html;
    }
}
