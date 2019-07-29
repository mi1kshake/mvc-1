<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../public/header.jsp"/>

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

<jsp:include page="../public/footer.jsp"/>