package com.kfm.mapper;

import com.kfm.entity.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class TeacherMapperTest {
    InputStream in;
    SqlSession sqlSession;
    TeacherMapper mapper;
    @Before
    public void setUp() throws Exception {
        in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession=factory.openSession(true);
        mapper=sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.close();
        in.close();
    }

    @Test
    public void selectAll() {
        List<Teacher> teachers = mapper.selectAll();
        teachers.forEach(System.out::println);
    }

    @Test
    public void selectById() {
        Teacher teacher = mapper.selectById(5);
        System.out.println(teacher);
    }

    @Test
    public void insert() {
        Teacher teacher = new Teacher();
        teacher.setName("test2");
        teacher.setGender("女");
        System.out.println("插入前-->"+teacher);
        int insert = mapper.insert(teacher);
        System.out.println(insert);
        System.out.println("插入后-->"+teacher);
    }
}