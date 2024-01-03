<%--
  Created by IntelliJ IDEA.
  User: 15331
  Date: 2024/1/2
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册界面</title>
    <link href="${pageContext.request.contextPath}/css/register.css" rel="stylesheet">
</head>
<body>

<div class="form-div">
    <div class="reg-content">
        <h1>个人诊所管理系统</h1>
        <span>已有帐号？</span> <a href="/managepage_war/jsp/login.jsp">登录</a>
        <br>
        <span id="notice" class="err_msg" style="display: none" >注册成功</span>
    </div>
    <form id="reg-form" action="/managepage_war/Register" method="get">
<input id="notic" value="${ifi}" hidden>
        <table>

            <tr>
                <td>用户名</td>
                <td class="inputs">
                    <input name="username" type="text" id="username1">
                    <br>
                    <span id="username_err" class="err_msg" style="display: none">长度在4字符到12字符</span>
                </td>

            </tr>

            <tr>
                <td>密码</td>
                <td class="inputs">
                    <input name="password" type="password" id="password1">
                    <br>
                    <span id="password_err" class="err_msg" style="display: none">密码格式有误</span>
                </td>
            </tr>


            <tr>
                <td>确认密码</td>
                <td class="inputs"><input name="tel" type="password" id="tel">
                    <br>
                    <span id="tel_err" class="err_msg" style="display: none">密码格式有误</span>
                    <span id=password_err2 class="err_msg" style="display: none;">两次密码不一致</span>
                </td>
            </tr>

        </table>

        <div class="buttons">
            <input value="注 册" type="submit" id="reg_btn">
        </div>
        <br class="clear">
    </form>
</div>
<script src="${pageContext.request.contextPath}/js/register.js"></script>
</body>
</html>
