 package com.sanqing.util;
 
 import com.sanqing.po.Commodity;
 import java.sql.Timestamp;
 
 public class CommodityDateTime
 {
   private Commodity commodity;
   private Timestamp orderDate;
   private Integer time;
   private Double price;
 
   public CommodityDateTime(Commodity commodity, Timestamp orderDate, Integer time, Double price)
   {
     this.commodity = commodity;
     this.orderDate = orderDate;
     this.time = time;
     this.price = price;
   }
 
   public Commodity getCommodity()
   {
     return this.commodity;
   }
 
   public void setCommodity(Commodity commodity) {
     this.commodity = commodity;
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
 
   public Double getPrice() {
     return this.price;
   }
 
   public void setPrice(Double price) {
     this.price = price;
   }
 }

