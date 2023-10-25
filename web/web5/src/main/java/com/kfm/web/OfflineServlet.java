package com.kfm.web;

import com.kfm.utils.Constant;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 */
@WebServlet("/offline")
public class OfflineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        ServletContext context = req.getServletContext();
        ConcurrentHashMap<String, HttpSession> map = (ConcurrentHashMap<String, HttpSession>) context.getAttribute(Constant.ONLINE_USER_KEY);
        HttpSession s = map.remove(id);
        if(s!=null){
            s.invalidate();
        }
        resp.sendRedirect("/online");
    }
}
