package com.kfm.schoolBatis.service;

import com.github.pagehelper.PageInfo;
import com.kfm.schoolBatis.entity.User;

/**
 * @author Administrator
 */
public interface UserService {
    User findOne(User user);
    PageInfo<User> findAll();
    int edit(User user);
    int add(User user);
    int updateLastLoginTime(User user);
}
