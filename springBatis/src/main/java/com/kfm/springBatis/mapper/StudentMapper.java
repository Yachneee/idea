package com.kfm.springBatis.mapper;


import com.kfm.springBatis.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface StudentMapper {

    List<Student> selectAll();
    List<Student> selectByStudent(Student student);
    Student selectById(int id);
    int insert(Student student);
    int update(Student student);
    int delete(int id);
}
