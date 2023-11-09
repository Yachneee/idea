package com.kfm.schoolBatis.service.impl;

import com.github.pagehelper.PageInfo;
import com.kfm.schoolBatis.entity.User;
import com.kfm.schoolBatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;
    @Test
    void findOne() {
        User user = new User();
        user.setPassword("123456");
        user.setUsername("admin1");
        User one = userService.findOne(user);
        System.out.println(one);
    }
    @Test
    void findAll() {
        PageInfo<User> all = userService.findAll();
        List<User> list = all.getList();
        list.forEach(u-> System.out.println(u));
    }
}