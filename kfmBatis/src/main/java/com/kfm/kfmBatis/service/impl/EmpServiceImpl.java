package com.kfm.kfmBatis.service.impl;

import com.kfm.kfmBatis.entity.Emp;
import com.kfm.kfmBatis.mapper.EmpMapper;
import com.kfm.kfmBatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    public List<Emp> findAllWithDept(){
        return empMapper.selectAllWithDept();
    }
}
