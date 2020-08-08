<%--
  Created by IntelliJ IDEA.
  User: 520
  Date: 2020/8/5
  Time: 21:18
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
    <title>商品界面</title>
</head>
<style>
    table{
        margin: auto;
    }
    h3{
        text-align: center;
    }
    input{
        border: none;
        text-align: center;
    }
    a{
        text-decoration: none;
    }
    p{
        text-align: center;
    }
</style>
<script src="js/jquery.js"></script>
<body>
<% Object message=session.getAttribute("message");
        if(message!=null&&!"".equals(message)){%>
<script type="text/javascript">
    alert("<%=message%>")
</script>
<%}
    session.removeAttribute("message");%>
<h3>商品列表</h3>
<table border="1px" cellspacing="0">
<%--    <form action="ware/piliangcaozuo" method="post">--%>
    <tr>
        <form action="ware/seeWare" method="post">
        <th>商品名称</th>
        <td colspan="2"><input type="text" name="wareName" value="${selectWare.wareName}"/></td>
        <th>商品单位</th>
        <td colspan="2"><input type="text" name="wareUnit" value="${selectWare.wareUnit}" /></td>
        <th><input type="submit" value="查询" /></th>
        </form>
    </tr>
    <tr>
        <th><input name="" type="checkbox" value="" /></th></th>
        <th>商品数量号码</th>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品单位</th>
        <th>商品库存</th>
        <th>操作</th>
    </tr>
    <c:forEach var="p" items="${ware}" varStatus="vsr">
        <form id="firstbtn${p.wareId }" action="ware/doUpdate?wid=${p.wareId}" method="post">
     <tr>
        <th><input name="check" type="checkbox" value="${p.wareId }" /></th>
        <th>${vsr.index+1}</th>
        <td><input type="text" name="wareId" value="${p.wareId}" readonly /></td>
        <td><input type="text" name="wareName" value="${p.wareName}" readonly /></td>
        <td><input type="text" name="wareUnit" value="${p.wareUnit}" readonly /></td>
        <td><input type="text" name="wareNum" value="${p.wareNum}" readonly /></td>
        <td><button id="btn${p.wareId }" type="button" onclick="valihhh($(this).attr('id'))">修改</button> <button type="button" id="${p.wareId}" onclick="valid($(this).attr('id'))">删除</button></td>
    </tr>
        </form>
    </c:forEach>
<%--        <input type="submit" value="批量操作"/>--%>
<%--    </form>--%>
</table>
<p><a href="ware/addWare">添加商品</a></p>
</body>
<script>
    function valid(_val){
        var flag=confirm("确定删除?")
        if(flag){
            location.href="ware/deleteWare?wid="+_val;
        }
    }
        function valihhh(_val){
            var p= $("#"+_val).html();
        if(p=="修改"){
            // var s=$("#first"+_val);
            // alert(s.children().children().nodeType);
            // $("input").removeAttr("readonly");
            $("#"+_val).parent().parent().children().children().removeAttr("readonly");
            $("#"+_val).parent().parent().children().children().eq(1).attr("readonly","readonly");
            $("#"+_val).html("提交");
        }else if(p=="提交"){
            $("#first"+_val).submit();
        }
        }
</script>
</html>
