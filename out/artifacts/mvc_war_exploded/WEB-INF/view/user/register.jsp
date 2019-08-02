<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../../public/header.jsp"/>

<%
    if(request.getAttribute("msg") != null){
        out.println("<script>alert('"+request.getAttribute("msg")+"')</script>");
    }
%>

<div class="head">
    <div class="head-div">
        <div class="logo">
            <a href="../../">
                <img src="../static/img/logo.png" width="200px" title="转转网"/>
            </a>
        </div>
    </div>
</div>

<div class="body">
    <div class="body-div" style="">
        <div class="body-div-logo" style="">
            <img src="../static/img/login.png"/>
        </div>
        <div class="form" style="margin: 50px;">
            <div class="form-title">
                用户注册
            </div>
            <div class="form-div">
                <form method="post">
                    <table>
                        <tr>
                            <td style="text-align: right;width: 80px;">账号</td>
                            <td><input name="username" type="text" placeholder="手机号码" maxlength="11"/></td>
                        </tr>
                        <tr>
                            <td style="text-align: right;width: 80px;">密码</td>
                            <td><input name="password" type="password" placeholder="******"/></td>
                        </tr>
                        <tr>
                            <td style="text-align: right;width: 80px;">确认密码</td>
                            <td><input name="check" type="password" placeholder="******"/></td>
                        </tr>
                    </table>
                    <input type="submit" />
                </form>
            </div>
        </div>
    </div>
</div>

<style>
    .body-div{
        display: flex;
        background: #ffffff;
        margin-top: 10px;
        margin-bottom: 10px;
    }
    .body-div-logo{
        margin: 70px 200px 70px 200px;
    }
    .form-title{
        padding-top: 50px;
        padding-bottom: 30px;
        background: #efefef;
    }
    .form-div{
        width: 300px;
        height: 200px;
        line-height: 40px;
        background: #efefef;
    }
</style>

<jsp:include page="../../public/footer.jsp"/>