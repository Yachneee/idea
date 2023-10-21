package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Administrator
 */
public class ConnectionUtil {
    private static Connection connection;
    private final static Properties PROP;
    static {
        // 获取 datasource.properties 所在的流
        InputStream in = ConnectionUtil.class.getClassLoader().getResourceAsStream("kfm.properties");
        PROP = new Properties();
        try {
            PROP.load(in);
        } catch (IOException e) {
            System.out.println("加载配置失败");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            if(connection==null||connection.isClosed()){
                String className = PROP.getProperty("driverClassName");
                String url = PROP.getProperty("url");
                String username = PROP.getProperty("username");
                String password = PROP.getProperty("password");
                Class.forName(className);
                connection = DriverManager.getConnection(url, username, password);
            }
        } catch (SQLException |ClassNotFoundException e) {
            System.out.println("获取连接失败");
            e.printStackTrace();
            return null;
        }
        return connection;
    }
}
