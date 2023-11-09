package com.kfm.schoolBatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kfm.schoolBatis.entity.User;
import com.kfm.schoolBatis.mapper.UserMapper;
import com.kfm.schoolBatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findOne(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public PageInfo<User> findAll() {
        PageHelper.startPage(1,5);
        List<User> users = userMapper.selectAll1();
        return new PageInfo<>(users);
    }

    @Override
    public int edit(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int add(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateLastLoginTime(User user) {
        return userMapper.updateLastLoginTime(user);
    }
}
