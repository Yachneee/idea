package day5_1006.pm;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import day4_1005.am.Handler;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Administrator
 */
public class DbUtils {
    private DruidDataSource dataSource;
    private Connection conn;
    private PreparedStatement ps;

    /**
     * 获取连接池（一个）
     * @throws Exception 。
     */
    private void getDataSource() throws Exception {
        if(dataSource==null){
            Properties prop=new Properties();
            prop.load(new FileReader("io/druid.properties"));
            dataSource=(DruidDataSource) DruidDataSourceFactory.createDataSource(prop);
        }
    }

    /**
     * 获取连接（一个）
     * @throws Exception 。
     */
    private void getConn() throws Exception {
        if(conn==null){
            getDataSource();
            conn=dataSource.getConnection();
        }
    }

    /**
     * 获取执行sql的对象
     * @param sql sql
     * @throws Exception 。
     */
    private void getPs(String sql) throws Exception {
        getConn();
        ps=conn.prepareStatement(sql);
    }

    /**
     * 替换占位符
     * @param params 可变长度参数
     * @throws SQLException 。
     */
    private void setParams(Object...params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i+1,params[i]);
        }
    }
    /**
     * 查(集合)
     * @param sql 要执行的sql语句
     * @param cls 字节码对象
     * @param params 可变长度参数
     * @return 集合
     * @param <E> 泛型方法
     */
    public <E> List<E> select(String sql, Class<E> cls, Object...params) throws Exception {
        getPs(sql);
        setParams(params);
        ResultSet set = ps.executeQuery();
        List<E> list=new ArrayList<>();
        ResultSetMetaData data = set.getMetaData();
        while (set.next()){
            E e = cls.getDeclaredConstructor().newInstance();
            for (int i = 0; i < data.getColumnCount(); i++) {
                String name = data.getColumnName(i);
                Field field = cls.getDeclaredField(name);
                field.setAccessible(true);
                field.set(e,set.getObject(i));
            }
            list.add(e);
        }
        set.close();
        return list;
    }
    public <E> E selectOne(String sql,Class<E> cls,Object...params) throws Exception {
        List<E> list = select(sql, cls, params);
        if(list!=null&& !list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

    /**
     * 增删改
     * @param sql 要执行的sql语句
     * @param params 可变长度参数
     * @return 执行结果
     * @throws Exception 。
     */
    public int update(String sql,Object...params) throws Exception {
        getPs(sql);
        setParams(params);
        return ps.executeUpdate();
    }

    /**
     * 关闭ps,conn,dataSource(DruidDataSource对象才有关闭方法)
     * @throws SQLException isClosed() close()产生的异常
     */
    public void close() throws SQLException {
        if(ps!=null&& !ps.isClosed()){
            ps.close();
            ps=null;
        }
        if(conn!=null&&!conn.isClosed()){
            conn.close();
            conn=null;
        }
        if(dataSource!=null&&!dataSource.isClosed()){
            dataSource.close();
            dataSource=null;
        }
    }
}
