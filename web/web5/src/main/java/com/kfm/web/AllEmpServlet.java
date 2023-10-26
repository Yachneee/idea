package com.kfm.web;

import com.kfm.entity.Employee;
import com.kfm.service.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Administrator
 */
@WebServlet("/all")
public class AllEmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmpService empService = new EmpService();
        List<Employee> employees = empService.selectAll();
        req.setAttribute("all",employees);
        req.getRequestDispatcher("/WEB-INF/emp.jsp").forward(req,resp);
    }
}
