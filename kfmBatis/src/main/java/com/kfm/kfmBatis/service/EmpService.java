package com.kfm.kfmBatis.service;

import com.kfm.kfmBatis.entity.Emp;


import java.util.List;


public interface EmpService {

    List<Emp> findAllWithDept();
}
