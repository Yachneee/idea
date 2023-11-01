package com.kfm.mapper;

import com.kfm.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAll();
    Teacher selectById(int id);
}
