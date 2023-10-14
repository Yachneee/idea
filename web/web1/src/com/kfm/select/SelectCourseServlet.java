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
@WebServlet("/selectCourse")
public class SelectCourseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try {
            Select.selectCourse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
