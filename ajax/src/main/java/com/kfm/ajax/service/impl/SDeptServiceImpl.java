package com.kfm.ajax.service.impl;

import com.kfm.ajax.entity.SDept;
import com.kfm.ajax.mapper.SDeptMapper;
import com.kfm.ajax.service.SDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SDeptServiceImpl implements SDeptService {
    @Resource
    private SDeptMapper sDeptMapper;
    @Override
    public List<SDept> selectAll() {
        return sDeptMapper.selectAll();
    }
}
