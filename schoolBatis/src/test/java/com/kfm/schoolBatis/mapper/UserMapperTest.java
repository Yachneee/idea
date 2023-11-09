package com.kfm.schoolBatis.mapper;

import com.kfm.schoolBatis.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void selectAll() {
        List<User> users = userMapper.selectAll1();
        users.forEach(u-> System.out.println(u));
    }
    @Test
    void selectOne() {
        User user = new User();
        user.setPassword("123456");
        user.setUsername("admin1");
        User user1 = userMapper.selectOne(user);
        System.out.println(user1);
    }
}