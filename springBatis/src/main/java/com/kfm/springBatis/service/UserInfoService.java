package com.kfm.springBatis.service;

import cn.hutool.crypto.SecureUtil;
import com.kfm.springBatis.controller.UserInfoController;
import com.kfm.springBatis.entity.UserInfo;
import com.kfm.springBatis.mapper.UserInfoMapper;
import com.kfm.springBatis.utils.Constant;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Administrator
 */
public class UserInfoService {
    private UserInfoMapper mapper;

    private SqlSession sqlSession;
    private static final Logger logger = LogManager.getLogger(UserInfoController.class);
    public UserInfoService(){
        try(InputStream in=Resources.getResourceAsStream(Constant.BATIS_CONFIG)) {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            sqlSession = factory.openSession(true);
            mapper = sqlSession.getMapper(UserInfoMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("getResourceAsStream失败",e);
        }
    }
    public List<UserInfo> findAll(){
        return mapper.selectAll();
    }
    public UserInfo findById(String id){
        return mapper.selectById(id);
    }
    public int insert(UserInfo userInfo){
        userInfo.setPassword(SecureUtil.md5(userInfo.getPassword()));
        return mapper.insert(userInfo);
    }
//    public int update(UserInfo userInfo){
//        return mapper.update(userInfo);
//    }
    public int delete(String id){
        return mapper.delete(id);
    }
    public void close() throws IOException {
        sqlSession.close();
    }
}
