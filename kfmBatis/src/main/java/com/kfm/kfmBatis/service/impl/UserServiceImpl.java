package com.kfm.kfmBatis.service.impl;

import com.kfm.kfmBatis.entity.User;
import com.kfm.kfmBatis.mapper.UserMapper;
import com.kfm.kfmBatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByUser(User user) {
        return userMapper.selectByUser(user);
    }
}
