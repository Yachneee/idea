package com.kfm.boot1.service;


import com.kfm.boot1.entity.Page;
import com.kfm.boot1.entity.Student;
import com.kfm.boot1.mapper.StudentDao;
import com.kfm.boot1.utils.FormatUtil;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
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
     * @param name 姓名
     * @param birth 生日
     * @param gender 性别
     * @return 影响行数
     */
    public int addStudent(String name,String birth,String gender){
        if(name==null||birth==null||gender==null){
            return -1;
        }
        String date = FormatUtil.timeFormat(birth);
        try {
            return studentDao.addStudent(name,date,gender);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * 修改学生信息
     * @param id 编号
     * @param name 姓名
     * @param birth 生日
     * @param gender 性别
     * @return 影响行数
     */
    public int changeStudent(int id,String name,String birth,String gender){
        try {
            Date sqlDate = FormatUtil.toSqlDate(birth);
            return studentDao.changeById(new Student(id,name,sqlDate,gender));
        } catch (ParseException|NumberFormatException|SQLException e) {
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
     * @param name 姓名
     * @param birth 生日
     * @param gender 性别
     * @return 查询结果
     */
    public Student selectOne(String name,String birth,String gender){
        String s = FormatUtil.timeFormat(birth);
        try {
            return studentDao.selectOne(name,s,gender);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Page<Student> selectPage(Integer pageNum, Integer pageSize) {
        try {
            if(pageNum==null){
                pageNum=1;
            }
            if(pageSize==null){
                pageSize=5;
            }
            List<Student> students = studentDao.selectPage(pageNum,pageSize);
            return new Page<>(pageNum, pageSize, findTotal(), students);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public long findTotal() {
        try {
            return studentDao.selectTotal();
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
