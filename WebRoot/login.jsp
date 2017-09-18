<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>Project Platine</title>
<style type="text/css">
html {
    background-color: #E9EEF0
}
.wrapper {
    margin: 140px auto;
    width: 884px;
}
.loginBox {
    background-color: #FEFEFE;
    border: 1px solid #BfD6E1;
    border-radius: 5px;
    color: #444;
    font: 14px 'Microsoft YaHei';
    margin: 0 auto;
    width: 388px
}
.loginBox .loginBoxCenter {
    border-bottom: 1px solid #DDE0E8;
    padding: 24px;
}
.loginBox .loginBoxCenter p {
    margin-bottom: 10px
}
.loginBox .loginBoxButtons {
    background-color: #F0F4F6;
    border-top: 1px solid #FFF;
    border-bottom-left-radius: 5px;
    border-bottom-right-radius: 5px;
    line-height: 28px;
    overflow: hidden;
    padding: 20px 24px;
    vertical-align: center;
}
.loginBox .loginInput {
    border: 1px solid #D2D9dC;
    border-radius: 2px;
    color: #444;
    font: 12px 'Microsoft YaHei';
    padding: 8px 14px;
    margin-bottom: 8px;
    width: 310px;
}
.loginBox .loginInput:FOCUS {
    border: 1px solid #B7D4EA;
    box-shadow: 0 0 8px #B7D4EA;
}
.loginBox .loginBtn {
    background-image: -moz-linear-gradient(to bottom, #B5DEF2, #85CFEE);
    border: 1px solid #98CCE7;
    border-radius: 20px;
    box-shadow:inset rgba(255,255,255,0.6) 0 1px 1px, rgba(0,0,0,0.1) 0 1px 1px;
    color: #FFF;
    cursor: pointer;
    float: right;
    font: bold 13px Arial;
    padding: 5px 14px;
}
.loginBox .loginBtn:HOVER {
    background-image: -moz-linear-gradient(to top, #B5DEF2, #85CFEE);
}
.loginBox a.forgetLink {
    color: #ABABAB;
    cursor: pointer;
    float: right;
    font: 11px/20px Arial;
    text-decoration: none;
    vertical-align: middle;
}
.loginBox a.forgetLink:HOVER {
    text-decoration: underline;
}
.loginBox input#remember {
    vertical-align: middle;
}
.loginBox label[for="remember"] {
    font: 11px Arial;
}
</style>
</head>
<body>
<div class="wrapper">
   <form name="Login" action="login.action" method="post">
    <div class="loginBox">
        <div class="loginBoxCenter">
            <p><label for="username">User: </label></p>
            <p><input type="username" id="username" name="username" class="loginInput" autofocus="autofocus" required="required" autocomplete="off" placeholder="Please input username" value="" /></p>
            <p><label for="password">Password: </label><a class="forgetLink" href="#">Forgot password?</a></p>
            <p><input type="password" id="password" name="password" class="loginInput" required="required" placeholder="Please input your password" value="" /></p>
        </div>
        <div class="loginBoxButtons">
            <input id="remember" type="checkbox" name="remember" />
            <label for="remember">Remember login state</label>
            <button type="submit" class="loginBtn">Login</button>
        </div>
    </div>
   </form>
</div>

</body>
</html>
