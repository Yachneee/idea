package service;

import mapper.UserDao;
import utils.FormatUtil;

import java.sql.SQLException;

/**
 * @author Administrator
 */
public class RegisterService {
    public boolean register(String username,String name,String password,String birth,String phone,String email){
        if(username.isEmpty()||name.isEmpty()||password.isEmpty()||birth.isEmpty()||email.isEmpty()){
            return false;
        }else {
            String time = FormatUtil.getTime(System.currentTimeMillis());
            password=FormatUtil.encode(password);
            UserDao userDao = new UserDao();
            try {
                return userDao.addUser(username, name, password, birth, time, phone, email) > 0;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }
}
