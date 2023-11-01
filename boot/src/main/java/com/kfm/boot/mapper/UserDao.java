package com.kfm.boot.mapper;



import com.kfm.boot.entity.User;
import com.kfm.boot.utils.DataSourceUtil;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Administrator
 */
public class UserDao {
    private final QueryRunner RUN=new QueryRunner(DataSourceUtil.getDataSource());
    private final BasicRowProcessor processor=new BasicRowProcessor(new GenerousBeanProcessor());
    public User selectOne(User user) throws SQLException {
        String sql="select * from user";
        StringBuilder condition=new StringBuilder();
        ArrayList<Object> params = new ArrayList<>();
        if(user.getId()!=null){
            condition.append(" where id=?");
            params.add(user.getId());
        }
        if(user.getUsername()!=null&&!user.getUsername().isEmpty()){
            if(condition.isEmpty()){
                condition.append(" where username=?");
            }else {
                condition.append(" and username=?");
            }
            params.add(user.getUsername());
        }
        if(user.getPassword()!=null&&!user.getPassword().isEmpty()){
            if(condition.isEmpty()){
                condition.append(" where password=?");
            }else {
                condition.append(" and password=?");
            }
            params.add(user.getPassword());
        }
        sql+=condition;
        return RUN.query(sql,new BeanHandler<>(User.class,processor),params.toArray());
    }
    public int addOne(User user) throws SQLException {
        StringBuilder sql=new StringBuilder("insert into user(");
        StringBuilder values=new StringBuilder(" values(");
        List<Object> list=new ArrayList<>();
        if(user.getId()!=null){
            sql.append("id,");
            values.append("?,");
            list.add(user.getId());
        }
        if(user.getUsername()!=null&&!user.getUsername().isEmpty()){
            sql.append("username,");
            values.append("?,");
            list.add(user.getUsername());
        }
        if(user.getPassword()!=null&&!user.getPassword().isEmpty()){
            sql.append("password,");
            values.append("?,");
            list.add(user.getPassword());
        }
        if(user.getEmail()!=null&&!user.getEmail().isEmpty()){
            sql.append("email,");
            values.append("?,");
            list.add(user.getEmail());
        }
        if(user.getPhone()!=null&&!user.getPhone().isEmpty()){
            sql.append("phone,");
            values.append("?,");
            list.add(user.getPhone());
        }
        if(user.getAvatar()!=null&&!user.getAvatar().isEmpty()){
            sql.append("avatar,");
            values.append("?,");
            list.add(user.getAvatar());
        }
        if(user.getSex()!=null&&!user.getSex().isEmpty()){
            sql.append("sex,");
            values.append("?,");
            list.add(user.getSex());
        }
        String sql1=sql.substring(0,sql.length()-1)+")"+values.substring(0,values.length()-1)+")";
        return RUN.update(sql1,list.toArray());
    }
}
