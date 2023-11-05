package com.kfm.springBatis.mapper;

import com.kfm.springBatis.entity.UserInfo;
import com.kfm.springBatis.utils.Constant;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class UserInfoMapperTest {
    private UserInfoMapper mapper;

    private SqlSession sqlSession;
    private static final Logger logger = LogManager.getLogger(UserInfoMapperTest.class);
    @Before
    public void setUp() throws Exception {
        try(InputStream in= Resources.getResourceAsStream(Constant.BATIS_CONFIG)) {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = factory.openSession(true);
            mapper = sqlSession.getMapper(UserInfoMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("getResourceAsStream失败",e);
        }
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.close();
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void selectById() {
        List<UserInfo> userInfos = mapper.selectByIds("34a2d2ab2ee946a49ab4a87e7f16cfb6", "7afea3df1a3b4cc5bdf1", "7afea3df1a3b4cc5bdfcd57bfee62046");
        System.out.println(userInfos);
    }

    @Test
    public void selectByIds() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void selectByUserInfo() {
        new UserInfo();
    }
}