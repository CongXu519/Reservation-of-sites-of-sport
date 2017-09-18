 package com.sanqing.po;
 
 import java.io.Serializable;
 
 public class CommodityClass
   implements Serializable
 {
   private Integer commodityClassId;
   private String commodityClassName;
 
   public Integer getCommodityClassId()
   {
     return this.commodityClassId;
   }
 
   public void setCommodityClassId(Integer commodityClassId) {
     this.commodityClassId = commodityClassId;
   }
 
   public String getCommodityClassName() {
     return this.commodityClassName;
   }
 
   public void setCommodityClassName(String commodityClassName) {
     this.commodityClassName = commodityClassName;
   }
 
   public CommodityClass(Integer commodityClassId)
   {
     this.commodityClassId = commodityClassId;
   }
 
   public CommodityClass()
   {
   }
 }

