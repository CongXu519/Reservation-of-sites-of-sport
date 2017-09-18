 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.page.Page;
 import com.sanqing.page.Result;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.CommodityService;
 import java.util.List;
 
 public class ShowByClass extends ActionSupport
 {
   private int commodityClassID;
   private int currentPage;
   private Page page;
   private CommodityService commodityService;
   private List<Commodity> commodities;
   private CommodityClassService commodityClassService;
   private List<CommodityClass> commodityClasses;
   private CommodityClass commodityClass;
 
   public int getCommodityClassID()
   {
     return this.commodityClassID;
   }
   public void setCommodityClassID(int commodityClassID) {
     this.commodityClassID = commodityClassID;
   }
   public int getCurrentPage() {
     return this.currentPage;
   }
   public void setCurrentPage(int currentPage) {
     this.currentPage = currentPage;
   }
   public CommodityService getCommodityService() {
     return this.commodityService;
   }
   public void setCommodityService(CommodityService commodityService) {
     this.commodityService = commodityService;
   }
   public List<Commodity> getCommodities() {
     return this.commodities;
   }
   public void setCommodities(List<Commodity> commodities) {
     this.commodities = commodities;
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
   public void setCommodityClassService(CommodityClassService commodityClassService) {
     this.commodityClassService = commodityClassService;
   }
   public List<CommodityClass> getCommodityClasses() {
     return this.commodityClasses;
   }
   public void setCommodityClasses(List<CommodityClass> commodityClasses) {
     this.commodityClasses = commodityClasses;
   }
   public CommodityClass getCommodityClass() {
     return this.commodityClass;
   }
   public void setCommodityClass(CommodityClass commodityClass) {
     this.commodityClass = commodityClass;
   }
   public String execute() throws Exception {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     this.commodityClass = this.commodityClassService.queryByID(this.commodityClassID);
     Page newPage = new Page();
     newPage.setCurrentPage(this.currentPage);
     newPage.setEveryPage(9);
     Result result = this.commodityService
       .queryByCommodityClass(this.commodityClass, newPage);
     this.page = result.getPage();
     this.commodities = result.getList();
     return "success";
   }
 }

