package com.kfm.web6.controller;

import com.kfm.web6.entity.User;
import com.kfm.web6.service.UserService;
import com.kfm.web6.utils.Constant;
import com.kfm.web6.utils.ValidUtils;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Controller
public class UserController {
   private final UserService userService=new UserService();
    @RequestMapping("/login")
    public String login(){
        return "login2";
    }
    @PostMapping("/login")
    public String login(HttpServletRequest req,String username, String password){
        User login = userService.login(username, password);
        if(login==null){
            req.setAttribute("msg","用户名或密码错误");
            return "login2";
        }
        req.getSession().setAttribute("msg","登陆成功");
        req.getSession().setAttribute("user",login);
        return "redirect:/index";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/register")
    public String register(String username,String password,String password1,String email,
                           String phone,String sex,String avatar,
                           String captcha,HttpServletRequest request,
                           RedirectAttributes redirectAttributes){
        boolean ver = CaptchaUtil.ver(captcha, request);
        if (!ver) {
            CaptchaUtil.clear(request);
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "验证码错误！");
            return "redirect:/register";
        }
        CaptchaUtil.clear(request);
        if (password == null || !password.equals(password1)) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "密码不一致！");
            return "redirect:/register";
        }
        // username长度必须在5位以上 不能有中文不能以数字开头
        if (!ValidUtils.validUsername(username)) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "用户名不规范，字母开头，允许5-16字节，允许字母数字下划线！");
            return "redirect:/register";
        }
        // 校验email
        if (!ValidUtils.validEmail(email)) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "邮箱地址不正确");
            return "redirect:/register";
        }
        // 密码强度校验
        if (!ValidUtils.validPassword(password)) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "密码不正确，以字母开头，长度在6~18之间，只能包含字母、数字和下划线");
            return "redirect:/register";
        }
        // 电话号码校验
        if(!ValidUtils.validPhone(phone)){
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "手机号码格式不正确");
            return "redirect:/register";
        }
        int rows = userService.register(username, password, email);
        if (rows > 0) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "注册成功，请登录");
            return "redirect:/login";
        }
        redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "注册失败，请重新注册");
        return "redirect:/register";
    }
}
