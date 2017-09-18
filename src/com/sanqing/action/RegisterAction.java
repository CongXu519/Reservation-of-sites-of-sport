 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.User;
 import com.sanqing.service.UserService;
 
 public class RegisterAction extends ActionSupport
 {
   private UserService userService;
   private String username;
   private String password;
   private String address;
   private String phone;
   private String email;
 
   public void setUserService(UserService userService)
   {
     this.userService = userService;
   }
 
   public String execute()
     throws Exception
   {
     User user = new User(this.username, this.password, this.address, 
       this.phone, this.email);
     String result = this.userService.addUser(user);
     String res = "value initial";
     if (result.equals("register success !")) {
       res = "success";
     }
     return res;
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
 
   public String getEmail() {
     return this.email;
   }
 
   public void setEmail(String email) {
     this.email = email;
   }
 }

