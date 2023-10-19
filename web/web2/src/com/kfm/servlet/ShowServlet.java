package com.kfm.servlet;

import com.kfm.entity.User;
import com.kfm.utils.UserOpe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrator
 */
@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //查询数据库信息
        try {
            List<User> users = UserOpe.selectAll();
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=UTF-8");
            String serverT = writeUserT(users);
            PrintWriter writer = resp.getWriter();
            writer.write(serverT);
            writer.write(serverT);
            writer.flush();
            writer.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    private String writeUserT(List<User> users){
        String serverT = "<style>table, tr,td{border:1px solid black;} .container{border-bottom:50px solid transparent;}</style>";
        serverT += "<div class=\"container\"><table>"
                + "<tr>"
                + "<td>id</td>"
                + "<td>email</td>"
                + "<td>username</td>"
                + "<td>password</td>"
                + "</tr>";
        for (User s : users) {
            serverT += "<tr>" +
                    "<td>" + s.getId() + "</td>" +
                    "<td>" + s.getEmail() + "</td>" +
                    "<td>" + s.getUsername() + "</td>" +
                    "<td>" + s.getPassword() + "</td>" +
                    "</tr>";
        }
        return serverT + "</table></div>";
    }
}