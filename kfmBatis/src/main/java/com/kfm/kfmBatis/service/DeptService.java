package com.kfm.kfmBatis.service;

import com.kfm.kfmBatis.entity.Dept;

import java.util.List;


public interface DeptService {

    List<Dept> findAllWithEmp();
}
