package com.sanqing.service;

import com.sanqing.po.OrderForm;
import java.util.List;

public abstract interface OrderFormService
{
  public abstract void addOrderForm(OrderForm paramOrderForm);

  public abstract List<Integer> getAllOrderForm(Integer paramInteger);
}

