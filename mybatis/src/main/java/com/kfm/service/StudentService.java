package com.kfm.service;

import com.kfm.entity.Student;
import com.kfm.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Administrator
 */
public class StudentService {
    StudentMapper mapper;
    public StudentService(){
        try (InputStream in = Resources.getResourceAsStream("mybatis-config.xml")) {
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            SqlSession sqlSession = factory.openSession();
            mapper = sqlSession.getMapper(StudentMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Student> findAll(){
        return mapper.selectAll();
    }
    public Student findById(int id){
        return mapper.selectById(id);
    }
}
