package com.sanqing.service;

import com.sanqing.page.Page;
import com.sanqing.page.Result;
import com.sanqing.po.Commodity;
import com.sanqing.po.CommodityClass;
import java.util.List;

public abstract interface CommodityService
{
  public abstract void addCommodity(Commodity paramCommodity);

  public abstract Result findAllCommodity(Page paramPage);

  public abstract void deleteCommodity(int paramInt);

  public abstract List<Commodity> queryByRegTime(int paramInt);

  public abstract Commodity queryByCommodityID(int paramInt);

  public abstract Result queryByCommodityClass(CommodityClass paramCommodityClass, Page paramPage);

  public abstract List<Commodity> findAllCommodity();
}

