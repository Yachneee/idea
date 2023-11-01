package com.kfm.boot.controller;

import com.kfm.boot.utils.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Administrator
 */
@Controller
public class AvatarController {
    @RequestMapping("/avatar")
    public void avatar(String name, HttpServletResponse response, RedirectAttributes attributes) {
        // 头像的 file 对象
        File file = new File(Constant.AVATAR_PATH+File.separator + name);
        // 告诉浏览器响应的是二进制流
        response.setContentType("application/octet-stream");
        try(FileInputStream in = new FileInputStream(file)) {
            in.transferTo(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            attributes.addFlashAttribute(Constant.MESSAGE_KEY,"头像加载失败");
        }
    }
}
