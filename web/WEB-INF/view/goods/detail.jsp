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
        <form action="../order/index" method="post">
            订单号：<input name="order" value="666"/>
            商品：<input name="goods" value="<%=request.getParameter("gid")%>"/>
            <input type="submit"/>
        </form>
    </div>
</div>

<jsp:include page="../../public/footer.jsp"/>
