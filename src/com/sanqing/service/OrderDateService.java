package com.sanqing.service;

import com.sanqing.po.Commodity;
import com.sanqing.po.OrderDate;
import java.util.Date;
import java.util.List;

public abstract interface OrderDateService
{
  public abstract void addDate(OrderDate paramOrderDate);

  public abstract void deleteDate(Commodity paramCommodity, Date paramDate);

  public abstract List<OrderDate> showOrderDates(Commodity paramCommodity);
}

