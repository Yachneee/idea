package day4_1005.am;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String tel;
    private String loc;
    public static class StudentHandler implements Handler<Student>{

        @Override
        public Student handle(ResultSet set) throws SQLException {
            Student student = new Student();
            student.setId(set.getInt("id"));
            student.setName(set.getString("name"));
            student.setTel(set.getString("tel"));
            student.setLoc(set.getString("loc"));
            return student;
        }
    }
}
