<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD><TITLE>Welcome to Back System</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312"><LINK 
href="<%=basePath %>admin/images/syscome.files/Admin.css" rel=stylesheet>
<SCRIPT language=javascript src="<%=basePath %>images/syscome.files/Admin.js"></SCRIPT>

<STYLE type=text/css>.STYLE1 {
	FONT-WEIGHT: bold; COLOR: #0099ff
}
</STYLE>

<META content="MSHTML 6.00.2900.5726" name=GENERATOR></HEAD>
<BODY><BR>
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center 
border=0>
</TABLE><BR>
<form action="addCommodity.action" method="post" enctype="multipart/form-data">
<TABLE cellSpacing=1 cellPadding=3 width="95%" align=center bgColor=#6ab6b6 
border=0>
  <TBODY>
  <TR>
    <TH colSpan=2 height=24>【Add Place】</TH> 
   </TR>
  <TR>
    <TD class=forumrow width="30%" height=24><div align="right">Place Name: </div></TD>
  <TD class=forumrowhighlight width="70%" 
      height=24><input type="text" name="commodityName"></TD></TR>
  <TR>
    <TD class=forumrow height=24><div align="right">Place Class: </div></TD>
    <TD class=forumrowhighlight 
      height=24>
      <select name="commodityClassID">
      	<s:iterator value="commodityClasses" var="commodityClass">
      		<option value="${commodityClass.commodityClassId}">
      			${commodityClass.commodityClassName}
      		</option>
      	</s:iterator>
      </select>
      </TD>
  </TR>
  <TR>
    <TD class=forumrow height=24><div align="right">Address: </div></TD>
    <TD class=forumrowhighlight 
      height=24><input type="text" name="address"></TD>
  </TR>
  <TR>
    <TD class=forumrow height=24><div align="right">Place Image: </div></TD>
    <TD class=forumrowhighlight 
      height=24><input type="file" name="uploadImage"></TD>
  </TR>
  <TR>
    <TD class=forumrow height=24><div align="right">Place Description: </div></TD>
    <TD class=forumrowhighlight 
      height=24><textarea name="commodityDepict" cols="50" rows="5"></textarea></TD>
  </TR>
  
  <!-- 
  <TR>
    <TD class=forumrow height=24><div align="right">商品价格：</div></TD>
    <TD class=forumrowhighlight 
      height=24><input type="text" name="commodityPrice"></TD>
  </TR>
   -->
   
  <TR>
    <TD class=forumrow height=24><div align="right">Order Price: </div></TD>
    <TD class=forumrowhighlight 
      height=24><input type="text" name="fcPrice"></TD>
  </TR>
  <TR>
    <TD class=forumrow height=24><div align="right">Order Time Min: </div></TD>
    <TD class=forumrowhighlight 
      height=24><input type="text" name="timeMin"></TD>
  </TR>
  <TR>
    <TD class=forumrow height=24><div align="right">Order Time Max: </div></TD>
    <TD class=forumrowhighlight 
      height=24><input type="text" name="timeMax"></TD>
  </TR>
  <TR>
    <TD class=forumrow height=24>&nbsp;</TD>
    <TD class=forumrowhighlight 
      height=24><input type="submit" value="Submit">
      <input type="reset" value="Reset"></TD>
  </TR>
  </TBODY></TABLE>
</form>  
<BR>
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center 
border=0>
</TABLE><BR>
</BODY></HTML>
