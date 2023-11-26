package com.kfm.kfmBatis.service.impl;

import com.kfm.kfmBatis.entity.Student;
import com.kfm.kfmBatis.mapper.StudentMapper;
import com.kfm.kfmBatis.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author Yachne
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper mapper;
    @Override
    public List<Student> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public Student selectOne(Student s) {
        return mapper.selectOne(s);
    }

    @Override
    public boolean add(Student s) {
        int insert = mapper.insertSelective(s);
        return insert>0;
    }

    @Override
    public boolean update(Student s) {
        int i = mapper.updateByPrimaryKeySelective(s);
        return i>0;
    }

    @Override
    public boolean delete(Integer id) {
        int i = mapper.deleteByPrimaryKey(id);
        return i>0;
    }
}
