package day4_1005.pm;

import day4_1005.am.Student;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class QueryRunnerDemo2 {
    public static void main(String[] args) throws SQLException {
        QueryRunner runner = new QueryRunner();
        boolean b = DbUtils.loadDriver("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kfm","root","");
        List<Student> studentList = runner.query(con, "select * from students", new BeanListHandler<>(Student.class));
        studentList.forEach(System.out::println);
        DbUtils.close(con);
    }
}
