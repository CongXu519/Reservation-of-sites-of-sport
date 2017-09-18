 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionContext;
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.OrderForm;
 import com.sanqing.po.OrderList;
 import com.sanqing.po.User;
 import com.sanqing.service.OrderFormService;
 import com.sanqing.service.OrderListService;
 import com.sanqing.util.CommodityDateTime;
 import java.util.List;
 import java.util.Map;
 
 public class Pay extends ActionSupport
 {
   private OrderListService orderListService;
   private OrderFormService orderFormService;
 
   public void setOrderListService(OrderListService orderListService)
   {
     this.orderListService = orderListService;
   }
 
   public void setOrderFormService(OrderFormService orderFormService) {
     this.orderFormService = orderFormService;
   }
 
   public String execute()
     throws Exception
   {
     User user = new User();
     user.setUserId(Integer.valueOf(1));
 
     OrderForm orderForm = new OrderForm(user);
     orderForm.setIsPayoff(Integer.valueOf(1));
 
     this.orderFormService.addOrderForm(orderForm);
 
     List<CommodityDateTime> commoditiesDatesInCar = null;
     Map session = ActionContext.getContext().getSession();
     if (session.get("car") != null)
     {
       commoditiesDatesInCar = (List)session.get("car");
     }
 
     Double totalPrice = Double.valueOf(0.0D);
     for (CommodityDateTime com : commoditiesDatesInCar) {
       OrderList orderList = new OrderList();
 
       orderList.setCommodity(new Commodity(com.getCommodity().getCommodityId()));
       orderList.setOrderDate(com.getOrderDate());
 
       orderList.setOrderForm(orderForm);
       orderList.setTime(com.getTime());
 
       this.orderListService.addOrderList(orderList);
 
       totalPrice = Double.valueOf(totalPrice.doubleValue() + com.getPrice().doubleValue());
     }
     orderForm.setTotalPrice(totalPrice);
     ActionContext.getContext().getSession().remove("car");
 
     return "success";
   }
 }

