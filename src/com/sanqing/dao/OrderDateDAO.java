package com.sanqing.dao;

import com.sanqing.po.Commodity;
import com.sanqing.po.OrderDate;
import java.util.Date;
import java.util.List;

public abstract interface OrderDateDAO
{
  public abstract void save(OrderDate paramOrderDate);

  public abstract void delete(Commodity paramCommodity, Date paramDate);

  public abstract List<OrderDate> showOrderDates(Commodity paramCommodity);
}

