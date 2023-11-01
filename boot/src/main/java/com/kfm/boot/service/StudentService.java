package com.kfm.boot.service;


import com.kfm.boot.entity.Page;
import com.kfm.boot.entity.Student;
import com.kfm.boot.mapper.StudentDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
public class StudentService {
    private final StudentDao studentDao=new StudentDao();

    /**
     * 查询所有学生
     * @return List<Student>
     */
    public List<Student> selectAll(){
        try {
            return studentDao.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 添加学生
     * @param student 学生
     * @return 影响行数
     */
    public int addStudent(Student student){
        if(student.getName()==null||student.getGender()==null||student.getBirth()==null){
            return -1;
        }
        try {
            return studentDao.addStudent(student);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 修改学生信息
     * @param student 学生
     * @return 影响行数
     */
    public int changeStudent(Student student){
        try {
            return studentDao.changeById(student);
        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 根据id删除学生
     * @param id 学生id
     * @return 影响行数
     */
    public int deleteById(String id){
        int i = Integer.parseInt(id);
        try {
            return studentDao.deleteById(i);
        } catch (SQLException|NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 根据id查询学生
     * @param id 编号
     * @return 查询结果，没有->null
     */
    public Student selectById(String id){
        int i = Integer.parseInt(id);
        try {
            return studentDao.selectById(i);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 通过姓名，生日，性别查找学生
     * @param student 学生
     * @return 查询结果
     */
    public Student selectOne(Student student){
        try {
            return studentDao.selectOne(student);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Page<Student> selectPage(Integer pageNum, Integer pageSize, Student student) {
        try {
            if(pageNum==null){
                pageNum=1;
            }
            if(pageSize==null){
                pageSize=5;
            }
            List<Student> students = studentDao.selectPage(pageNum,pageSize,student);
            return new Page<>(pageNum, pageSize, findTotal(student), students);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public long findTotal(Student student) {
        try {
            return studentDao.selectTotal(student);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
