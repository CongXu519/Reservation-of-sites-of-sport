package com.sanqing.service;

import com.sanqing.po.OrderList;
import com.sanqing.po.User;
import java.util.List;

public abstract interface OrderListService
{
  public abstract void addOrderList(OrderList paramOrderList);

  public abstract List<OrderList> getMyOrdersPaid(User paramUser);

  public abstract List<OrderList> getOrdersByFormID(Integer paramInteger);
}

