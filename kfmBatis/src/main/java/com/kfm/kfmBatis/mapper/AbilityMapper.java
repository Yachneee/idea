package com.kfm.kfmBatis.mapper;

import com.kfm.kfmBatis.entity.Ability;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ability】的数据库操作Mapper
* @createDate 2023-11-24 20:25:36
* @Entity com/kfm/kfmBatis.entity.Ability
*/
public interface AbilityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Ability record);

    int insertSelective(Ability record);

    Ability selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ability record);

    int updateByPrimaryKey(Ability record);
    List<Ability> selectByRoleId(Integer roleId);

}
