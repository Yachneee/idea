package day2_926.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;

/**
 * @author Administrator
 */
public class DBUtils {
    private final String JDBC_URL;
    private final String USERNAME;
    private final String PASSWORD;
    private Connection conn;
    private PreparedStatement ps;
    public DBUtils() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("io\\db.properties"));
        JDBC_URL = prop.getProperty("url");
        USERNAME = prop.getProperty("username");
        PASSWORD = (String) prop.get("password");
    }
    /**
     * 增删改
     * @param sql 要执行的sql语句
     * @param objects 可变长参数列表，可当作数组处理
     * @return 影响行数
     * @throws SQLException 。
     * @throws ClassNotFoundException 。
     */
    public int executeU(String sql,Object...objects) throws SQLException, ClassNotFoundException {
        prepared(sql);
        setObj(ps,objects);
        return ps.executeUpdate();
    }
    /**
     * 查
     * @param sql 要执行的具体语句
     * @param objs 可变长度参数，可当作数组处理
     * @return resultSet
     * @throws SQLException 。
     * @throws ClassNotFoundException 。
     */
    public <E> List<E> executeQ(String sql, Handler<E> handler,Object...objs) throws SQLException, ClassNotFoundException {
        prepared(sql);
        setObj(ps,objs);
        ResultSet resultSet = ps.executeQuery();
        return handler.handle(resultSet);
    }
    /**
     * 替换占位符
     * @param objects 具体值
     * @throws SQLException 。
     */
    private void setObj(Object...objects) throws SQLException {
        //替换占位符
        for (int i = 0; i < objects.length; i++) {
            ps.setObject(i+1,objects[i]);
        }
    }
    /**
     * 建立连接，没有连接时建立
     * @throws ClassNotFoundException 。
     * @throws SQLException 。
     */
    private void getCon() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        }
    }

    /**
     * 创建执行sql的对象
     * @param sql 要执行的sql
     * @throws SQLException .
     * @throws ClassNotFoundException .
     */
    private void prepared(String sql) throws SQLException, ClassNotFoundException {
        getCon();
        ps=conn.prepareStatement(sql);
    }
    public void close() throws SQLException {
        if(ps!=null&& !ps.isClosed()){
            ps.close();
            ps=null;
        }
        if(conn!=null&&!conn.isClosed()){
            conn.close();
            conn=null;
        }
    }
}
