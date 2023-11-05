package com.kfm.springBatis.mapper;

import com.kfm.springBatis.entity.UserInfo;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserInfoMapper {
    List<UserInfo> selectAll();
    UserInfo selectById(String id);
    List<UserInfo> selectByIds(String...ids);
    UserInfo selectByUserInfo(UserInfo userInfo);
    int insert(UserInfo userInfo);
//    int update(UserInfo userInfo);
    int delete(String id);
}
