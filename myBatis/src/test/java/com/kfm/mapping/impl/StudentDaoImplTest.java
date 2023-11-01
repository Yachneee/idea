package com.kfm.mapping.impl;

import com.kfm.entity.Student;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentDaoImplTest {

    @Test
    public void selectAll() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}