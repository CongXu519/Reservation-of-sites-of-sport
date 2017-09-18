package com.sanqing.dao;

import com.sanqing.po.OrderForm;
import java.util.List;

public abstract interface OrderFormDAO
{
  public abstract void save(OrderForm paramOrderForm);

  public abstract List<Integer> getOrderFormsByUserID(Integer paramInteger);
}

