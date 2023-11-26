package com.kfm.kfmBatis.service;


import com.kfm.kfmBatis.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();
    Student selectOne(Student s);
    boolean add(Student s);
    boolean update(Student s);
    boolean delete(Integer id);
}
