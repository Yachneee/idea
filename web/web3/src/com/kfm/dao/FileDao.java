package com.kfm.dao;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Administrator
 */
public class FileDao {
    private static final QueryRunner RUN=new QueryRunner();
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/kfm", "Yachne", "lyq");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static int add(String ip,String name,String type,long size,String address) throws SQLException {
        String sql="insert into file(ip,file_name,file_type,file_size,address) values(?,?,?,?,?)";
        return RUN.update(getCon(),sql, ip,name,type,size,address);
    }
}
