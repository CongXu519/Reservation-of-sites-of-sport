 package com.sanqing.service.impl;
 
 import com.sanqing.dao.OrderListDAO;
 import com.sanqing.po.OrderList;
 import com.sanqing.po.User;
 import com.sanqing.service.OrderFormService;
 import com.sanqing.service.OrderListService;
 import com.sanqing.service.UserService;
 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.List;
 
 public class OrderListServiceImpl
   implements OrderListService
 {
   private OrderListDAO orderListDAO;
   private UserService userService;
   private OrderFormService orderFormService;
 
   public void setOrderListDAO(OrderListDAO orderListDAO)
   {
     this.orderListDAO = orderListDAO;
   }
 
   public void addOrderList(OrderList orderlist) {
     this.orderListDAO.save(orderlist);
   }
 
   public List<OrderList> getOrdersByFormID(Integer orderFormID) {
     return this.orderListDAO.getOrdersByOrderFormID(orderFormID);
   }
 
   public List<OrderList> getMyOrdersPaid(User user)
   {
     int userID = this.userService.getUserID(user).intValue();
 
     System.out.println(userID);
     List list = new ArrayList();
     for (Integer formID : this.orderFormService.getAllOrderForm(Integer.valueOf(userID))) {
       list.addAll(getOrdersByFormID(formID));
     }
 
     for (int i = 0; i < list.size(); i++) {
       System.out.println("list......" + ((OrderList)list.get(i)).getOrderListId());
     }
 
     return list;
   }
 
   public UserService getUserService() {
     return this.userService;
   }
 
   public void setUserService(UserService userService) {
     this.userService = userService;
   }
 
   public OrderFormService getOrderFormService() {
     return this.orderFormService;
   }
 
   public void setOrderFormService(OrderFormService orderFormService) {
     this.orderFormService = orderFormService;
   }
 }

