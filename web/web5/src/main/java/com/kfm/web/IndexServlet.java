package com.kfm.web;

import com.kfm.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object user = session.getAttribute(Constant.LOGIN_USER_KEY);
        if(user==null){
            resp.sendRedirect("/login");
            return;
        }
        req.getRequestDispatcher("hello.jsp").forward(req,resp);
    }
}
