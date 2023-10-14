package com.kfm.select;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/selectTeacher")
public class SelectTeacherServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try {
            Select.selectTeacher();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
