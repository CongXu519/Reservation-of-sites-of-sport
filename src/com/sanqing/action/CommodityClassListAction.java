 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.page.Page;
 import com.sanqing.page.Result;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import java.util.List;
 
 public class CommodityClassListAction extends ActionSupport
 {
   private CommodityClassService commodityClassService;
   private int currentPage;
   private Page page;
   private List<CommodityClass> commodityClasses;
 
   public List<CommodityClass> getCommodityClasses()
   {
     return this.commodityClasses;
   }
   public void setCommodityClassService(CommodityClassService commodityClassService) {
     this.commodityClassService = commodityClassService;
   }
   public int getCurrentPage() {
     return this.currentPage;
   }
   public void setCurrentPage(int currentPage) {
     this.currentPage = currentPage;
   }
   public Page getPage() {
     return this.page;
   }
   public void setPage(Page page) {
     this.page = page;
   }
   public CommodityClassService getCommodityClassService() {
     return this.commodityClassService;
   }
   public void setCommodityClasses(List<CommodityClass> commodityClasses) {
     this.commodityClasses = commodityClasses;
   }
   public String execute() throws Exception {
     Page newPage = new Page();
     newPage.setCurrentPage(this.currentPage);
     newPage.setEveryPage(10);
     Result result = this.commodityClassService.findAllCommodityClass(newPage);
     this.page = result.getPage();
     this.commodityClasses = result.getList();
     return "success";
   }
 }

