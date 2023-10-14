package com.kfm.select;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author Administrator
 */
public class Select {
    private static Connection  con;

    private static void getConnect() throws Exception {
        Properties pro=new Properties();
        pro.load(new FileReader("D:\\kaifamiao\\java\\web\\web1\\io\\druid.properties"));
        DataSource source = DruidDataSourceFactory.createDataSource(pro);
        con = source.getConnection();
    }
    private static void print(String sql) throws Exception {
        getConnect();
        PreparedStatement prepared = con.prepareStatement(sql);
        ResultSet resultSet = prepared.executeQuery();
        while(resultSet.next()){
            for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
                System.out.print(resultSet.getObject(i+1)+"\t");
            }
            System.out.println();
        }
        con.close();
        con=null;
    }
    public static void selectCourse() throws Exception {
        print("select * from course");
    }
    public static void selectStudent() throws Exception {
        print("select * from student");
    }
    public static void selectTeacher() throws Exception {
        print("select * from teacher");
    }
}
