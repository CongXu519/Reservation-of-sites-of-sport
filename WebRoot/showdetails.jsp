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
    Main Page>>${commodity.commodityName}
    </span>
    
    </div>        
    
    
    <div class="left_content">
    <div class="title_box">Place Class</div>
        <ul class="left_menu">
       <s:iterator value="commodityClasses" var="commodityClass" status="stu">
        	<s:if test="#stu.odd">
        		<li class="odd">
        			<a href="showByClass.action?commodityClassID=${commodityClass.commodityClassId}">
        				${commodityClass.commodityClassName}
        			</a>
        		</li>
        	</s:if>
        	<s:else>
        		<li class="even">
        			<a href="showByClass.action?commodityClassID=${commodityClass.commodityClassId}">
        				${commodityClass.commodityClassName}
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
     <div class="center_title_bar">${commodity.commodityName}</div>
     <div class="prod_box_big">
       <div class="top_prod_box_big"></div>
       <div class="center_prod_box_big">
         <div class="product_img_big"> 
             <div><img src="showImg.action?commodityID=${commodity.commodityId}" alt="" title="" border="0" /></div>
         </div>
         
         <s:form method="post" action="addToCar.action">
         
         <div class="details_big_box">
           
           <div class="specifications">       
         <span><h3>Choose a Date for ordering: </h3></span>
         <select id="rtl" name="orderDate">
     		<s:iterator value="orderDates" var="date">
				<option>${date.orderDate}</option>       	
        	</s:iterator>
         </select>
<br/>
		<span><h3>Choose a Duration for ordering: </h3></span>
		<select id="rtm" name="time">
			<s:iterator value="timeList" var="time">
				<option>${time}</option>       	
        	</s:iterator>
         </select>
         
H<br/><br/>
	<input type="submit" value="Add To Order Car"/>
           </div>
           <!-- <div class="prod_price_big"><span class="reduce">${commodity.commodityPrice}</span> <span class="price">${commodity.fcPrice}</span></div>
           -->
          <div style="display:none">
          <textarea type="hidden" name="commodityID">${commodity.commodityId}</textarea>
          </div>
          <!--<a href="addToCar.action?commodityID=${commodity.commodityId} & orderDate=$(option)" class="addtocart">添加到购物车</a></div>-->
            </div>
            
	     
        </s:form>   
            
       <div class="bottom_prod_box_big"></div>
     </div>
     <div class="center_title_bar">Place Description</div>
     <div class="prod_box_big">
     		
            <!--  Place ID: <span class="blue">${commodity.commodityId}</span><br />-->
            <!--  Place Name: <span class="blue">${commodity.commodityName}</span><br /> -->
            <h3>Address: <span class="blue">${commodity.address}</span><br /></h3>
            <h3>Order Price: <span class="blue">${commodity.fcPrice}</span> euro/h<br /></h3>
            <h3>Order Time Min: <span class="blue">${commodity.timeMin}</span> h<br /></h3>
            <h3>Order Time Max: <span class="blue">${commodity.timeMax}</span> h<br /></h3>
            <h3>More Information: <br /><span class="blue">${commodity.commodityDepict}</span><br /></h3>
     </div>
	     
	     <div>
	     
        </div>
        
     </div>
   <!-- end of center content -->
   
   </div><!-- end of main content -->
   
   
   
  <div class="footer"></div>                 


</div>
<!-- end of main_container -->
</body>
</html>