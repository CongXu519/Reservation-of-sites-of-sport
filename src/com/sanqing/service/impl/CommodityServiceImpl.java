 package com.sanqing.service.impl;
 
 import com.sanqing.dao.CommodityDAO;
 import com.sanqing.page.Page;
 import com.sanqing.page.PageUtil;
 import com.sanqing.page.Result;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityService;
 import java.util.List;
 
 public class CommodityServiceImpl
   implements CommodityService
 {
   private CommodityDAO commodityDAO;
 
   public void setCommodityDAO(CommodityDAO commodityDAO)
   {
     this.commodityDAO = commodityDAO;
   }
   public void addCommodity(Commodity commodity) {
     this.commodityDAO.save(commodity);
   }
   public Result findAllCommodity(Page page) {
     page = PageUtil.createPage(page, 
       this.commodityDAO.findAllCount());
     List commodityes = 
       this.commodityDAO.findAll(page);
     Result result = new Result();
     result.setPage(page);
     result.setList(commodityes);
     return result;
   }
 
   public List<Commodity> findAllCommodity()
   {
     List commodities = 
       this.commodityDAO.findAll();
 
     return commodities;
   }
 
   public void deleteCommodity(int commodityID) {
     this.commodityDAO.delete(commodityID);
   }
   public List<Commodity> queryByRegTime(int num) {
     return this.commodityDAO.findByTime(num);
   }
   public Commodity queryByCommodityID(int commodityID) {
     return this.commodityDAO.findByID(commodityID);
   }
   public Result queryByCommodityClass(CommodityClass commodityClass, Page page) {
     page = PageUtil.createPage(page, 
       this.commodityDAO.findAllCount(commodityClass));
     List commodityes = 
       this.commodityDAO.findByClass(commodityClass, page);
     Result result = new Result();
     result.setPage(page);
     result.setList(commodityes);
     return result;
   }
 }

