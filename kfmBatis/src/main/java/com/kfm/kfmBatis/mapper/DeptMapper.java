package com.kfm.kfmBatis.mapper;

import com.kfm.kfmBatis.entity.Dept;

import java.util.List;

/**
 * @author Administrator
 * &#064;description  针对表【dept】的数据库操作Mapper
 * &#064;createDate  2023-11-06 16:27:46
 * &#064;Entity  com/kfm/kfmBatis.entity.Dept
 */
public interface DeptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptNo);

    List<Dept> selectAll();
    List<Dept> selectAllWithEmp();

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

}
