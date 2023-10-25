package com.kfm.web;

import com.kfm.entity.User;
import com.kfm.utils.Constant;

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
@WebServlet("/online")
public class OnlineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        ConcurrentHashMap<String, HttpSession> online = (ConcurrentHashMap<String, HttpSession>)req.getServletContext().getAttribute(Constant.ONLINE_USER_KEY);
        int size = online.size();
        resp.getWriter().write("<h1 style='color: blueviolet'>当前在线人数为："+size+"</h1>");
        StringBuilder html = new StringBuilder("<table><tr>").append("<td>id</td>").append("<td>用户名</td>").append("<td>操作</td>").append("</tr>");
        online.forEach((k,v)->{
            User user = (User)v.getAttribute(Constant.LOGIN_USER_KEY);
            String link= "<a href='/offline?id="+k+"' style='color:red'>强制下线</a>";
            html.append("<tr>").append("<td>").append(k).append("</td>")
                    .append("<td>").append(user.getUsername()).append("</td>")
                    .append("<td>").append(link).append("</td>").append("</tr>");
        });
        html.append("</table>");
        resp.getWriter().write(html.toString());
    }
}
