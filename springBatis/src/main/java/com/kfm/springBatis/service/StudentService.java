package com.kfm.springBatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kfm.springBatis.entity.Student;
import com.kfm.springBatis.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Administrator
 */
@Component
public class StudentService {
    @Autowired
    StudentMapper mapper;
//    public StudentService(){
//        try (InputStream in = Resources.getResourceAsStream("springBatis-config1.xml")) {
//            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory factory = builder.build(in);
//            SqlSession sqlSession = factory.openSession(true);
//            mapper = sqlSession.getMapper(StudentMapper.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public List<Student> findAll(){
        return mapper.selectAll();
    }
    public PageInfo<Student> findByStudent(Student student, Integer pageNum, Integer pageSize){
        if(pageNum==null||pageNum<1){
            pageNum=1;
        }
        if(pageSize==null||pageSize<1){
            pageSize=5;
        }
        PageHelper.startPage(pageNum, pageSize);
        if(student.getName()!=null){
            student.setName("%"+student.getName()+"%");
        }
        List<Student> students = mapper.selectByStudent(student);
        return new PageInfo<>(students);
    }
    public Student findById(int id){
        return mapper.selectById(id);
    }
    public int add(Student student){
        return mapper.insert(student);
    }
    public int change(Student student){
        return mapper.update(student);
    }
    public int remove(int id){
        return mapper.delete(id);
    }
}
