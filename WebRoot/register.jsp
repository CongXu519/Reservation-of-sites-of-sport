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
<link rel="stylesheet" type="text/css" href="style.css" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
<script type="text/javascript" src="js/boxOver.js"></script>
</head>
<body>
<center>
  <h1>Register new user</h1>
  <form action="register.action" method=post>
  <table border="1" bgcolor="#0099CC">
    <tr>
      <td>username:</td><td><input type="text" name="username"></td>
    </tr>
    <tr valign="middle">
      <td>password:</td><td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td>address:</td><td><input type="text" name="address"></td>
    </tr>
    <tr>
      <td>phone:</td><td><input type="text" name="phone"></td>
    </tr>
    <tr>
      <td>e-mail:</td><td><input type="text" name="email"></td>
    </tr>
    
    <tr>
      <td><input type=submit value=submit></td>
    </tr>
  </table>
  </form>
</center>
</body>
</html>
