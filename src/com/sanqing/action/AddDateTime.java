 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.po.OrderDate;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.CommodityService;
 import com.sanqing.service.OrderDateService;
 import java.sql.Timestamp;
 import java.util.List;
 
 public class AddDateTime extends ActionSupport
 {
   private Integer commodityClassID;
   private Integer commodityID;
   private String orderDate;
   private OrderDateService orderDateService;
   private CommodityClassService commodityClassService;
   private CommodityService commodityService;
   private List<CommodityClass> commodityClasses;
   private List<Commodity> commodities;
 
   public String addBefore()
   {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     this.commodities = this.commodityService.findAllCommodity();
     return "success";
   }
 
   public String execute()
     throws Exception
   {
     OrderDate od = new OrderDate(new CommodityClass(this.commodityClassID), 
       new Commodity(this.commodityID), 
       Timestamp.valueOf(this.orderDate));
 
     this.orderDateService.addDate(od);
     return "success";
   }
 
   public OrderDateService getOrderDateService() {
     return this.orderDateService;
   }
 
   public void setOrderDateService(OrderDateService orderDateService) {
     this.orderDateService = orderDateService;
   }
 
   public CommodityClassService getCommodityClassService() {
     return this.commodityClassService;
   }
 
   public void setCommodityClassService(CommodityClassService commodityClassService) {
     this.commodityClassService = commodityClassService;
   }
 
   public CommodityService getCommodityService() {
     return this.commodityService;
   }
 
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
   }
 
   public List<CommodityClass> getCommodityClasses() {
     return this.commodityClasses;
   }
 
   public void setCommodityClasses(List<CommodityClass> commodityClasses) {
     this.commodityClasses = commodityClasses;
   }
 
   public List<Commodity> getCommodities() {
     return this.commodities;
   }
 
   public void setCommodities(List<Commodity> commodities) {
     this.commodities = commodities;
   }
 
   public Integer getCommodityClassID() {
     return this.commodityClassID;
   }
 
   public void setCommodityClassID(Integer commodityClassID) {
     this.commodityClassID = commodityClassID;
   }
 
   public Integer getCommodityID() {
     return this.commodityID;
   }
 
   public void setCommodityID(Integer commodityID) {
     this.commodityID = commodityID;
   }
 
   public String getOrderDate() {
     return this.orderDate;
   }
 
   public void setOrderDate(String orderDate) {
     this.orderDate = orderDate;
   }
 }

