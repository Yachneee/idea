package com.kfm.kfmBatis.controller;

import com.kfm.kfmBatis.entity.Emp;
import com.kfm.kfmBatis.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Administrator
 */
@Slf4j
@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/all")
    @ResponseBody
    public List<Emp> findAllWithDept() {
        return empService.findAllWithDept();
    }
    @GetMapping("/list")
    public ModelAndView findAllWithDept2() {
        ModelAndView modelAndView = new ModelAndView("emp/all");
        List<Emp> empList = empService.findAllWithDept();
        if (empList.isEmpty()) {
            log.warn("查询失败");
        }else {
            log.info("查询成功");
        }
        modelAndView.addObject("list",empList);
        return modelAndView;
    }
}
