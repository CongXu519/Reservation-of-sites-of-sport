package com.sanqing.dao;

import com.sanqing.page.Page;
import com.sanqing.po.Commodity;
import com.sanqing.po.CommodityClass;
import java.util.List;

public abstract interface CommodityDAO
{
  public abstract void save(Commodity paramCommodity);

  public abstract List<Commodity> findAll(Page paramPage);

  public abstract int findAllCount();

  public abstract void delete(int paramInt);

  public abstract List<Commodity> findByTime(int paramInt);

  public abstract Commodity findByID(int paramInt);

  public abstract List<Commodity> findByClass(CommodityClass paramCommodityClass, Page paramPage);

  public abstract int findAllCount(CommodityClass paramCommodityClass);

  public abstract List<Commodity> findAll();
}

