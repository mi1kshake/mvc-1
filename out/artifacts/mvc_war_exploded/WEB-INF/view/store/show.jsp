<%@ page contentType="text/html;charset=UTF-8" %>
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
    <div class="body-div" style="text-align: left;">
        <div>店长：<span>${info[0]}</span></div>
        <div>店铺ID：<span>${info[1]}</span></div>
        <div>店铺名：<span>${info[2]}</span></div>
        <div>店铺简介：<span>${info[3]}</span></div>
    </div>
</div>

<jsp:include page="../../public/footer.jsp"/>