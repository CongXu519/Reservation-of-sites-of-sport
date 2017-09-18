 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.service.CommodityService;
 import java.io.ByteArrayInputStream;
 
 public class ShowImg extends ActionSupport
 {
   private CommodityService commodityService;
   private int CommodityID;
   private ByteArrayInputStream inputStream;
 
   public CommodityService getCommodityService()
   {
     return this.commodityService;
   }
 
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
   }
 
   public int getCommodityID() {
     return this.CommodityID;
   }
 
   public void setCommodityID(int commodityID) {
     this.CommodityID = commodityID;
   }
 
   public ByteArrayInputStream getInputStream() {
     return this.inputStream;
   }
 
   public void setInputStream(ByteArrayInputStream inputStream) {
     this.inputStream = inputStream;
   }
 
   public String execute() throws Exception {
     Commodity commodity = this.commodityService.queryByCommodityID(this.CommodityID);
     this.inputStream = new ByteArrayInputStream(commodity.getImage());
     return "success";
   }
 }

