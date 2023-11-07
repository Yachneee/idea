package com.kfm.springBatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import cn.hutool.crypto.SecureUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Component
public class UserInfoService {
    @Autowired
    private UserInfoMapper mapper;

//    private SqlSession sqlSession;
//    private static final Logger logger = LogManager.getLogger(UserInfoController.class);
//    public UserInfoService(){
//        try(InputStream in=Resources.getResourceAsStream(Constant.BATIS_CONFIG)) {
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//            sqlSession = factory.openSession(true);
//            mapper = sqlSession.getMapper(UserInfoMapper.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//            logger.error("getResourceAsStream失败",e);
//        }
//    }
    public PageInfo<UserInfo> findAll(UserInfo userInfo,Integer pageNum,Integer pageSize){
        if(pageNum==null||pageNum<1){
            pageNum=1;
        }
        if(pageSize==null||pageSize<1){
            pageSize=5;
        }
        PageHelper.startPage(pageNum, pageSize);
        if(userInfo.getUsername()!=null){
            userInfo.setUsername("%"+userInfo.getUsername()+"%");
        }
        List<UserInfo> userInfos = mapper.selectByUserInfo(userInfo);
        return new PageInfo<>(userInfos);
    }
    public UserInfo findById(String id){
        return mapper.selectById(id);
    }
    public int add(UserInfo userInfo, MultipartFile f){
        setImgAndPass(userInfo,f);
        userInfo.setCreateDate(new Date());
        return mapper.insert(userInfo);
    }
    public int change(UserInfo userInfo,MultipartFile f){
        setImgAndPass(userInfo,f);
        userInfo.setUpdateDate(new Date());
        return mapper.update(userInfo);
    }
    public int delete(String id){
        return mapper.delete(id);
    }
//    public void close() throws IOException {
//        sqlSession.close();
//    }
    private void setImgAndPass(UserInfo userInfo,MultipartFile f){
        if(userInfo.getPassword()!=null){
            userInfo.setPassword(SecureUtil.md5(userInfo.getPassword()));
        }
        if(f==null){
            return;
        }
        String filename = f.getOriginalFilename()+"_"+System.currentTimeMillis();
        userInfo.setImg(Constant.IMG+filename);
        File file = new File(Constant.IMG_PATH, filename);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try(InputStream in = f.getInputStream();
            FileOutputStream out = new FileOutputStream(file)){
            in.transferTo(out);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
