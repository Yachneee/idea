package mapper;

import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.DataSourceUtil;

import java.sql.SQLException;

/**
 * @author Administrator
 */
public class UserDao {
    private final QueryRunner RUN= new QueryRunner(DataSourceUtil.getDataSource());
    public int addUser(String username,String name,String password,String birth,String createTime,String phone,String email) throws SQLException {
        String sql="insert into kfm_user(username,name,password,birth,create_time,phone,email) values(?,?,?,?,?,?,?)";
        return  RUN.update(sql, username, name, password, birth, createTime, phone, email);
    }
    public User selectUser(String username,String password) throws SQLException {
        String sql="select * from kfm_user where username=? and password =?";
        return RUN.query(sql, new BeanHandler<>(User.class), username, password);
    }
    public void changeLoginTime(String username, String loginTime) throws SQLException {
        String sql="update kfm_user set last_login=? where username=?";
        RUN.update(sql, loginTime, username);
    }
    public void changePassword(String username,String password) throws SQLException {
        String sql="update kfm_user set password=? where username=?";
        RUN.update(sql, password, username);
    }
    public User selectUserByUsername(String username) throws SQLException {
        String sql="select * from kfm_user where username=?";
        return RUN.query(sql, new BeanHandler<>(User.class), username);
    }
}
