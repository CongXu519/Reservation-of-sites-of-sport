 package com.sanqing.service.impl;
 
 import com.sanqing.dao.OrderFormDAO;
 import com.sanqing.po.OrderForm;
 import com.sanqing.service.OrderFormService;
 import java.util.List;
 
 public class OrderFormServiceImpl
   implements OrderFormService
 {
   private OrderFormDAO orderFormDAO;
 
   public void setOrderFormDAO(OrderFormDAO orderFormDAO)
   {
     this.orderFormDAO = orderFormDAO;
   }
 
   public void addOrderForm(OrderForm orderform) {
     this.orderFormDAO.save(orderform);
   }
 
   public List<Integer> getAllOrderForm(Integer userID) {
     return this.orderFormDAO.getOrderFormsByUserID(userID);
   }
 }

