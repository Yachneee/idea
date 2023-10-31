package com.kfm.boot1.mapper;


import com.kfm.boot1.entity.Student;
import com.kfm.boot1.utils.DataSourceUtil;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class StudentDao {
    private final BasicRowProcessor processor=new BasicRowProcessor(new GenerousBeanProcessor());
    private final QueryRunner RUN=new QueryRunner(DataSourceUtil.getDataSource());
    public int addStudent(String name,String birth,String gender) throws SQLException {
        String sql="insert into student(name,birth,gender) values(?,?,?)";
        return RUN.update(sql,name,birth,gender);
    }
    public int changeById(Student student) throws SQLException {
        StringBuilder sql=new StringBuilder("update student set ");
        List<Object> params=new ArrayList<>();
        if(student.getName()!=null){
            sql.append("name=?");
            params.add(student.getName());
        }
        if(student.getGender()!=null){
            sql.append(",gender=?");
            params.add(student.getGender());
        }
        if(student.getBirth()!=null){
            sql.append(",birth=?");
            params.add(student.getBirth());
        }
        String sql1=sql+"where id = ?";
        params.add(student.getId());
        return RUN.update(sql1,params.toArray());
    }
    public List<Student> selectAll() throws SQLException {
        String sql="select * from student";
        return RUN.query(sql,new BeanListHandler<>(Student.class,processor));
    }
    public int deleteById(int id) throws SQLException {
        String sql="delete from student where id=?";
        return RUN.update(sql,id);
    }
    public Student selectById(int id) throws SQLException {
        String sql="select * from student where id=?";
        return RUN.query(sql,new BeanHandler<>(Student.class,processor),id);
    }
    public Student selectOne(String name,String birth,String gender) throws SQLException {
        String sql="select * from student where name=? and birth=? and gender=?";
        return RUN.query(sql,new BeanHandler<>(Student.class,processor),name,birth,gender);
    }

    public List<Student> selectPage(Integer pageNum, Integer pageSize) throws SQLException {
        String sql="select * from student limit ?,?";
        return RUN.query(sql,new BeanListHandler<>(Student.class,processor),(pageNum-1)*pageSize,pageSize);
    }
    public long selectTotal() throws SQLException {
        String sql = "select count(*) from student";
        return RUN.query(sql, new ScalarHandler<>());
    }
}
