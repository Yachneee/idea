package day4_928;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Administrator
 */
public class C3P0Demo {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource source = new ComboPooledDataSource("c3p0-kfm");
        Connection con = source.getConnection();
        PreparedStatement prepared = con.prepareStatement("select t_name from courses");
        ResultSet resultSet = prepared.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("t_name"));
        }
    }
}
