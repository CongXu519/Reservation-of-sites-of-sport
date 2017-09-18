<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<TITLE>Welcome to Back System</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<LINK href="<%=basePath %>admin/images/syscome.files/Admin.css" rel=stylesheet>
<!-- 
<LINK href="<%=basePath %>admin/images/lib/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
<LINK href="<%=basePath %>admin/images/lib/bootstrap-datetimepicker-0.0.11/css/bootstrap-datetimepicker.min.css" rel="stylesheet" rel="stylesheet">
<LINK href="<%=basePath %>admin/images/css/style.css" rel="stylesheet"/>
 -->
 <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css" rel="stylesheet">
 <link rel="stylesheet" type="text/css" media="screen" href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
<SCRIPT language=javascript src="<%=basePath %>images/syscome.files/Admin.js"></SCRIPT>


    
<STYLE type=text/css>.STYLE1 {
	FONT-WEIGHT: bold; COLOR: #0099ff
}
</STYLE>

<META content="MSHTML 6.00.2900.5726" name=GENERATOR>
</HEAD>

<BODY><BR>
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center 
border=0>
</TABLE><BR>
<form action="datesAdd.action" method="post" enctype="multipart/form-data">
<TABLE cellSpacing=1 cellPadding=3 width="95%" align=center bgColor=#6ab6b6 
border=0>
  <TBODY>
  <TR>
    <TH colSpan=2 height=24>【Add Dates】</TH> 
   </TR>

<TR>
    <TD class=forumrow height=24><div align="right">Place Class:</div></TD>
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
    <TD class=forumrow height=24><div align="right">Place:</div></TD> 
      <TD class=forumrowhighlight 
      height=24>
      <select name="commodityID">
      	<s:iterator value="commodities" var="commodity">
      		<option value="${commodity.commodityId}">
      			${commodity.commodityName}
      		</option>
      	</s:iterator>
      </select>
      </TD>
    </TR>    
 
  <TR>
    <TD class=forumrow height=24><div align="right">Date Time:</div></TD>
    <TD class=forumrowhighlight 
      height=24>
      
<div id="datetimepicker" class="input-append date">
      <input type="text" name="orderDate"></input>
      <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
</div>

    </TD> 
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

<SCRIPT type="text/javascript"
     src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
</SCRIPT> 
<SCRIPT type="text/javascript"
     src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js">
</SCRIPT>
<SCRIPT type="text/javascript"
     src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
</SCRIPT>
<SCRIPT type="text/javascript"
     src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
</SCRIPT>
<SCRIPT type="text/javascript">
      $('#datetimepicker').datetimepicker({
        format: 'yyyy-MM-dd hh:mm:00',
        language: 'en'
      });
</SCRIPT>

</BODY></HTML>
