package day5_922;

import java.sql.*;

/**
 * @author Administrator
 */
public class JdbcDemo1 {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url="jdbc:mysql://localhost:3306/kfm";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement statement = con.createStatement();
            String sql="insert into";
            ResultSet resultSet = statement.executeUpdate(sql);
            resultSet.

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
