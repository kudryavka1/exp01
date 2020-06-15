<%--
  Created by IntelliJ IDEA.
  User: zh
  Date: 2020/5/28
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //session.removeAttribute("name");//从session表中移除一行
    session.invalidate();//销毁session表
    response.sendRedirect("login.html");
%>
</body>
</html>
