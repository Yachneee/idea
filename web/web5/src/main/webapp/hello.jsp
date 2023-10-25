<%@ page import="com.kfm.entity.User" %>
<%@ page import="com.kfm.utils.Constant" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/25
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h2>欢迎<%
    User user = (User)session.getAttribute(Constant.LOGIN_USER_KEY);
    out.print(user.getUsername());
%>登陆<a href="/logout" style="color: darkred">退出登录</a></h2>
</body>
</html>
