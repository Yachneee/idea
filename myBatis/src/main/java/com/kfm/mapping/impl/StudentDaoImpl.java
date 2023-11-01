package com.kfm.mapping.impl;

import com.kfm.entity.Student;
import com.kfm.mapping.StudentDao;
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
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectAll(){
        // 1. 加载配置文件
        try (InputStream in = Resources.getResourceAsStream("myBatis-config.xml")) {
            // UserInfoDaoImpl.class.getClassLoader().getResourceAsStream("myBatis-config.xml");
            // InputStream in = Resources.getResourceAsStream("myBatis-config.xml");
            // 2. 创建SqlSessionFactory构建者对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            // 3. 通过配置文件创建SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = builder.build(in);
            // 4. 通过SqlSessionFactory 创建SqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            // 5. 通过SqlSession对象执行sql
            // Statement 命名空间 + id --> statement
            return sqlSession.selectList("com.kfm.mapping.StudentDao.selectAll");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
