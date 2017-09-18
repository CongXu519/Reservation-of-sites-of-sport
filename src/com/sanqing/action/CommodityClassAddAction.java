 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 
 public class CommodityClassAddAction extends ActionSupport
 {
   private String commodityClassName;
   private CommodityClassService commodityClassService;
 
   public void setCommodityClassName(String commodityClassName)
   {
     this.commodityClassName = commodityClassName;
   }
 
   public void setCommodityClassService(CommodityClassService commodityClassService) {
     this.commodityClassService = commodityClassService;
   }
 
   public String execute() throws Exception {
     CommodityClass commodityClass = new CommodityClass();
     commodityClass.setCommodityClassName(this.commodityClassName);
     this.commodityClassService.addCommodityClass(commodityClass);
     return "success";
   }
 }

