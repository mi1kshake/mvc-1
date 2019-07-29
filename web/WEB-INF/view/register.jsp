<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../public/header.jsp"/>

<form action="register" method="post">
    <table>
        <tr>
            <td style="text-align: right;width: 80px;">账号</td>
            <td><input name="username" id="username" placeholder="手机号码"/></td>
        </tr>
        <tr>
            <td style="text-align: right;width: 80px;">密码</td>
            <td><input name="password" id="password" placeholder="******"/></td>
        </tr>
        <tr>
            <td style="text-align: right;width: 80px;">确认密码</td>
            <td><input name="password" id="check" placeholder="******"/></td>
        </tr>
    </table>
    <input type="submit" />
</form>

<jsp:include page="../public/footer.jsp"/>