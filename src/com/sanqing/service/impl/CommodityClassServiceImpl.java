 package com.sanqing.service.impl;
 
 import com.sanqing.dao.CommodityClassDAO;
 import com.sanqing.page.Page;
 import com.sanqing.page.PageUtil;
 import com.sanqing.page.Result;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import java.util.List;
 
 public class CommodityClassServiceImpl
   implements CommodityClassService
 {
   private CommodityClassDAO commodityClassDAO;
 
   public void setCommodityClassDAO(CommodityClassDAO commodityClassDAO)
   {
     this.commodityClassDAO = commodityClassDAO;
   }
   public void addCommodityClass(CommodityClass commodityClass) {
     this.commodityClassDAO.save(commodityClass);
   }
   public Result findAllCommodityClass(Page page) {
     page = PageUtil.createPage(page, 
       this.commodityClassDAO.findAllCount());
     List commodityClasses = 
       this.commodityClassDAO.findAll(page);
     Result result = new Result();
     result.setPage(page);
     result.setList(commodityClasses);
     return result;
   }
   public List<CommodityClass> findAllCommodityClass() {
     return this.commodityClassDAO.findAll();
   }
   public CommodityClass queryByID(int commodityClassID) {
     return this.commodityClassDAO.findByID(commodityClassID);
   }
 }

