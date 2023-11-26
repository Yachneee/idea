package com.kfm.kfmBatis.controller;

import com.kfm.kfmBatis.entity.Result;
import com.kfm.kfmBatis.entity.User;
import com.kfm.kfmBatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Yachne
 */
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        User user1 = userService.selectByUser(user);
        return user1==null?Result.failure("登陆失败"):Result.success("登陆成功",user1);
    }
}
