<%--
  Created by IntelliJ IDEA.
  User: 520
  Date: 2020/8/5
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>添加商品界面</title>
</head>
<body>
<table>
    <form action="ware/doAddWare" method="post">
    <tr>
        <th>商品名称</th>
        <td><input type="text" name="wareName" /></td>
    </tr>
    <tr>
        <th>商品单位</th>
        <td><input type="text" name="wareUnit" /></td>
    </tr>
    <tr>
        <th>商品数量</th>
        <td><input type="text" name="wareNum" /></td>
    </tr>
    <tr>
        <th colspan="2"><input type="submit" value="提交" /></th>
    </tr>
    </form>
</table>
</body>
</html>
