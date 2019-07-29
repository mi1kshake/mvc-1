<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../public/header.jsp"/>

<form action="login" method="post">
    账号：<input name="username" id="username"/><br/>
    密码：<input name="password" id="password"/><br/>
    <input type="submit" />
</form>

<jsp:include page="../public/footer.jsp"/>