package com.kfm.mapping;

import com.kfm.entity.Student;

import java.util.List;

/**
 * @author Administrator
 */
public interface StudentDao {
    List<Student> selectAll();
}
