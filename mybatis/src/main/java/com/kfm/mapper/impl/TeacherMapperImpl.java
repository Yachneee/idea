package com.kfm.mapper.impl;

import com.kfm.entity.Teacher;
import com.kfm.mapper.TeacherMapper;
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
public class TeacherMapperImpl{
//    @Override
    public List<Teacher> selectAll() {
        try (InputStream in = Resources.getResourceAsStream("mybatis-config.xml")) {
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            try (SqlSession sqlSession = factory.openSession()) {
                return sqlSession.selectList("com.kfm.mapper.TeacherMapper.selectAll");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

//    @Override
    public Teacher selectById(int id) {
        return null;
    }
}
