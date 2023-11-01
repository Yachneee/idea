package com.kfm.mapper.impl;

import com.kfm.entity.Teacher;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TeacherMapperImplTest {

    @Test
    public void selectAll() {
        TeacherMapperImpl mapper = new TeacherMapperImpl();
        List<Teacher> teachers = mapper.selectAll();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}