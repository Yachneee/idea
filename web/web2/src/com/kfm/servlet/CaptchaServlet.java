package com.kfm.servlet;

import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.ChineseCaptcha;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.utils.CaptchaUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.RenderedImage;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/cap")
public class CaptchaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 文字类型
        ChineseCaptcha captcha = new ChineseCaptcha(130, 48);
//       // 验证码存入session
        CaptchaUtil.out(captcha, request, response);
//        // 输出图片流
        captcha.out(response.getOutputStream());
    }
}