package com.kfm.mapper;

import com.kfm.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class StudentMapperTest {
    InputStream in;
    SqlSession sqlSession;
    StudentMapper mapper;
    @Before
    public void setUp() throws Exception {
        in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession=factory.openSession();
        mapper=sqlSession.getMapper(StudentMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void selectAll() {
        List<Student> students = mapper.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void selectById() {
        Student student = mapper.selectById(1);
        System.out.println(student);
    }

    @Test
    public void insert() {
        Student student = new Student(20, "test", new Date(), "未知");
        int insert = mapper.insert(student);
        System.out.println(insert);
    }

    @Test
    public void update() {
        Student student = new Student(1, "赵雷", new Date(), "男");
        int update = mapper.update(student);
        System.out.println(update);
    }

    @Test
    public void delete() {
        int delete = mapper.delete(14);
        System.out.println(delete);
    }
}