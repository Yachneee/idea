package day4_928;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        Properties pro=new Properties();
        pro.load(new FileReader("io/druid.properties"));
        DataSource source = DruidDataSourceFactory.createDataSource(pro);
        Connection con = source.getConnection();
        System.out.println(con);
        String sql="select * from account";
        PreparedStatement prepared = con.prepareStatement(sql);
        ResultSet resultSet = prepared.executeQuery();
        while(resultSet.next()){
            for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
                System.out.print(resultSet.getObject(i+1)+"\t");
            }
            System.out.println();
        }
        con.close();
    }
}
