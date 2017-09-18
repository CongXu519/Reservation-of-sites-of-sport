 package com.sanqing.service.impl;
 
 import com.sanqing.dao.OrderDateDAO;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.OrderDate;
 import com.sanqing.service.OrderDateService;
 import java.util.Date;
 import java.util.List;
 
 public class OrderDateServiceImpl
   implements OrderDateService
 {
   private OrderDateDAO orderDateDAO;
 
   public void setOrderDateDAO(OrderDateDAO orderDateDAO)
   {
     this.orderDateDAO = orderDateDAO;
   }
 
   public void addDate(OrderDate orderDate) {
     this.orderDateDAO.save(orderDate);
   }
   public void deleteDate(Commodity commodity, Date orderDate) {
     this.orderDateDAO.delete(commodity, orderDate);
   }
   public List<OrderDate> showOrderDates(Commodity commodity) {
     return this.orderDateDAO.showOrderDates(commodity);
   }
 }

