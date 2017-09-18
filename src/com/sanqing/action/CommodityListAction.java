 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.page.Page;
 import com.sanqing.page.Result;
 import com.sanqing.po.Commodity;
 import com.sanqing.service.CommodityService;
 import java.util.List;
 
 public class CommodityListAction extends ActionSupport
 {
   private CommodityService commodityService;
   private List<Commodity> commodities;
   private int currentPage;
   private Page page;
 
   public CommodityService getCommodityService()
   {
     return this.commodityService;
   }
 
   public void setCommodityService(CommodityService commodityService)
   {
     this.commodityService = commodityService;
   }
 
   public List<Commodity> getCommodities() {
     return this.commodities;
   }
 
   public void setCommodities(List<Commodity> commodities)
   {
     this.commodities = commodities;
   }
 
   public int getCurrentPage()
   {
     return this.currentPage;
   }
 
   public void setCurrentPage(int currentPage)
   {
     this.currentPage = currentPage;
   }
 
   public Page getPage()
   {
     return this.page;
   }
 
   public void setPage(Page page)
   {
     this.page = page;
   }
 
   public String execute() throws Exception {
     Page newPage = new Page();
     newPage.setCurrentPage(this.currentPage);
     newPage.setEveryPage(10);
     Result result = this.commodityService.findAllCommodity(newPage);
     this.page = result.getPage();
     this.commodities = result.getList();
     return "success";
   }
 }

