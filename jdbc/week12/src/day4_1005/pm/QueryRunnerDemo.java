package day4_1005.pm;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import day4_1005.am.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import javax.sql.DataSource;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Administrator
 */
public class QueryRunnerDemo {
    public static void main(String[] args) throws Exception {
        QueryRunner queryRunner = new QueryRunner(getDataSource());
        String sql="select * from students";
        System.out.println("\033[35mnew BeanHandler<>(Student.class)\033[0m");
        Student student = queryRunner.query(sql, new BeanHandler<>(Student.class));
        System.out.println(student);
        System.out.println("\033[35mnew BeanListHandler<>(Student.class)\033[0m");
        List<Student> studentList = queryRunner.query(sql, new BeanListHandler<>(Student.class));
        System.out.println(studentList);
        System.out.println("\033[35mnew ArrayHandler()\033[0m");
        Object[] objects = queryRunner.query(sql, new ArrayHandler());
        System.out.println(Arrays.toString(objects));
        System.out.println("\033[35mnew ArrayListHandler()\033[0m");
        List<Object[]> objectsList = queryRunner.query(sql, new ArrayListHandler());
        objectsList.forEach(o-> System.out.println(Arrays.toString(o)));
        System.out.println("\033[35mnew ColumnListHandler<>(\"id\")\033[0m");
        List<Integer> idList = queryRunner.query(sql, new ColumnListHandler<>("id"));
        System.out.println(idList);
        System.out.println("\033[35mnew MapHandler()\033[0m");
        Map<String, Object> firstMap = queryRunner.query(sql, new MapHandler());
        System.out.println(firstMap);
        System.out.println("\033[35mnew MapListHandler()\033[0m");
        List<Map<String, Object>> mapList = queryRunner.query(sql, new MapListHandler());
        mapList.forEach(System.out::println);
        System.out.println("\033[35mnew KeyedHandler<>(1)\033[0m");
        Map<Integer, Map<String, Object>> mapMap = queryRunner.query(sql, new KeyedHandler<>(1));
        mapMap.forEach((id,map)-> System.out.println(id+"-->"+map));
        System.out.println("\033[35mnew ScalarHandler<>()---count(*)\033[0m");
        String only="select count(*) from students";
        Long count = queryRunner.query(only, new ScalarHandler<>());
        System.out.println(count);
    }
    private static DataSource getDataSource() throws Exception {
        Properties prop=new Properties();
        prop.load(new FileReader("io/druid.properties"));
        return DruidDataSourceFactory.createDataSource(prop);
    }
}
