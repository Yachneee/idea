package com.kfm.web6.service;


import cn.hutool.crypto.SecureUtil;
import com.kfm.web6.entity.User;
import com.kfm.web6.mapper.UserDao;

import java.sql.SQLException;

/**
 * @author Administrator
 */
public class UserService {
    private final UserDao userDao=new UserDao();
    public User login(String username, String password) {
        String s = SecureUtil.md5(password);
        if(username.isEmpty()||password.isEmpty()){
            return null;
        }
        try {
           return userDao.selectOne(username, s);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public int register(String username, String password,String email) {
        String s = SecureUtil.md5(password);
        try {
            return userDao.addOne(username, s,email);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
