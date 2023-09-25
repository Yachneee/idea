package day1_925.utils;

import day1_925.handler.Handler;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Administrator
 */
public class DBUtils {
    private Connection conn;
    private PreparedStatement ps;
    private final String JDBC_URL;
    private final String USERNAME;
    private final String PASSWORD;
    public DBUtils() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("io\\db.properties"));
        JDBC_URL = prop.getProperty("url");
        USERNAME = prop.getProperty("username");
        PASSWORD = (String) prop.get("password");
    }

    /**
     * 建立连接，有，返回之前的
     * @return 连接
     * @throws ClassNotFoundException 。
     * @throws SQLException 。
     */
    private Connection getCon() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        }
        return conn;
    }
    private PreparedStatement preparedStatement(String sql) throws SQLException, ClassNotFoundException {
        Connection con = getCon();
        return con.prepareStatement(sql);
    }
    /**
     * 增删改
     * @param sql 要执行的sql语句
     * @param objects 可变长度变量
     * @return 影响行数
     * @throws SQLException 。
     * @throws ClassNotFoundException 。
     */
    public int executeU(String sql,Object...objects) throws SQLException, ClassNotFoundException {
        ps= preparedStatement(sql);
        setObjects(ps,objects);
        return ps.executeUpdate();
    }

    /**
     * 查
     * @param sql 要执行的具体语句
     * @param objects 变长变量
     * @return 查询结果
     * @throws SQLException 。
     * @throws ClassNotFoundException 。
     */
    public <E> List<E> executeQ(String sql, Handler<E> handler,Object...objs) throws SQLException, ClassNotFoundException {
        ps=preparedStatement(sql);
        setObjects(ps,objs);
        List<E> list;
        try (ResultSet resultSet = ps.executeQuery()) {
            list = new ArrayList<>();
            int count = resultSet.getMetaData().getColumnCount();
            Object[] objects = new Object[count];
            while (resultSet.next()) {
                // 构建出一个数组  数组里面放的是一行数据
                for (int i = 0; i < count; i++) {
                    objects[i] = resultSet.getObject(i + 1);
                }
                E one = handler.getOne(objects);
                list.add(one);
            }
        }
        return list;
    }
    /**
     * 替换占位符
     * @param prepared 要替换的
     * @param objects 具体值
     * @throws SQLException 。
     */
    private void setObjects(PreparedStatement prepared,Object...objects) throws SQLException {
        for (int i = 0; i < objects.length; i++) {
            prepared.setObject(i+1,objects[i]);
        }
    }
    public void close() throws SQLException {
        if(ps!=null){
            ps.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}
