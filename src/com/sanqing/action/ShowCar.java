 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import java.util.List;
 
 public class ShowCar extends ActionSupport
 {
   private List<CommodityClass> commodityClasses;
   private CommodityClassService commodityClassService;
 
   public String execute()
     throws Exception
   {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     return "success";
   }
 
   public CommodityClassService getCommodityClassService() {
     return this.commodityClassService;
   }
 
   public void setCommodityClassService(CommodityClassService commodityClassService) {
     this.commodityClassService = commodityClassService;
   }
 
   public List<CommodityClass> getCommodityClasses() {
     return this.commodityClasses;
   }
 
   public void setCommodityClasses(List<CommodityClass> commodityClasses) {
     this.commodityClasses = commodityClasses;
   }
 }

