package day4_1005.am;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
public class DbUtilsTest {
    public static void main(String[] args) throws Exception {
        DbUtils dbUtils=new DbUtils();
        List<Student> students = dbUtils.select("select * from students", new Student.StudentHandler());
        System.out.println(students);
        Student student = dbUtils.selectOne("select * from students where id= ?", new Student.StudentHandler(), 1);
        System.out.println(student);
        Account account = dbUtils.selectOne("select * from account where id=?", set -> {
            Account acc= new Account();
            acc.setId(set.getInt("id"));
            acc.setBalance(set.getDouble("balance"));
            acc.setName(set.getString("name"));
            return acc;
        }, 1);
        System.out.println(account);
        dbUtils.close();
    }
}
