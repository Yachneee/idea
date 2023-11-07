package com.kfm.springBatis.controller;
import com.github.pagehelper.PageInfo;
import com.kfm.springBatis.entity.Student;
import com.kfm.springBatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author Administrator
 */
@Controller
public class StudentController {
//    private final StudentService studentService=new StudentService();
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student/all")
    public ModelAndView mv(Student student,Integer pageNum,Integer pageSize) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student/all");
        PageInfo<Student> page = studentService.findByStudent(student, pageNum, pageSize);
        modelAndView.addObject("page", page);
        modelAndView.addObject("condition",student);
        return modelAndView;
    }
    @RequestMapping("/student/edit")
    public String edit(Student student, RedirectAttributes attributes){
        if(student.getId()==null){
            attributes.addFlashAttribute("msg","没有获取到id");
        }else{
            int change = studentService.change(student);
            if(change>0){
                attributes.addFlashAttribute("msg","修改成功");
            }else{
                attributes.addFlashAttribute("msg","修改失败");
            }
        }
        return "redirect:/student/all";
    }
    @GetMapping("/student/add")
    public String add(){
        return "student/add";
    }
    @RequestMapping("/student/add")
    public String add(Student student, RedirectAttributes attributes){
        if(student.getName()==null|| student.getName().isEmpty()){
            attributes.addFlashAttribute("msg","姓名不能为空");
        }else{
            int add = studentService.add(student);
            if(add>0){
                attributes.addFlashAttribute("msg","添加成功");
            }else{
                attributes.addFlashAttribute("msg","添加失败");
            }
        }
        return "redirect:/student/all";
    }
    @GetMapping("/student/delete")
    public String delete(int id,RedirectAttributes attributes){
        int remove = studentService.remove(id);
        if(remove>0){
            attributes.addFlashAttribute("msg","删除成功");
        }else{
            attributes.addFlashAttribute("msg","删除失败");
        }
        return "redirect:/student/all";
    }
}
