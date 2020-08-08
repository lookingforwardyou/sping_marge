<%--
  Created by IntelliJ IDEA.
  User: 520
  Date: 2020/8/5
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
teaList......
<table>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>工资</th>
    </tr>
<c:forEach var="tea" items="${teacher}">
    <tr>
        <td>${tea.teacherId}</td>
        <td>${tea.teacherName}</td>
        <td>${tea.money}</td>
    </tr>
</c:forEach>
</table>
<a href="teacher/nihao">点击跳转</a>
</body>
</html>
