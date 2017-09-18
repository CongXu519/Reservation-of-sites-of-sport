package com.sanqing.dao;

import com.sanqing.page.Page;
import com.sanqing.po.CommodityClass;
import java.util.List;

public abstract interface CommodityClassDAO
{
  public abstract void save(CommodityClass paramCommodityClass);

  public abstract List<CommodityClass> findAll(Page paramPage);

  public abstract int findAllCount();

  public abstract List<CommodityClass> findAll();

  public abstract CommodityClass findByID(int paramInt);
}

