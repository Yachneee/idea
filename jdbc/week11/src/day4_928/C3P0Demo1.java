package day4_928;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo1 {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ComboPooledDataSource source = new ComboPooledDataSource();
        source.setDriverClass("com.mysql.cj.jdbc.Driver");
        source.setJdbcUrl("jdbc:mysql://localhost:3306/kfm");
        source.setUser("root");
        source.setPassword("");
        source.setInitialPoolSize(10);
        Connection con = source.getConnection();
        System.out.println(con);
    }
}
