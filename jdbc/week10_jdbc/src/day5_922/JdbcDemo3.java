package day5_922;

import java.sql.*;

/**
 * @author Administrator
 */
public class JdbcDemo3 {
    public static void main(String[] args) {
        // 1. 注册驱动
        // DriverManager.registerDriver(new Driver());
        // 推荐  实现解耦   Driver 全限定类名
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //2.获取连接
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
             //3.创建执行sql的对象
             Statement statement = con.createStatement()) {
            //4.编写sql
            String sql="select * from student order by birth ";
            //5.执行sql，有返回值
            ResultSet resultSet = statement.executeQuery(sql);
//            while(resultSet.next()){
//                System.out.println(resultSet.getObject(2));
//            }
            //6.解析返回值
            ResultSetMetaData metaData = resultSet.getMetaData();
            while(resultSet.next()){
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.print(metaData.getColumnName(i)+":"+resultSet.getObject(i)+"\t");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
