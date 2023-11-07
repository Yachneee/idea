package com.kfm.kfmBatis.service;

import com.kfm.kfmBatis.entity.Emp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@Slf4j
@SpringBootTest
class EmpServiceTest {
    @Autowired
    private EmpService empService;

    @Test
    void findAllWithDept() {
        List<Emp> allWithDept = empService.findAllWithDept();
        if(allWithDept.isEmpty()){
            log.warn("查询失败");
        }else {
            log.info("查询成功");
        }
        for (Emp emp : allWithDept) {
            System.out.println(emp);
        }
    }
}