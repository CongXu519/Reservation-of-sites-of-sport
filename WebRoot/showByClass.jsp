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
		<title>PLAYEVERYWHERE</title>
		<link rel="stylesheet" type="text/css" href="style.css" />
		<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="iecss.css" />
<![endif]-->
		<script type="text/javascript" src="js/boxOver.js"></script>
	</head>
	<body>

		<div id="main_container">
			<div id="header">
				<div id="logocontainer">
					<div id="logo"><img src="images/logo.png" width="50" height="75"></div>
					<p>
						<span class="white">PLAY</span>
						<span class="blue">EVERYWHERE</span>
					</p>
				</div>
				<!-- end of oferte_content-->
			</div>

			<div id="menu_tab">
				<div id="onglets">
					<ul class="menu">
						<li>
							<a href="goIndex.action" class="nav1">Main Page</a>
						</li>
						<li>
							<a href="showCar.action" class="nav5">Order Car</a>
						</li>
						<li>
							<a href="getOrdersPaid.action" class="nav4">My Information</a>
						</li>
						<li>
							<a href="toRegister.action" class="nav6">Register</a>
						</li>
						<%
                   if(session.getAttribute("username")==null)
                   {
                   %>
						<li>
							<a href="toLogin.action" class="nav3">Login</a>
						</li>
						<%
                   }
                   else{
                   %>
						<li><%=session.getAttribute("username")%><a
								href="logout.action">logout</a>
						</li>
						<%
                   }
                   %>
						<li></li>
					</ul>

				</div>
			</div>
			<!-- end of menu tab -->

			<div id="main_content">



				<div class="crumb_navigation">
					Navigation:
					<span class="current">
    Main Page>>${commodityClass.commodityClassName}
    </span>
    
    </div>        
    
    
    <div class="left_content">
    <div class="title_box">Place Class</div>
        <ul class="left_menu">
        <s:iterator value="commodityClasses" var="comClass" status="stu">
        	<s:if test="#stu.odd">
        		<li class="odd">
        			<a href="showByClass.action?commodityClassID=${comClass.commodityClassId}">
        				${comClass.commodityClassName}
        			</a>
        		</li>
        	</s:if>
        	<s:else>
        		<li class="even">
        			<a href="showByClass.action?commodityClassID=${comClass.commodityClassId}">
        				${comClass.commodityClassName}
        			</a>
        		</li>
        	</s:else>	
        </s:iterator>
         <li class="odd"></li>
        </ul> 
     <div class="banner_adds">
     
     <a href="#"></a>     </div>    
        
    
   </div><!-- end of left content -->
   
   
   <div class="center_content">
   	<!--  <div class="center_title_bar">${commodityClass.commodityClassName}</div>-->
    	<s:iterator value="commodities" var="commodity">
    		<div class="prod_box">
	        	<div class="top_prod_box"></div>
	            <div class="center_prod_box">            
	                 <div class="product_title"><a href="showCommodity.action?commodityID=${commodity.commodityId}">${commodity.commodityName}</a></div>
	                 <div class="product_img"><a href="showCommodity.action?commodityID=${commodity.commodityId}"><img src="showImg.action?commodityID=${commodity.commodityId}" alt="" title="" border="0" /></a></div>
	                 <div class="prod_price"><!--<span class="reduce">${commodity.commodityPrice}</span>--> <span class="price">${commodity.fcPrice}</span> Euro/H</div>                        
	            </div>
	            <div class="bottom_prod_box"></div>             
	            <div class="prod_details_tab">
	            <!-- <a href="#" title="header=[���ӵ����ﳵ] body=[&nbsp;] fade=[on]"><img src="images/cart.gif" alt="" title="" border="0" class="left_bt" /></a>   -->        
	            <a href="showCommodity.action?commodityID=${commodity.commodityId}" class="prod_details">Details</a></div>                     
	        </div>
    	</s:iterator>
   </div><!-- end of center content -->
   
   
   
            
   </div><!-- end of main content -->
   
   
   
  <div class="footer"></div>                 


</div>
<!-- end of main_container -->
</body>
</html>
