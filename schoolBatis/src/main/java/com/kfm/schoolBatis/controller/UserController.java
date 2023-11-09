package com.kfm.schoolBatis.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.github.pagehelper.PageInfo;
import com.kfm.schoolBatis.entity.LoginMessage;
import com.kfm.schoolBatis.entity.Role;
import com.kfm.schoolBatis.entity.User;
import com.kfm.schoolBatis.interceptor.LoginCountInterceptor;
import com.kfm.schoolBatis.service.UserService;
import com.kfm.schoolBatis.utils.Constant;
import com.kfm.schoolBatis.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    private final Map<String, Timestamp> IP_LAST_MAP = new ConcurrentHashMap<>();

    @GetMapping("/send")
    public String send(HttpServletRequest request, Model model) {
        String ak = "ctLqofKaogdovQfKmoP83sBARDHOfFOE";
        String url = "https://api.map.baidu.com/location/ip?ak=" + ak;
        String body = HttpRequest.post(url).execute().body();
        JSONObject entries = JSONUtil.parseObj(body);
        String address = (String) entries.get("address");
        String[] split = address.split("\\|");
        String country = split[0];
        String province = split[1];
        String city = split[2];
        LoginMessage loginMessage = new LoginMessage(country, city, province, IP_LAST_MAP.get(IpUtil.getIpAddress(request)));
        model.addAttribute("loginMessage", loginMessage);
        System.out.println(entries);
        return "message";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView login(User user, RedirectAttributes attributes, HttpSession session, HttpServletRequest request) {
        User one = userService.findOne(user);
        ModelAndView mv = new ModelAndView();
        if (one == null) {
            attributes.addFlashAttribute(Constant.MSG, "登陆失败");
            mv.setViewName("redirect:/login");
            return mv;
        } else {
            attributes.addFlashAttribute(Constant.MSG, "登陆成功");
        }
        Map<String, Integer> ipMap = LoginCountInterceptor.ipMap1;
        String ip = IpUtil.getIpAddress(request);
        if (ipMap != null) {
            ipMap.remove(ip);
        }
        Timestamp time = one.getLastLoginTime();
        if (time != null) {
            IP_LAST_MAP.put(ip, time);
        }
        one.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
        int i = userService.updateLastLoginTime(one);
        boolean admin = false;
        List<Role> roles = one.getRoles();
        for (Role role : roles) {
            if (Constant.ROLE_ADMIN.equals(role.getRoleName())) {
                admin = true;
                break;
            }
        }
        session.setAttribute("user", one);
        mv.addObject("admin", admin);
        mv.setViewName("hello");
        return mv;
    }

    @GetMapping("/list")
    public ModelAndView listUser() {
        ModelAndView mv = new ModelAndView("list");
        PageInfo<User> all = userService.findAll();
        mv.addObject("users", all.getList());
        return mv;
    }

    @GetMapping("/editMessage")
    public String edit() {
        return "editMessage";
    }

    @PostMapping("/editMessage")
    public String edit(User user, RedirectAttributes attributes) {
        int edit = userService.edit(user);
        if (edit > 0) {
            attributes.addFlashAttribute(Constant.MSG, "修改成功");
        } else {
            attributes.addFlashAttribute(Constant.MSG, "修改失败");
        }
        return "hello";
    }

    @GetMapping("/editPassword")
    public String editPassword() {
        return "editPassword";
    }

    @RequestMapping("/editPassword")
    public String editPassword(User user, RedirectAttributes attributes, HttpSession session, String oldPassword) {
        int edit = userService.edit(user);
        if (edit > 0) {
            attributes.addFlashAttribute(Constant.MSG, "修改成功");
        } else {
            attributes.addFlashAttribute(Constant.MSG, "修改失败");
        }
        session.removeAttribute("user");
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session, RedirectAttributes attributes) {
        session.removeAttribute("user");
        attributes.addFlashAttribute(Constant.MSG, "退出成功");
        return "redirect:/login";
    }
}
