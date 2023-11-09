package com.kfm.schoolBatis.mapper;

import com.kfm.schoolBatis.entity.User;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2023-11-07 19:14:58
 * @Entity com/kfm/schoolBatis.entity.User
 */
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    User selectOne(User user);

    User selectOne1(User user);

    List<User> selectAll();

    List<User> selectAll1();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    int updateLastLoginTime(User user);

    List<User> selectByRid(Integer rid);

}
