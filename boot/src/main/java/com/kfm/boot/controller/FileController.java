package com.kfm.boot.controller;

import com.kfm.boot.utils.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author Administrator
 */
@Controller
public class FileController {
    @PostMapping("/upload")
    public String upload(MultipartFile[] files, RedirectAttributes attributes){
        StringBuilder message = new StringBuilder();
        StringBuilder link=new StringBuilder();
        for (MultipartFile file : files) {
            String filename = file.getOriginalFilename();
            System.out.println(file.getContentType());
            File f = new File(Constant.UPLOAD_PATH, filename);
            if(!f.getParentFile().exists()){
                f.getParentFile().mkdirs();
            }
            try (InputStream in = file.getInputStream();
                 FileOutputStream out = new FileOutputStream(f)) {
                in.transferTo(out);
                message.append(filename).append("上传成功<br>");
                link.append("<a href='/download?file=").append(filename).append("'>下载").append(filename).append("</a>").append("<br>");
            } catch (IOException e) {
                e.printStackTrace();
                message.append(filename).append("上传失败<br>");
                link.append(filename).append("上传失败<br>");
            }
        }
        attributes.addFlashAttribute(Constant.MESSAGE_KEY,message.toString());
        attributes.addFlashAttribute(Constant.LINK_KEY,link.toString());
        return "redirect:/listPage";
    }
    @RequestMapping("/download")
    public String download(HttpServletResponse resp, HttpServletRequest req){
        // 下载的逻辑
        // 告诉浏览器响应的是二进制流
        resp.setContentType("application/octet-stream");
        // 获取本次请求要下载的文件名
        String file = req.getParameter("file");
        // 设置以附件的形式下载，指定下载的名字是文件原来的名字
        resp.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(file, StandardCharsets.UTF_8));
        // 要下载的文件的完整路径
        String path = Constant.UPLOAD_PATH + File.separator + file;
        try(FileInputStream in = new FileInputStream(path);
            // 获取响应的输出流
            ServletOutputStream out = resp.getOutputStream()){
            // 将文件内容写入到输出流
            in.transferTo(out);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
