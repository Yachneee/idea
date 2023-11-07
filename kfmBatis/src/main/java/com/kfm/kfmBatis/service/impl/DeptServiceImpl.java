package com.kfm.kfmBatis.service.impl;

import com.kfm.kfmBatis.entity.Dept;
import com.kfm.kfmBatis.mapper.DeptMapper;
import com.kfm.kfmBatis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @author Administrator
 */
@Component
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper mapper;
    public List<Dept> findAllWithEmp(){
        return mapper.selectAllWithEmp();
    }
}
