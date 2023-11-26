package com.kfm.kfmBatis.controller;

import com.kfm.kfmBatis.entity.Result;
import com.kfm.kfmBatis.entity.Student;
import com.kfm.kfmBatis.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @GetMapping("/all")
    public Result all(){
        List<Student> students = studentService.selectAll();
        return students==null?Result.failure("查询失败"):Result.success("查询成功",students);
    }
    @GetMapping("/delete")
    public Result delete(Integer id){
        boolean delete = studentService.delete(id);
        return delete?Result.success("删除成功"):Result.failure("删除失败");
    }
    @PostMapping("/add")
    public Result add(@RequestBody Student s){
        boolean add = studentService.add(s);
        return add?Result.success("添加成功"):Result.failure("添加失败");
    }
    @PostMapping("/edit")
    public Result edit(@RequestBody Student s){
        boolean update = studentService.update(s);
        return update?Result.success("修改成功"):Result.failure("修改失败");
    }
}
