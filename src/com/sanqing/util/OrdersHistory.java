 package com.sanqing.util;
 
 import com.sanqing.po.Commodity;
 import java.sql.Timestamp;
 
 public class OrdersHistory
 {
   private Commodity commodity;
   private Integer time;
   private Timestamp orderDate;
 
   public OrdersHistory(Commodity commodity, Integer time, Timestamp orderDate)
   {
     this.commodity = commodity;
     this.time = time;
     this.orderDate = orderDate;
   }
   public Commodity getCommodity() {
     return this.commodity;
   }
   public void setCommodity(Commodity commodity) {
     this.commodity = commodity;
   }
   public Integer getTime() {
     return this.time;
   }
   public void setTime(Integer time) {
     this.time = time;
   }
   public Timestamp getOrderDate() {
     return this.orderDate;
   }
   public void setOrderDate(Timestamp orderDate) {
     this.orderDate = orderDate;
   }
 }

