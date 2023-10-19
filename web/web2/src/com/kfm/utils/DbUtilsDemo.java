package com.kfm.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Administrator
 */
public class DbUtilsDemo {
    private static DataSource getDataSource() throws Exception {
        Properties prop=new Properties();
        prop.load(new FileInputStream("D:\\kaifamiao\\java\\io\\druid.properties"));
        return DruidDataSourceFactory.createDataSource(prop);
    }
    public static QueryRunner getRunner() throws Exception {
        DataSource source = getDataSource();
        return new QueryRunner(source);
    }
}
