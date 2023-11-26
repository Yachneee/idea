package com.kfm.ajax.controller;

import com.kfm.ajax.entity.Result;
import com.kfm.ajax.entity.SDept;
import com.kfm.ajax.service.SDeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

// 该类中所有请求都可以支持跨域访问
@CrossOrigin("*")
@Controller
public class SDeptController {
    @Resource
    private SDeptService sDeptService;
    @GetMapping("/list")
    @ResponseBody
    public Result list() {
        List<SDept> all = sDeptService.selectAll();
        if (all != null) {
            return Result.success("查询成功", all);
        }
        return Result.failure("查询失败");
    }
    @GetMapping("/")
    public String dept() {
        return "dept";
    }
}
