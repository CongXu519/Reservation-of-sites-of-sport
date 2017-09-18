 package com.sanqing.po;
 
 import java.io.Serializable;
 import java.sql.Timestamp;
 
 public class OrderList
   implements Serializable
 {
   private Integer orderListId;
   private Commodity commodity;
   private OrderForm orderForm;
   private Integer time;
   private Timestamp orderDate;
 
   public OrderList(Integer orderListId, Commodity commodity, OrderForm orderForm, Integer time, Timestamp orderDate)
   {
     this.orderListId = orderListId;
     this.commodity = commodity;
     this.orderForm = orderForm;
     this.time = time;
     this.orderDate = orderDate;
   }
 
   public OrderList() {
   }
 
   public Integer getOrderListId() {
     return this.orderListId;
   }
 
   public void setOrderListId(Integer orderListId) {
     this.orderListId = orderListId;
   }
 
   public Commodity getCommodity() {
     return this.commodity;
   }
 
   public void setCommodity(Commodity commodity) {
     this.commodity = commodity;
   }
 
   public OrderForm getOrderForm() {
     return this.orderForm;
   }
 
   public void setOrderForm(OrderForm orderForm) {
     this.orderForm = orderForm;
   }
 
   public Timestamp getOrderDate() {
     return this.orderDate;
   }
 
   public void setOrderDate(Timestamp orderDate) {
     this.orderDate = orderDate;
   }
 
   public Integer getTime() {
     return this.time;
   }
 
   public void setTime(Integer time) {
     this.time = time;
   }
 }

