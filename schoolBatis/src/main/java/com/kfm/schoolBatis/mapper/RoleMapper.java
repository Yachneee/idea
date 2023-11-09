package com.kfm.schoolBatis.mapper;

import com.kfm.schoolBatis.entity.Role;

import java.util.List;

/**
* @author Administrator
* @description 针对表【role】的数据库操作Mapper
* @createDate 2023-11-07 19:15:20
* @Entity com/kfm/schoolBatis.entity.Role
*/
public interface RoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);
    List<Role> selectAll();
    List<Role> selectAll1();
    List<Role> selectByUid(Integer uid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
