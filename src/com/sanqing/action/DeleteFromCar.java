 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionContext;
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.CommodityService;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 
 public class DeleteFromCar extends ActionSupport
 {
   private int commodityID;
   private CommodityService commodityService;
   private CommodityClassService commodityClassService;
   private List<CommodityClass> commodityClasses;
 
   public int getCommodityID()
   {
     return this.commodityID;
   }
 
   public void setCommodityID(int commodityID) {
     this.commodityID = commodityID;
   }
 
   public CommodityService getCommodityService() {
     return this.commodityService;
   }
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
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
   public String execute() throws Exception {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     Map session = ActionContext.getContext().getSession();
     List car = (List)session.get("car");
     Iterator it = car.iterator();
     for (int i = car.size(); it.hasNext(); i--) {
       Commodity com = (Commodity)it.next();
       if (com.getCommodityId().intValue() == this.commodityID) {
         int index = car.indexOf(com);
         it.remove();
       }
     }
     session.put("car", car);
     return "success";
   }
 }

