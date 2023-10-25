package com.kfm.web;

import com.kfm.utils.CaptchaUtils;
import com.kfm.utils.EmailUtils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Administrator
 */
@WebServlet("/send")
public class SendEmailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sixDigits = CaptchaUtils.sixDigits();
        send(sixDigits);
        Cookie c=new Cookie("captcha",sixDigits);
        resp.addCookie(c);
        req.getRequestDispatcher("index.html").forward(req,resp);
    }

    public static void send(String c){
        // 设置属性
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.qq.com");
        // SMTP 服务器地址
        props.put("mail.smtp.port", "587");
        // SMTP 服务器端口
        // 创建Session对象
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EmailUtils.QQ_EMAIL, EmailUtils.QQ_PASSWORD);
            }
        });
        try {
            // 创建MimeMessage对象
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EmailUtils.QQ_EMAIL));
            // 发件人
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(EmailUtils.GOOGLE_EMAIL));
            // 收件人
            message.setSubject("你收到验证码：******");
            message.setText("你收到的验证码为："+c);
            // 发送邮件
            Transport.send(message);
            System.out.println("邮件发送成功！");
        } catch (MessagingException e) {
            System.out.println("邮件发送失败！");
        }
    }
}
