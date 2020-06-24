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
<h3 align="center">单前用户：<%=session.getAttribute("username")%><a href="${pageContext.request.contextPath}/LogoutServlet">注销</a></h3>
    <table width="720px" border="1px" align="center">
        <tr>
            <td>食品编号</td>
            <td>食品名称</td>
            <td>食品价格</td>
            <td>购买</td>
        </tr>


        <c:forEach items="${foods}" var="me">
            <tr>
                <td>${me.key}</td>
                <td>${me.value.foodname}</td>
                <td>${me.value.price}</td>
                <td><a href="${pageContext.request.contextPath}/BuyServlet?foodid=${me.key}">购买</a></td>
            </tr>



        </c:forEach>

        <tr>
            <td align="center" colspan="5"><a href="${pageContext.request.contextPath}/exp01/listCart.jsp">点击进入购物车进行结算</a></td>
        </tr>

    </table>

</body>
</html>
