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
<TABLE cellSpacing=1 cellPadding=3 width="95%" align=center bgColor=#6ab6b6 
border=0>
  <TBODY>
  <TR>
    <TH colSpan=10 height=24>【List of Places】</TH> 
   </TR>
     <TR>
    <TD class=forumrow>Place ID</TD>
    <TD class=forumrow>Place Name</TD>
    <TD class=forumrow>Place Class</TD>
    <TD class=forumrow >Address</TD>
    <!-- <TD class=forumrow>商品价格</TD> -->
    <TD class=forumrow>Order Price</TD>
    <TD class=forumrow>Order Time Min</TD>
    <TD class=forumrow>Order Time Max</TD>
    <!-- <TD class=forumrow>商品上架时间</TD> -->
    <TD class=forumrow>Manage</TD>
  </TR>
   <s:iterator value="commodities" var="commodity" >
  <TR>
    <TD class=forumrow>${commodity.commodityId}</TD>
    <TD class=forumrow>${commodity.commodityName}</TD>
    <TD class=forumrow>${commodity.commodityClass.commodityClassName}</TD>
    <TD class=forumrow >${commodity.address}</TD>
    <!-- <TD class=forumrow>${commodity.commodityPrice}</TD> -->
    <TD class=forumrow>${commodity.fcPrice}</TD>
    <TD class=forumrow>${commodity.timeMin}</TD>
    <TD class=forumrow>${commodity.timeMax}</TD>
    <!--<TD class=forumrow><s:date name="regTime" format="yyyy-MM-dd"/>
    </TD>-->
    <TD class=forumrow><a href="deleteCommodity.action?commodityID=${commodity.commodityId}">Delete</a></TD>
  </TR>
  </s:iterator>
    <TR>
    <TD class=forumrow height=24 colspan="10" align="center">
    <s:if test="page.hasPrePage">
		<a href="findAllCommodity.action?currentPage=1">first page</a>
		<a href="findAllCommodity.action?currentPage=${currentPage - 1}">previous page</a>
	</s:if>
	<s:else>
		<EM>first page</EM>
		<EM>previous page</EM>
	</s:else>
	<s:if test="page.hasNextPage">
		<a href="findAllCommodity.action?currentPage=${currentPage + 1}">next page</a>
		<a href="findAllCommodity.action?currentPage=${page.totalPage}">last page</a>
	</s:if>
	<s:else>
		<EM>next page</EM>
		<EM>last page</EM>
	</s:else>
    </TD>
  </TR>
  </TBODY>
  </TABLE>
<BR>
<TABLE class=tableborder cellSpacing=1 cellPadding=3 width="95%" align=center 
border=0>
</TABLE><BR>
</BODY></HTML>
