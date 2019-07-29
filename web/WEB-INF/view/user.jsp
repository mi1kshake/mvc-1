<%--
  Created by IntelliJ IDEA.
  User: www
  Date: 2019/7/26
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
个人中心
<%
    out.print(" <a href='");
    if(session.getAttribute("user") == null){
        out.print("../index/login'>登录");
    }
    else{
        out.print("../index/logout'>注销");
    }
    out.print("</a>");
%>
</body>
</html>
