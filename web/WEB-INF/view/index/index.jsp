<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../../public/header.jsp"/>

<style>
    .body-div-show{
        width: 1200px;
        text-align: left;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #ffffff;
    }
    .show-head-tip{
        width: 5px;
        height: 20px;
        margin-right: 10px;
        margin-left: 20px;
        background: #ff5000;
    }
    .show-head{
        padding-top: 20px;
        display: flex;
    }
    .show-body{
        display: flex;
        margin-top: 10px;
        padding-bottom: 10px;
    }
    .show-body-div{
        width: 20%;
        text-align: center;
    }

    .body-div-two{
        display: flex;
    }

    .body-div-left{
        width: 595px;
        display: inline-block;
        text-align: left;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #ffffff;
    }
    .left-head{
        padding-top: 20px;
        display: flex;
    }
    .left-head-tip{
        width: 5px;
        height: 20px;
        margin-right: 10px;
        margin-left: 20px;
        background: #ff5000;
    }
    .left-body{
        display: flex;
        padding: 10px 20px 10px 20px;
    }

    .body-div-right{
        width: 595px;
        display: inline-block;
        text-align: left;
        margin-top: 10px;
        margin-left: 10px;
        margin-bottom: 10px;
        background: #ffffff;
    }
    .right-head{
        padding-top: 20px;
        display: flex;
    }
    .right-head-tip{
        width: 5px;
        height: 20px;
        margin-right: 10px;
        margin-left: 20px;
        background: #ff5000;
    }
    .right-body{
        display: flex;
        padding: 10px 20px 10px 20px;
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
    <div class="head-menu">
        <ul class="head-menu-list">
            <li class="main">主题市场</li>
            <li>服装</li>
            <li>数码</li>
        </ul>
    </div>
</div>

<div class="body">
    <div class="body-div">
        <div class="body-div-banner">
            <a href="#">
                <img src="../static/img/banner.png" width="1200px">
            </a>
        </div>
        <div class="body-div-show">
            <div class="show-head">
                <div class="show-head-tip"></div>
                <div class="show-head-title">新品推荐</div>
            </div>
            <div class="show-body">
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
                <div class="show-body-div">
                    <a href="http://localhost/goods/detail?gid=123456">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                    </a>
                    <a href="http://localhost/goods/detail?gid=123456">
                        <h>[转转网]二手跳蚤市场</h>
                    </a>
                </div>
            </div>
        </div>
        <div class="body-div-two">
            <div class="body-div-left">
                <div class="left-head">
                    <div class="left-head-tip"></div>
                    <div class="left-head-title">学习生活</div>
                </div>
                <div class="left-body">
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                </div>
            </div>
            <div class="body-div-right">
                <div class="right-head">
                    <div class="right-head-tip"></div>
                    <div class="right-head-title">数码设备</div>
                </div>
                <div class="right-body">
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                    <div class="show-body-div" style="width: 50%;">
                        <img src="../static/img/logo.png" width="100%" title="转转网"/>
                        <h>[转转网]二手跳蚤市场</h>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../../public/footer.jsp"/>