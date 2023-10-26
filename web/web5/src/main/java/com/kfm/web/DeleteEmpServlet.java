package com.kfm.web;

import com.kfm.entity.Employee;
import com.kfm.service.EmpService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/deleteEmp")
public class DeleteEmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmpService empService = new EmpService();
        String id = req.getParameter("id");
        Employee employee = empService.selectById(id);
        int i = empService.deleteEmp(id);
        if(i>0){
            req.setAttribute("msg",employee.getFirstName()+"删除成功");
        }else {
            req.setAttribute("msg",employee.getFirstName()+"删除失败");
        }
        req.getRequestDispatcher("/all").forward(req,resp);
    }
}
