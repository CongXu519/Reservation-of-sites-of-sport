 package com.sanqing.po;
 
 import java.io.Serializable;
 import java.util.Date;
 
 public class User
   implements Serializable
 {
   private Integer userId;
   private String username;
   private String password;
   private String name;
   private Byte sex;
   private String address;
   private String phone;
   private String post;
   private String email;
   private Date regTime;
   private String regIpAddress;
 
   public User(Integer userId)
   {
     this.userId = userId;
   }
 
   public User(String username, String password, String address, String phone, String email)
   {
     this.username = username;
     this.password = password;
     this.address = address;
     this.phone = phone;
     this.email = email;
   }
 
   public User(String username, String password)
   {
     this.username = username;
     this.password = password;
   }
 
   public User()
   {
   }
 
   public User(String username, String password, String name, Byte sex, String address, String phone, String post, String email, Date regTime, String regIpAddress)
   {
     this.username = username;
     this.password = password;
     this.name = name;
     this.sex = sex;
     this.address = address;
     this.phone = phone;
     this.post = post;
     this.email = email;
     this.regTime = regTime;
     this.regIpAddress = regIpAddress;
   }
 
   public Integer getUserId() {
     return this.userId;
   }
 
   public void setUserId(Integer userId) {
     this.userId = userId;
   }
 
   public String getUsername() {
     return this.username;
   }
 
   public void setUsername(String username) {
     this.username = username;
   }
 
   public String getPassword() {
     return this.password;
   }
 
   public void setPassword(String password) {
     this.password = password;
   }
 
   public String getName() {
     return this.name;
   }
 
   public void setName(String name) {
     this.name = name;
   }
 
   public Byte getSex() {
     return this.sex;
   }
 
   public void setSex(Byte sex) {
     this.sex = sex;
   }
 
   public String getAddress() {
     return this.address;
   }
 
   public void setAddress(String address) {
     this.address = address;
   }
 
   public String getPhone() {
     return this.phone;
   }
 
   public void setPhone(String phone) {
     this.phone = phone;
   }
 
   public String getPost() {
     return this.post;
   }
 
   public void setPost(String post) {
     this.post = post;
   }
 
   public String getEmail() {
     return this.email;
   }
 
   public void setEmail(String email) {
     this.email = email;
   }
 
   public Date getRegTime() {
     return this.regTime;
   }
 
   public void setRegTime(Date regTime) {
     this.regTime = regTime;
   }
 
   public String getRegIpAddress() {
     return this.regIpAddress;
   }
 
   public void setRegIpAddress(String regIpAddress) {
     this.regIpAddress = regIpAddress;
   }
 }

