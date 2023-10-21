package service;

import entity.User;
import mapper.UserDao;
import utils.FormatUtil;

import java.sql.SQLException;

/**
 * @author Administrator
 */
public class LoginService {
    public User login(String username,String password){
        String pass = FormatUtil.encode(password);
        UserDao userDao = new UserDao();
        try {
            User user =userDao.selectUser(username, pass);
            long l = System.currentTimeMillis();
            userDao.changeLoginTime(username, FormatUtil.getTime(l));
            return user;
        } catch (SQLException e) {
            return null;
        }
    }
}
