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
    <title>欢迎登陆</title>

</head>
<body>
username=<%=request.getParameter("username")%>
password=<%=request.getParameter("password")%>

<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");

    if(MyDAO.login(username,password)){
        out.println("welcome "+username);
        session.setAttribute("name",username);
        response.sendRedirect("index.jsp");
    }else {
        out.println("登陆失败");
        out.println("<a href='login.html'>重新登陆</a>");
    }
%>
</body>
</html>
