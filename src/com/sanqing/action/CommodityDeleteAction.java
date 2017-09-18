 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.service.CommodityService;
 
 public class CommodityDeleteAction extends ActionSupport
 {
   private Integer commodityID;
   private CommodityService commodityService;
 
   public void setCommodityID(Integer commodityID)
   {
     this.commodityID = commodityID;
   }
 
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
   }
 
   public String execute() throws Exception {
     this.commodityService.deleteCommodity(this.commodityID.intValue());
     return "success";
   }
 }

