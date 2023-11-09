package com.kfm.schoolBatis.mapper;

import com.kfm.schoolBatis.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoleMapperTest {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    void selectAll() {
        List<Role> roles = roleMapper.selectAll1();
        roles.forEach(r-> System.out.println(r));
    }

    @Test
    void selectByUid() {
        List<Role> roles = roleMapper.selectByUid(1);
        roles.forEach(r-> System.out.println(r));
    }
}