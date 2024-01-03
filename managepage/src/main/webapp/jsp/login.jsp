<%--
  Created by IntelliJ IDEA.
  User: 15331
  Date: 2024/1/1
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv" style="height: 350px">
    <form action="/managepage_war/Login" id="form" method="post">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${failure}</div>
        <p>用户名:<input id="username" name="username" type="text" value="${cookie.username.value}"></p>

        <p>密 码:<input id="password" name="password" type="password" value="${cookie.password.value}"></p>
        <p>记住我:<input id="remember" name="remember" type="checkbox" value="1"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="登录">
            <input type="reset" class="button" value="清除">&nbsp;
            <a href="${pageContext.request.contextPath}/jsp/register.jsp">没有账号？</a>
        </div>
    </form>
</div>

</body>
</html>
