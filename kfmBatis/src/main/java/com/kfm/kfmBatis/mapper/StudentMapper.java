package com.kfm.kfmBatis.mapper;

import com.kfm.kfmBatis.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【student】的数据库操作Mapper
 * @createDate 2023-11-23 20:27:20
 * @Entity com/sign.entity.Student
 */
@Mapper
@CacheNamespace(blocking=true)
public interface StudentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAll();

    Student selectOne(Student s);

}
