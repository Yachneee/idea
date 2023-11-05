package com.kfm.springBatis.controller;

import com.kfm.springBatis.entity.UserInfo;
import com.kfm.springBatis.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class UserInfoController {
//    private static final Logger logger = LogManager.getLogger(UserInfoController.class);
    private final UserInfoService userInfoService=new UserInfoService();
    @RequestMapping("/allUser")
    public ModelAndView mv() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userInfo");
        List<UserInfo> userInfos = userInfoService.findAll();
        modelAndView.addObject("userInfos", userInfos);
        return modelAndView;
    }

}
