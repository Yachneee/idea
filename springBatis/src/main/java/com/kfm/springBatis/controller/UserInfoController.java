package com.kfm.springBatis.controller;

import com.github.pagehelper.PageInfo;
import com.kfm.springBatis.entity.UserInfo;
import com.kfm.springBatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author Administrator
 */
@Controller
public class UserInfoController {
    //    private static final Logger logger = LogManager.getLogger(UserInfoController.class);
//    private final UserInfoService userInfoService=new UserInfoService();
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/userInfo/all")
    public ModelAndView mv(UserInfo userInfo, Integer pageNum, Integer pageSize) {
        ModelAndView modelAndView = new ModelAndView("userInfo/all");
        PageInfo<UserInfo> page = userInfoService.findAll(userInfo, pageNum, pageSize);
        modelAndView.addObject("page", page);
        modelAndView.addObject("condition", userInfo);
        return modelAndView;
    }

    @RequestMapping("/userInfo/edit")
    public String edit(UserInfo userInfo, MultipartFile file, RedirectAttributes attributes) {
        if (userInfo.getId() == null) {
            attributes.addFlashAttribute("msg", "没有获取到id");
        } else {
            int change = userInfoService.change(userInfo, file);
            if (change > 0) {
                attributes.addFlashAttribute("msg", "修改成功");
            } else {
                attributes.addFlashAttribute("msg", "修改失败");
            }
        }
        return "redirect:/userInfo/all";
    }

    @GetMapping("/userInfo/add")
    public String add() {
        return "userInfo/add";
    }

    @RequestMapping("/userInfo/add")
    public String add(UserInfo userInfo, MultipartFile file, RedirectAttributes attributes) {
        if (userInfo.getName() == null || userInfo.getName().isEmpty()) {
            attributes.addFlashAttribute("msg", "姓名不能为空");
            return "redirect:/userInfo/add";
        } else {
            int add = userInfoService.add(userInfo, file);
            if (add > 0) {
                attributes.addFlashAttribute("msg", "添加成功");
            } else {
                attributes.addFlashAttribute("msg", "添加失败");
            }
        }
        return "redirect:/userInfo/all";
    }
//    @RequestMapping("/img")
//    public void avatar(String name, HttpServletResponse response, RedirectAttributes attributes) {
//        // 头像的 file 对象
//        File file = new File(Constant.IMG_PATH,name);
//        // 告诉浏览器响应的是二进制流
//        response.setContentType("application/octet-stream");
//        try(FileInputStream in = new FileInputStream(file)) {
//            in.transferTo(response.getOutputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//            attributes.addFlashAttribute("msg","头像加载失败");
//        }
//    }
}
