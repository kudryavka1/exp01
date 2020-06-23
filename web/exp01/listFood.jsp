<%--
  Created by IntelliJ IDEA.
  User: zh
  Date: 2020/6/23
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foodList</title>

</head>
<body>
    <table border="1px">
        <tr>
            <td>食品编号</td>
            <td>食品名称</td>
            <td>食品价格</td>
        </tr>


        <c:forEach items="${foods}" var="me">
            <tr>
                <td>${me.key}</td>
                <td>${me.value.foodname}</td>
                <td>${me.value.price}</td>
            </tr>



        </c:forEach>

    </table>

</body>
</html>
