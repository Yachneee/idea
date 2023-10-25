<%@ page import="entity.User" %>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #d8d8d8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        div {
            width: 600px;
            padding: 20px;
            background-color: #a482a4;
            color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h1 {
            margin-bottom: 20px;
        }

        a {
            text-decoration: none;
            color: inherit;
            display: block;
            padding: 10px 0;
            background-color: rgba(255, 255, 255, 0.2);
            border-radius: 4px;
            transition: background-color 0.5s ease;
            margin-bottom: 10px;
        }

        a:hover {
            background-color: rgba(255, 255, 255, 0.5);
        }
    </style>
</head>
<body>
<div>
    <h1>Hello,<%
        User user = (User) request.getAttribute("user");
        HttpSession session1 = request.getSession();
        Object user1 = session1.getAttribute("user");
        out.println(user.getName());
    %></h1>
    <a href="/change">修改用户密码</a>
    <a href="/upload">上传文件</a>
    <a href="/show">展示上传文件列表</a>
    <a href="/logout">退出登录</a>
</div>
</body>
</html>