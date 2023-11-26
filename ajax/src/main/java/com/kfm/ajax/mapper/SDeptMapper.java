package com.kfm.ajax.mapper;

import com.kfm.ajax.entity.SDept;

import java.util.List;

/**
* @author Administrator
* description 针对表【s_dept】的数据库操作Mapper
* createDate 2023-11-15 21:26:38
* Entity com/kfm/ajax.entity.SDept
*/
public interface SDeptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SDept record);

    int insertSelective(SDept record);

    SDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SDept record);

    int updateByPrimaryKey(SDept record);
    List<SDept> selectAll();

}
