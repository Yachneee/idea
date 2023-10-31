package com.kfm.web6.mapper;

import com.kfm.web6.entity.User;
import com.kfm.web6.utils.DataSourceUtil;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;


/**
 * @author Administrator
 */
public class UserDao {
    private final QueryRunner RUN=new QueryRunner(DataSourceUtil.getDataSource());
    private final BasicRowProcessor processor=new BasicRowProcessor(new GenerousBeanProcessor());
    public User selectOne(String username, String password) throws SQLException {
        String sql="select * from user where username=? and password=?";
        return RUN.query(sql,new BeanHandler<>(User.class,processor),username,password);
    }
    public int addOne(String username, String password,String email) throws SQLException {
        String sql="insert into user(username,password,email) values(?,?,?)";
        return RUN.update(sql,username,password,email);
    }
}
