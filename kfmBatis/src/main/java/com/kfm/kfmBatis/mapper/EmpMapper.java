package com.kfm.kfmBatis.mapper;

import com.kfm.kfmBatis.entity.Emp;

import java.util.List;

/**
* @author Administrator
* @description 针对表【emp】的数据库操作Mapper
* @createDate 2023-11-06 16:28:46
* @Entity com/kfm/kfmBatis.entity.Emp
*/
public interface EmpMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Long id);
    List<Emp> selectAll();
    List<Emp> selectAllWithDept();

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

}
