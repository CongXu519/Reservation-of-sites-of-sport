 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionContext;
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.CommodityService;
 import com.sanqing.util.CommodityDateTime;
 import java.io.PrintStream;
 import java.sql.Timestamp;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Map;
 
 public class AddToCarAction extends ActionSupport
 {
   private CommodityService commodityService;
   private CommodityClassService commodityClassService;
   private List<CommodityClass> commodityClasses;
   private int commodityID;
   private String orderDate;
   private String time;
 
   public CommodityService getCommodityService()
   {
     return this.commodityService;
   }
 
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
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
 
   public String execute() throws Exception {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     Commodity commodity = this.commodityService.queryByCommodityID(this.commodityID);
 
     System.out.println(this.orderDate);
     double price = commodity.getFcPrice().doubleValue() * Integer.valueOf(this.time).intValue();
     System.out.println(price);
     CommodityDateTime cd = new CommodityDateTime(commodity, Timestamp.valueOf(this.orderDate), Integer.valueOf(this.time), Double.valueOf(price));
 
     Map session = ActionContext.getContext().getSession();
     List car = null;
     if (session.get("car") == null)
       car = new ArrayList();
     else {
       car = (List)session.get("car");
     }
     car.add(cd);
     session.put("car", car);
     return "success";
   }
 
   public String getOrderDate() {
     return this.orderDate;
   }
 
   public void setOrderDate(String orderDate) {
     this.orderDate = orderDate;
   }
 
   public String getTime() {
     return this.time;
   }
 
   public void setTime(String time) {
     this.time = time;
   }
 }

