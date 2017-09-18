 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.CommodityService;
 import java.util.List;
 
 public class GoIndex extends ActionSupport
 {
   private CommodityClassService commodityClassService;
   private List<CommodityClass> commodityClasses;
   private CommodityService commodityService;
   private List<Commodity> commodities;
 
   public CommodityClassService getCommodityClassService()
   {
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
 
   public CommodityService getCommodityService() {
     return this.commodityService;
   }
 
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
   }
 
   public List<Commodity> getCommodities() {
     return this.commodities;
   }
 
   public void setCommodities(List<Commodity> commodities) {
     this.commodities = commodities;
   }
 
   public String execute() throws Exception {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     this.commodities = this.commodityService.queryByRegTime(9);
     return "success";
   }
 }

