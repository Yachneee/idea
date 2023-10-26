<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/25
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Employee</title>
    <link rel="stylesheet" href="css/table.css">
</head>
<body>
<h1>Employee</h1>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>入职时间</th>
        <th>职位</th>
        <th>工资</th>
        <th>奖金</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${all}" var="emp" varStatus="state">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.firstName.concat(emp.lastName)}</td>
            <td>${emp.startDate}</td>
            <td>${emp.title}</td>
            <td>${emp.salary}</td>
            <td>
                <c:if test="${emp.commissionPct != null}">
                    ${emp.commissionPct}
                </c:if>
                <c:if test="${emp.commissionPct == null}">
                    暂无
                </c:if>
            </td>
            <td>
                <a href="updateEmp.jsp?id=${emp.id}">修改</a>
                <a href="/deleteEmp?id=${emp.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h5 style="color: blueviolet">
    ${msg}
</h5>
</body>
</html>
