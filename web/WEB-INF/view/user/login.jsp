<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../../public/header.jsp"/>

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
    <div class="body-div">
        <div class="body-div-logo">
            <img src="../static/img/login.png"/>
        </div>
        <div class="form" style="margin: 50px;">
            <div class="form-title">
                用户登录
            </div>
            <div class="form-div">
                <form method="post">
                    账号：<input name="username" id="username"/><br/>
                    密码：<input name="password" id="password"/><br/>
                    <input type="submit" value="登录"/>
                    <a href="register">注册</a>
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
        padding: 50px;
        background: #efefef;
    }
    .form-div{
        width: 300px;
        height: 200px;
        background: #efefef;
    }
    .form-div input{
        margin: 0 0 20px 0;
    }
</style>

<jsp:include page="../../public/footer.jsp"/>