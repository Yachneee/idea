package day5_922;

import java.sql.*;

/**
 * @author Administrator
 */
public class JdbcDemo1 {
    public static void main(String[] args) {
        Connection con=null;
        Statement statement=null;
        try {
            //2.注册
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //3.连接
            String url="jdbc:mysql://localhost:3306/school";
            con = DriverManager.getConnection(url, "root", "");
            //4.创建执行sql的对象
            statement = con.createStatement();
            //5.编写sql
            String sql="insert into student(name,birth,gender) values ('雷震子','1970-12-03','男')";
            //6.执行sql，有返回值
            int result = statement.executeUpdate(sql);
            //7.解析返回值
            if(result>0){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
