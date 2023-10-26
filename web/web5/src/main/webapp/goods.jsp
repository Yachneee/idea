<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/25
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Goods</title>
    <link href="css/table.css" rel="stylesheet">
</head>
<body>
<%!
    class Product{
        private String name;
        private double price;
        private int count;
        public Product(String name,double price,int count){
            this.name=name;
            this.price=price;
            this.count=count;
        }
        public String getName(){
            return name;
        }
        public double getPrice(){
            return price;
        }
        public int getCount(){
            return count;
        }
    }
%>
<%
    Product[] products={new Product("苹果",5.5,10),new Product("香蕉",2.5,20),new Product("橘子",3.5,30),new Product("梨",4.5,40)};
%>
<table>
    <tr>
        <th><%="id"%></th>
        <th><%="类型"%></th>
        <th><%="价格"%></th>
        <th><%="数量"%></th>
        <th><%="操作"%></th>
    </tr>
    <% for (int i = 0; i < products.length; i++) {
        Product product=products[i];
    %>
    <tr>
       <td><%=i+1%></td>
       <td><%=product.getName()%></td>
       <td><%=product.getPrice()%></td>
       <td><%=product.getCount()%></td>
       <td><a href="#">修改</a><a href="#">删除</a></td>
       </tr>
    <%
    }
    %>
    <tr>
    </tr>
    <%
    %>
</table>
</body>
</html>
