 package com.sanqing.po;
 
 import java.io.Serializable;
 import java.util.Date;
 
 public class Commodity
   implements Serializable
 {
   private Integer commodityId;
   private CommodityClass commodityClass;
   private String commodityName;
   private String address;
   private String commodityDepict;
   private Double commodityPrice;
   private Double fcPrice;
   private Integer timeMin;
   private Integer timeMax;
   private Date regTime;
   private byte[] image;
 
   public Commodity(Integer commodityId)
   {
     this.commodityId = commodityId;
   }
 
   public Commodity()
   {
   }
 
   public Commodity(CommodityClass commodityClass, String commodityName, String address, String commodityDepict, Double commodityPrice, Double fcPrice, Integer timeMin, Integer timeMax, Date regTime, byte[] image)
   {
     this.commodityClass = commodityClass;
     this.commodityName = commodityName;
     this.address = address;
     this.commodityDepict = commodityDepict;
     this.commodityPrice = commodityPrice;
     this.fcPrice = fcPrice;
     this.timeMin = timeMin;
     this.timeMax = timeMax;
     this.regTime = regTime;
     this.image = image;
   }
 
   public Integer getCommodityId() {
     return this.commodityId;
   }
 
   public void setCommodityId(Integer commodityId) {
     this.commodityId = commodityId;
   }
 
   public CommodityClass getCommodityClass() {
     return this.commodityClass;
   }
 
   public void setCommodityClass(CommodityClass commodityClass) {
     this.commodityClass = commodityClass;
   }
 
   public String getCommodityName() {
     return this.commodityName;
   }
 
   public void setCommodityName(String commodityName) {
     this.commodityName = commodityName;
   }
 
   public String getCommodityDepict()
   {
     return this.commodityDepict;
   }
 
   public void setCommodityDepict(String commodityDepict) {
     this.commodityDepict = commodityDepict;
   }
 
   public Double getCommodityPrice() {
     return this.commodityPrice;
   }
 
   public void setCommodityPrice(Double commodityPrice) {
     this.commodityPrice = commodityPrice;
   }
 
   public Double getFcPrice() {
     return this.fcPrice;
   }
 
   public void setFcPrice(Double fcPrice) {
     this.fcPrice = fcPrice;
   }
 
   public Date getRegTime()
   {
     return this.regTime;
   }
 
   public void setRegTime(Date regTime) {
     this.regTime = regTime;
   }
 
   public byte[] getImage() {
     return this.image;
   }
 
   public void setImage(byte[] image) {
     this.image = image;
   }
 
   public String getAddress() {
     return this.address;
   }
 
   public void setAddress(String address) {
     this.address = address;
   }
 
   public Integer getTimeMin() {
     return this.timeMin;
   }
 
   public void setTimeMin(Integer timeMin) {
     this.timeMin = timeMin;
   }
 
   public Integer getTimeMax() {
     return this.timeMax;
   }
 
   public void setTimeMax(Integer timeMax) {
     this.timeMax = timeMax;
   }
 }

