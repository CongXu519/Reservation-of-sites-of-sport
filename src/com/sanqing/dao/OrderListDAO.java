package com.sanqing.dao;

import com.sanqing.po.OrderList;
import java.util.List;

public abstract interface OrderListDAO
{
  public abstract void save(OrderList paramOrderList);

  public abstract List<OrderList> getOrdersByOrderFormID(Integer paramInteger);
}

