package com.kfm.mapper;

import com.kfm.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> selectAll();
    Student selectById(int id);
    int insert(Student student);
    int update(Student student);
    int delete(int id);
}
