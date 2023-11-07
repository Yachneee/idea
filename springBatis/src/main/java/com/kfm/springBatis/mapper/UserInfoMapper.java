package com.kfm.springBatis.mapper;

import com.kfm.springBatis.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserInfoMapper {
    List<UserInfo> selectAll();
    UserInfo selectById(String id);
    List<UserInfo> selectByIds(String...ids);
    List<UserInfo> selectByUserInfo(UserInfo userInfo);
    int insert(UserInfo userInfo);
    int update(UserInfo userInfo);
    int delete(String id);
}
