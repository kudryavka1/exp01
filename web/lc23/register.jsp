<%--
  Created by IntelliJ IDEA.
  User: zh
  Date: 2020/5/24
  Time: 0:57
  To change this tem  plate use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao.MyDAO" %>
<html>
<head>
    <title>欢迎注册</title>

</head>
<body>

<%
    String username=request.getParameter("username");
    String password1=request.getParameter("password1");
    String password2=request.getParameter("password2");

    if(password1.equals(password2)&&MyDAO.register(username,password1)){
        out.println("注册成功");
        out.println("<a href='login.html'>请登陆");
    }else {
        out.println("注册失败");
        out.println("<a href='register.html'>重新注册</a>");
    }
%>
</body>
</html>
