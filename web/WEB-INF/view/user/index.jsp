<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../../public/header.jsp"/>

<style>
    .user-div{
        width: 300px;
        margin-bottom: 5px;
        background: #ffffff;
    }
    .user-logo{
        width: 300px;
        padding-top: 30px;
        padding-bottom: 20px;
        text-align: center;
    }
    .user-info-title{
        line-height: 30px;
        padding: 10px 40px 10px 40px;
    }
    .user-info-body{
        color: #ffffff;
        line-height: 30px;
        display: flex;
        padding: 10px 20px 10px 20px;
    }
    .user-info-body a{
        color: #ffffff;
        margin: 10px auto;
        padding: 10px;
        background: #ff9000;
    }
    .user-info-body a:hover{
        color: aqua;
    }
    .user-list{
        padding: 10px 0 20px 40px;
    }
</style>

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
    <div class="body-div" style="text-align: left;">
        <div class="user-div">
            <div class="user-logo">
                <div class="user-logo-img">
                    <img src="../static/img/login.png" width="100px" title="志心科技"/>
                </div>
            </div>
            <hr style="border: 0;border-bottom: 1px solid #ff9000;"/>
            <div class="user-info">
                <div class="user-info-title">
                    <div>昵称：<span>${info[0]}</span></div>
                    <div>账号：<span>${info[1]}</span></div>
                    <div>学院：<span>${info[2]}</span></div>
                    <div>宿舍：<span>${info[3]}</span></div>
                </div>
                <div class="user-info-body">
                    <a href="#" title="购物车"><div>购物车</div></a>
                    <a href="#" title="收藏夹"><div>收藏夹</div></a>
                    <a href="#" title="联系人"><div>联系人</div></a>
                </div>
            </div>
            <hr style="border: 0;border-bottom: 1px solid #ff9000;"/>
            <div class="user-list">
                <div class="user-list-title" style="color: #ff9000;font-weight: bold;">新用户</div>
                <hr style="border: 0;border-bottom: 1px solid #00bbcc;"/>
                <div class="user-list-body">
                    <%
                        ArrayList list = (ArrayList)request.getAttribute("list");
                        for (int i=0; i<list.size(); i++){
                            out.println("<li>" + list.get(i) + "</i>");
                        }
                    %>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../../public/footer.jsp"/>