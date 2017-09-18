 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionContext;
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.po.OrderList;
 import com.sanqing.po.User;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.OrderListService;
 import com.sanqing.util.OrdersHistory;
 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Map;
 
 public class GetOrdersPaid extends ActionSupport
 {
   private OrderListService orderListService;
   private List<OrdersHistory> orders;
   private List<CommodityClass> commodityClasses;
   private CommodityClassService commodityClassService;
 
   public OrderListService getOrderListService()
   {
     return this.orderListService;
   }
 
   public void setOrderListService(OrderListService orderListService) {
     this.orderListService = orderListService;
   }
 
   public String execute() throws Exception
   {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     Map session = ActionContext.getContext().getSession();
     String username = (String)session.get("username");
     String password = (String)session.get("password");
     System.out.println(username);
     System.out.println(password);
     User user = new User(username, password);
     List<OrderList> ordersPaid = this.orderListService.getMyOrdersPaid(user);
 
     this.orders = new ArrayList<OrdersHistory>();
     for (OrderList ol : ordersPaid) {
       System.out.println(ol.getCommodity());
       System.out.println(ol.getCommodity().getCommodityName());
       this.orders.add(new OrdersHistory(ol.getCommodity(), ol.getTime(), ol.getOrderDate()));
     }
     System.out.println(this.orders);
     return "success";
   }
 
   public List<OrdersHistory> getOrders() {
     return this.orders;
   }
 
   public void setOrders(List<OrdersHistory> orders) {
     this.orders = orders;
   }
 
   public List<CommodityClass> getCommodityClasses() {
     return this.commodityClasses;
   }
 
   public void setCommodityClasses(List<CommodityClass> commodityClasses) {
     this.commodityClasses = commodityClasses;
   }
 
   public CommodityClassService getCommodityClassService() {
     return this.commodityClassService;
   }
 
   public void setCommodityClassService(CommodityClassService commodityClassService) {
     this.commodityClassService = commodityClassService;
   }
 }

