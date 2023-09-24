package day5_922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Administrator
 */
public class JdbcDemo2 {
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
            String sql="delete from student where id=8 ";
            //5.执行sql，有返回值
            int i = statement.executeUpdate(sql);
            //6.解析返回值
            if(i>0){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
