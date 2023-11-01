package com.kfm.boot.mapper;


import com.kfm.boot.entity.Student;
import com.kfm.boot.utils.DataSourceUtil;
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
    public int addStudent(Student student) throws SQLException {
        StringBuilder sql=new StringBuilder("insert into student(");
        StringBuilder values=new StringBuilder(" values(");
        List<Object> params=new ArrayList<>();
        if(student.getId()!=null){
            sql.append("id,");
            values.append("?,");
            params.add(student.getId());
        }
        if(student.getName()!=null){
            sql.append("name,");
            values.append("?,");
            params.add(student.getName());
        }
        if(student.getGender()!=null){
            sql.append("gender,");
            values.append("?,");
            params.add(student.getGender());
        }
        if(student.getBirth()!=null){
            sql.append("birth,");
            values.append("?,");
            params.add(student.getBirth());
        }
        String sql1=sql.substring(0,sql.length()-1)+")"+values.substring(0,values.length()-1)+")";
        return RUN.update(sql1,params.toArray());
    }
    public int changeById(Student student) throws SQLException {
        StringBuilder sql=new StringBuilder("update student set ");
        List<Object> params=new ArrayList<>();
        if(student.getName()!=null){
            sql.append("name=?,");
            params.add(student.getName());
        }
        if(student.getGender()!=null){
            sql.append("gender=?,");
            params.add(student.getGender());
        }
        if(student.getBirth()!=null){
            sql.append("birth=?,");
            params.add(student.getBirth());
        }
        String sql1=sql.substring(0,sql.length()-1)+" where id = ?";
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
    public Student selectOne(Student student) throws SQLException {
        String sql="select * from student";
        StringBuilder condition=new StringBuilder();
        List<Object> params = new ArrayList<>();
        if(student.getId()!=null){
            condition.append(" where id=?");
            params.add(student.getId());
        }
        if(student.getName()!=null&&!student.getName().isEmpty()){
            if(condition.isEmpty()){
                condition.append(" where name=?");
            }else {
                condition.append(" and name=?");
            }
            params.add(student.getName());
        }
        if (student.getBirth()!=null){
            if(condition.isEmpty()){
                condition.append(" where birth=?");
            }else {
                condition.append(" and birth=?");
            }
            params.add(student.getBirth());
        }
        if (student.getGender()!=null && !student.getGender().isEmpty()){
            if (condition.isEmpty()){
                condition.append(" where gender=?");
            }else {
                condition.append(" and gender=?");
            }
            params.add(student.getGender());
        }
        sql+=condition;
        return RUN.query(sql,new BeanHandler<>(Student.class,processor),params.toArray());
    }

    public List<Student> selectPage(Integer pageNum, Integer pageSize,Student student) throws SQLException {
        String sql="select * from student";
        StringBuilder condition=new StringBuilder();
        List<Object> params = new ArrayList<>();
        if(student.getId()!=null){
            condition.append(" where id=?");
            params.add(student.getId());
        }
        if(student.getName()!=null&&!student.getName().isEmpty()){
            if(condition.isEmpty()) {
                condition.append(" where name like '%").append(student.getName()).append("%'");
            }else {
                condition.append(" and name like '%").append(student.getName()).append("%'");
            }
        }
        if (student.getBirth()!=null){
            if(condition.isEmpty()){
                condition.append(" where birth=?");
            }else {
                condition.append(" and birth=?");
            }
            params.add(student.getBirth());
        }
        if (student.getGender()!=null && !student.getGender().isEmpty()){
            if (condition.isEmpty()){
                condition.append(" where gender=?");
            }else {
                condition.append(" and gender=?");
            }
            params.add(student.getGender());
        }
        condition.append(" limit ?,?");
        sql+=condition;
        params.add((pageNum-1)*pageSize);
        params.add(pageSize);
        return RUN.query(sql,new BeanListHandler<>(Student.class,processor),params.toArray());
    }
    public long selectTotal(Student student) throws SQLException {
        String sql = "select count(*) from student";
        StringBuilder condition=new StringBuilder();
        List<Object> params = new ArrayList<>();
        if(student.getId()!=null){
            condition.append(" where id=?");
            params.add(student.getId());
        }
        if(student.getName()!=null&&!student.getName().isEmpty()){
            if(condition.isEmpty()) {
                condition.append(" where name like '%").append(student.getName()).append("%'");
            }else {
                condition.append(" and name like '%").append(student.getName()).append("%'");
            }
        }
        if (student.getBirth()!=null){
            if(condition.isEmpty()){
                condition.append(" where birth=?");
            }else {
                condition.append(" and birth=?");
            }
            params.add(student.getBirth());
        }
        if (student.getGender()!=null && !student.getGender().isEmpty()){
            if (condition.isEmpty()){
                condition.append(" where gender=?");
            }else {
                condition.append(" and gender=?");
            }
            params.add(student.getGender());
        }
        sql+=condition;
        return RUN.query(sql, new ScalarHandler<>(),params.toArray());
    }
}
