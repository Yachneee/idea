package com.kfm.boot.service;


import cn.hutool.crypto.SecureUtil;
import com.kfm.boot.entity.User;
import com.kfm.boot.mapper.UserDao;
import com.kfm.boot.utils.Constant;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * @author Administrator
 */
public class UserService {
    private final UserDao userDao=new UserDao();
    public User login(User user) {
        user.setPassword(SecureUtil.md5(user.getPassword()));
        if(user.getUsername()==null||user.getUsername().isEmpty()||user.getPassword()==null||user.getPassword().isEmpty()){
            return null;
        }
        try {
           return userDao.selectOne(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public int register(User u, MultipartFile f) {
        u.setPassword(SecureUtil.md5(u.getPassword()));
        String filename = f.getOriginalFilename();
        u.setAvatar(filename);
        File file = null;
        if (filename != null) {
            file = new File(Constant.AVATAR_PATH, filename);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            try(InputStream in = f.getInputStream();
                FileOutputStream out = new FileOutputStream(file)){
                in.transferTo(out);
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
        try {
            return userDao.addOne(u);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
