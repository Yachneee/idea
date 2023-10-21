package service;

import entity.User;
import mapper.UserDao;
import utils.FormatUtil;

import java.sql.SQLException;

/**
 * @author Administrator
 */
public class ChangeService {
    public boolean change(User user,String password){
        String pass = FormatUtil.encode(password);
        UserDao userDao = new UserDao();
        try {
            userDao.changePassword(user.getUsername(),pass);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
