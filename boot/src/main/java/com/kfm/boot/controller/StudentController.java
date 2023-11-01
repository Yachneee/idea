package com.kfm.boot.controller;


import com.kfm.boot.entity.Page;
import com.kfm.boot.entity.Student;
import com.kfm.boot.service.StudentService;
import com.kfm.boot.utils.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class StudentController {
    private final StudentService studentService = new StudentService();

    @RequestMapping("/all")
    public ModelAndView mv() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("all");
        List<Student> students = studentService.selectAll();
        modelAndView.addObject("students", students);
        return modelAndView;
    }

    // 参数 第几页 一页多少条
    @RequestMapping("/listPage")
    public ModelAndView getPage(Integer pageNum, Integer pageSize, Student student) {
        // 总数/每页的数量
        Page<Student> page = studentService.selectPage(pageNum, pageSize, student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("page", page);
        // 传递查询条件
        mv.addObject("condition", student);
        mv.setViewName("page");
        // 返回这个页面 thymeleaf 会去 templates 中找对应的html
        return mv;
    }

    @GetMapping("/add")
    public String addStudent() {
        return "add";
    }

    @PostMapping("/add")
    public String addStudent(Student student, RedirectAttributes redirectAttributes) {
        Student s = studentService.selectOne(student);
        if (s != null) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "学生" + s.getName() + "已添加，请勿重复添加");
            return "redirect:/add";
        }
        int i = studentService.addStudent(student);
        if (i > 0) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "添加学生成功");
            return "redirect:/listPage";
        } else {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "添加学生失败");
            return "redirect:/add";
        }
    }

    /**
     * /change去change.html页面的同时将student存储在request域
     *
     * @param id      学生编号
     * @param session session
     *                model Model对象主要用于存储视图需要的数据，这些数据可以在视图渲染时被获取和使用。是一个Spring MVC的接口，用于在控制器（Controller）和视图（View）之间传递数据。
     * @return 页面
     */
    @GetMapping("/change")
    public String changeStudent(String id, HttpSession session) {
        Student student = studentService.selectById(id);
        session.setAttribute("student", student);
        return "change";
    }

    @PostMapping("/change")
    public String changeStudent(Student student, RedirectAttributes redirectAttributes, HttpSession session) {
        Student s = (Student) session.getAttribute("student");
        student.setId(s.getId());
        int i = studentService.changeStudent(student);
        if (i > 0) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "修改学生信息成功");
            session.removeAttribute("student");
            return "redirect:/listPage";
        } else {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "修改学生信息失败");
            return "redirect:/change";
        }
    }

    @GetMapping("/delete")
    public String deleteStudent(String id, RedirectAttributes redirectAttributes) {
        Student student = studentService.selectById(id);
        int i = studentService.deleteById(id);
        if (i > 0) {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "删除学生 " + student.getName() + "成功");
        } else {
            redirectAttributes.addFlashAttribute(Constant.MESSAGE_KEY, "删除学生 " + student.getName() + "失败");
        }
        return "redirect:/listPage";
    }
}
