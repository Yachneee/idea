package com.kfm.kfmBatis.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.kfm.kfmBatis.entity.User;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void selectByUser() {
        User user = new User();
        System.out.println(user);
        user.setUsername("admin");
        user.setPassword("admin");
        User user1 = userMapper.selectByUser(user);
        System.out.println(user1);
    }
}