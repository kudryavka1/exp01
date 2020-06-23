<%--
  Created by IntelliJ IDEA.
  User: zh
  Date: 2020/6/23
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>购物车页面</title>

</head>
<body>
<c:if test="${empty(cart.foodMap)}">
    <h1>你还没购买任何水果</h1>
</c:if>


<c:if test="${!empty(cart.foodMap)}">
    <table border="1px">
        <tr>
            <td>食品编号</td>
            <td>食品名称</td>
            <td>食品数量</td>
            <td>食品价格</td>
            <td>操作</td>

        </tr>


    <c:forEach items="${cart.foodMap}" var="me">
        <tr>
            <td>${me.key}</td>
            <td>${me.value.food.foodname}</td>
            <td>${me.value.quantity}</td>
            <td>${me.value.price}</td>
            <td><a href="${pageContext.request.contextPath}/DeleteCartFood?foodid=${me.key}">删除</a></td>
        </tr>
    </c:forEach>
        <tr>
            <td colspan="2"><a href="#">清空购物车</a></td>
            <td colspan="2">合计：</td>
            <td>${cart.price}</td>
        </tr>


</c:if>

</table>
</body>
</html>
