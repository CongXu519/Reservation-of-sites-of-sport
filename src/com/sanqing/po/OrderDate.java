 package com.sanqing.po;
 
 import java.io.Serializable;
 import java.sql.Timestamp;
 
 public class OrderDate
   implements Serializable
 {
   private Integer orderDateID;
   private CommodityClass commodityClass;
   private Commodity commodity;
   private Timestamp orderDate;
   private Integer isSelected;
 
   public OrderDate(CommodityClass commodityClass, Commodity commodity, Timestamp orderDate)
   {
     this.commodityClass = commodityClass;
     this.commodity = commodity;
     this.orderDate = orderDate;
   }
 
   public OrderDate()
   {
   }
 
   public OrderDate(Integer orderDateID, CommodityClass commodityClass, Commodity commodity, Timestamp orderDate, Integer isSelected)
   {
     this.orderDateID = orderDateID;
     this.commodityClass = commodityClass;
     this.commodity = commodity;
     this.orderDate = orderDate;
     this.isSelected = isSelected;
   }
 
   public Integer getOrderDateID()
   {
     return this.orderDateID;
   }
   public void setOrderDateID(Integer orderDateID) {
     this.orderDateID = orderDateID;
   }
   public CommodityClass getCommodityClass() {
     return this.commodityClass;
   }
   public void setCommodityClass(CommodityClass commodityClass) {
     this.commodityClass = commodityClass;
   }
   public Commodity getCommodity() {
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
   public Integer getIsSelected() {
     return this.isSelected;
   }
   public void setIsSelected(Integer isSelected) {
     this.isSelected = isSelected;
   }
 }

