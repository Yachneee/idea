package com.kfm.kfmBatis.controller;

import com.kfm.kfmBatis.entity.Dept;
import com.kfm.kfmBatis.service.DeptService;
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
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/all")
    @ResponseBody
    public List<Dept> findAllWithEmp(){
        return deptService.findAllWithEmp();
    }
    @GetMapping("/list")
    public ModelAndView findAllWithEmp2(){
        ModelAndView modelAndView = new ModelAndView("dept/all");
        List<Dept> deptList = deptService.findAllWithEmp();
        if(!deptList.isEmpty()){
            log.info("查询成功");
        }else {
            log.warn("查询失败");
        }
        modelAndView.addObject("list",deptList);
        return modelAndView;
    }
}
