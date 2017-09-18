 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.po.OrderDate;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.CommodityService;
 import com.sanqing.service.OrderDateService;
 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.List;
 
 public class ShowCommodity extends ActionSupport
 {
   private CommodityService commodityService;
   private Commodity commodity;
   private CommodityClassService commodityClassService;
   private List<CommodityClass> commodityClasses;
   private int commodityID;
   private OrderDateService orderDateService;
   private List<OrderDate> orderDates;
   private List<Integer> timeList;
 
   public CommodityService getCommodityService()
   {
     return this.commodityService;
   }
 
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
   }
 
   public Commodity getCommodity() {
     return this.commodity;
   }
 
   public void setCommodity(Commodity commodity) {
     this.commodity = commodity;
   }
 
   public CommodityClassService getCommodityClassService() {
     return this.commodityClassService;
   }
 
   public void setCommodityClassService(CommodityClassService commodityClassService)
   {
     this.commodityClassService = commodityClassService;
   }
 
   public List<CommodityClass> getCommodityClasses() {
     return this.commodityClasses;
   }
 
   public void setCommodityClasses(List<CommodityClass> commodityClasses) {
     this.commodityClasses = commodityClasses;
   }
 
   public int getCommodityID() {
     return this.commodityID;
   }
 
   public void setCommodityID(int commodityID) {
     this.commodityID = commodityID;
   }
 
   public String execute() throws Exception
   {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
 
     this.commodity = this.commodityService.queryByCommodityID(this.commodityID);
 
     this.orderDates = this.orderDateService.showOrderDates(this.commodity);
     System.out.println("ssssssssssssssssssssssssssssss");
 
     this.timeList = new ArrayList();
     for (int i = this.commodity.getTimeMin().intValue(); i <= this.commodity.getTimeMax().intValue(); i++) {
       System.out.println(this.commodity.getTimeMax());
       System.out.println(i);
       this.timeList.add(new Integer(i));
       System.out.println(this.timeList.get(0));
       System.out.println("dddddddddddddddddddddd" + i);
     }
     System.out.println(this.commodityClasses);
     System.out.println(this.commodity);
     System.out.println(this.orderDates);
     System.out.println(this.timeList);
 
     return "success";
   }
 
   public OrderDateService getOrderDateService() {
     return this.orderDateService;
   }
 
   public void setOrderDateService(OrderDateService orderDateService) {
     this.orderDateService = orderDateService;
   }
 
   public List<OrderDate> getOrderDates() {
     return this.orderDates;
   }
 
   public void setOrderDates(List<OrderDate> orderDates) {
     this.orderDates = orderDates;
   }
 
   public List<Integer> getTimeList() {
     return this.timeList;
   }
 
   public void setTimeList(List<Integer> timeList) {
     this.timeList = timeList;
   }
 }

