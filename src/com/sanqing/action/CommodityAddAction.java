 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import com.sanqing.service.CommodityClassService;
 import com.sanqing.service.CommodityService;
 import com.sanqing.util.FileToByte;
 import java.io.File;
 import java.util.Date;
 import java.util.List;
 
 public class CommodityAddAction extends ActionSupport
 {
   private CommodityClassService commodityClassService;
   private List<CommodityClass> commodityClasses;
   private CommodityService commodityService;
   private CommodityClass commodityClass;
   private Integer commodityClassID;
   private String commodityName;
   private String address;
   private String commodityDepict;
   private Double commodityPrice;
   private Double fcPrice;
   private Integer timeMin;
   private Integer timeMax;
   private File uploadImage;
   private String uploadImageContentType;
   private String uploadImageFileName;
 
   public void setCommodityService(CommodityService commodityService)
   {
     this.commodityService = commodityService;
   }
 
   public CommodityClass getCommodityClass() {
     return this.commodityClass;
   }
 
   public void setCommodityClass(CommodityClass commodityClass) {
     this.commodityClass = commodityClass;
   }
 
   public Integer getCommodityClassID() {
     return this.commodityClassID;
   }
 
   public void setCommodityClassID(Integer commodityClassID) {
     this.commodityClassID = commodityClassID;
   }
 
   public String getCommodityName() {
     return this.commodityName;
   }
 
   public void setCommodityName(String commodityName) {
     this.commodityName = commodityName;
   }
 
   public String getCommodityDepict()
   {
     return this.commodityDepict;
   }
 
   public void setCommodityDepict(String commodityDepict) {
     this.commodityDepict = commodityDepict;
   }
 
   public Double getCommodityPrice() {
     return this.commodityPrice;
   }
 
   public void setCommodityPrice(Double commodityPrice) {
     this.commodityPrice = commodityPrice;
   }
 
   public Double getFcPrice() {
     return this.fcPrice;
   }
 
   public void setFcPrice(Double fcPrice) {
     this.fcPrice = fcPrice;
   }
 
   public File getUploadImage()
   {
     return this.uploadImage;
   }
 
   public void setUploadImage(File uploadImage) {
     this.uploadImage = uploadImage;
   }
 
   public String getUploadImageContentType() {
     return this.uploadImageContentType;
   }
 
   public void setUploadImageContentType(String uploadImageContentType) {
     this.uploadImageContentType = uploadImageContentType;
   }
 
   public String getUploadImageFileName() {
     return this.uploadImageFileName;
   }
 
   public void setUploadImageFileName(String uploadImageFileName) {
     this.uploadImageFileName = uploadImageFileName;
   }
 
   public CommodityClassService getCommodityClassService() {
     return this.commodityClassService;
   }
 
   public void setCommodityClassService(CommodityClassService commodityClassService)
   {
     this.commodityClassService = commodityClassService;
   }
 
   public List<CommodityClass> getCommodityClasses() {
     return this.commodityClasses;
   }
 
   public void setCommodityClasses(List<CommodityClass> commodityClasses) {
     this.commodityClasses = commodityClasses;
   }
 
   public String addBefore() {
     this.commodityClasses = this.commodityClassService.findAllCommodityClass();
     return "success";
   }
 
   public String execute() throws Exception {
     Commodity commodity = new Commodity();
 
     commodity.setCommodityClass(
       new CommodityClass(this.commodityClassID));
     commodity.setCommodityDepict(this.commodityDepict);
 
     commodity.setTimeMax(this.timeMax);
     commodity.setTimeMin(this.timeMin);
 
     commodity.setCommodityPrice(this.commodityPrice);
     commodity.setFcPrice(this.fcPrice);
     commodity.setAddress(this.address);
     commodity.setCommodityName(this.commodityName);
     commodity.setRegTime(new Date());
 
     File file = getUploadImage();
     if ((file != null) && (file.exists())) {
       commodity.setImage(FileToByte.getBytesFromFile(file));
     }
 
     this.commodityService.addCommodity(commodity);
     return "success";
   }
 
   public String getAddress() {
     return this.address;
   }
 
   public void setAddress(String address) {
     this.address = address;
   }
 
   public Integer getTimeMin() {
     return this.timeMin;
   }
 
   public void setTimeMin(Integer timeMin) {
     this.timeMin = timeMin;
   }
 
   public Integer getTimeMax() {
     return this.timeMax;
   }
 
   public void setTimeMax(Integer timeMax) {
     this.timeMax = timeMax;
   }
 }

