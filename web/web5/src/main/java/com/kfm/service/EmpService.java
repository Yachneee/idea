package com.kfm.service;

import com.kfm.entity.Employee;
import com.kfm.mapping.EmpDao;

import java.sql.SQLException;
import java.util.List;

public class EmpService {
    private final EmpDao empDao = new EmpDao();
    public int deleteEmp(String id) {
        if(id.isEmpty()){
            return 0;
        }
        try {
            return empDao.deleteById(Integer.parseInt(id));
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public List<Employee> selectAll() {
        try {
            return empDao.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Employee selectById(String id) {
        try {
            return empDao.selectById(Integer.parseInt(id));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
