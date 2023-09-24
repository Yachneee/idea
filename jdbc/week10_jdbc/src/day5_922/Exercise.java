package day5_922;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class Exercise {
    public static void main(String[] args) {
        List<Account> list=new ArrayList<>();
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //获取连接
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store?user=root&password=");
            //创建执行sql的对象
            Statement statement = con.createStatement()){
            //编写sql
            String sql="select * from account";
            //执行sql,有返回值
            ResultSet resultSet = statement.executeQuery(sql);
            //解析返回值
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String phone = resultSet.getString(2);
                String password = resultSet.getString(3);
                boolean type = resultSet.getBoolean(4);
                String name = resultSet.getString(5);
                int point = resultSet.getInt(6);
                double money = resultSet.getDouble(7);
                LocalDateTime time = (LocalDateTime)resultSet.getObject(8);
                list.add(new Account(id, phone, password, type, name, point, money, time));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        list.forEach(System.out::println);
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Account{
    private int id;
    private String phone;
    private String password;
    private boolean type;
    private String name;
    private int point;
    private double money;
    private LocalDateTime time;

}