package com.kfm.utils;

import com.kfm.entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
public class UserOpe {
    private static QueryRunner run = null;
    static {
        try {
            run = DbUtilsDemo.getRunner();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static int add(String email,String username,String password) throws SQLException {
        return run.update("insert into user(email,username,password) values (?,?,?)",email,username,password);
    }
    public static User select(String username,String password) throws SQLException {
        return run.query("select * from user where username=? and password =?",new BeanHandler<>(User.class),username,password);
    }
    public static List<User> selectAll() throws SQLException {
        return run.query("select * from user",new BeanListHandler<>(User.class));
    }
    public static User selectByUsername(String username) throws SQLException {
        return run.query("select * from user where username=?",new BeanHandler<>(User.class),username);
    }
}
