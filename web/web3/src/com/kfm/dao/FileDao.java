package com.kfm.dao;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.kfm.entity.FileT;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * @author Administrator
 */
public class FileDao {
    private static QueryRunner run;
    private static void getRun() throws Exception {
        if(run==null){
            Properties prop=new Properties();
            prop.load(new FileInputStream("D:\\kaifamiao\\java\\io\\kfm.properties"));
            DataSource source = DruidDataSourceFactory.createDataSource(prop);
            run= new QueryRunner(source);
        }
    }
    public static int add(String ip,String name,String type,String size,String time,String address) throws Exception {
        getRun();
        String sql="insert into file(ip,file_name,file_type,file_size,time,address) values(?,?,?,?,?,?)";
        return run.update(sql, ip,name,type,size,time,address);
    }
    public static List<FileT> select(String ip, String name, String time) throws Exception {
        getRun();
        String sql="select * from file where ip=? and file_name=? and time=?";
        return run.query(sql,new BeanListHandler<>(FileT.class),ip, name, time);
    }
}
