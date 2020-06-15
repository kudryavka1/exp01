<%@ page import="java.util.List" %>
<%@ page import="java.util.Vector" %><%--
  Created by IntelliJ IDEA.
  User: zh
  Date: 2020/5/28
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(application.getAttribute("onlinUsers")==null){
        application.setAttribute("onlinUsers", new Vector<String>());
    }
%>
<html>
<head>
    <title>Lec21 Session</title>
</head>
<body>

<div align="center">
    当前登陆用户<%=session.getAttribute("name")%>
    <%
        if(session.getAttribute("name")!=null){
            out.println("<a href=\"logout.jsp\">注销</a>");
        }
        else {
            out.println("<a href=\"login.html\">请登录</a>");
        }
    %>
<%
    List<String> userList = (List<String>) application.getAttribute("onlinUsers");
    for (String user : userList) {
        out.println(user+"<br>");
    }

%>

</div>
</body>
</html>
