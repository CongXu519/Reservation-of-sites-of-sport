package com.sanqing.service;

import com.sanqing.page.Page;
import com.sanqing.page.Result;
import com.sanqing.po.CommodityClass;
import java.util.List;

public abstract interface CommodityClassService
{
  public abstract void addCommodityClass(CommodityClass paramCommodityClass);

  public abstract Result findAllCommodityClass(Page paramPage);

  public abstract List<CommodityClass> findAllCommodityClass();

  public abstract CommodityClass queryByID(int paramInt);
}

