 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionContext;
 import com.opensymphony.xwork2.ActionSupport;
 import com.sanqing.po.User;
 import com.sanqing.service.UserService;
 import java.util.Map;
 
 public class LoginAction extends ActionSupport
 {
   private UserService userService;
   private String username;
   private String password;
 
   public void setUserService(UserService userService)
   {
     this.userService = userService;
   }
 
   public String execute()
     throws Exception
   {
     User user = new User(this.username, this.password);
     String result = this.userService.loginValidate(user);
     String res = "value initial";
     if (result.equals("uncorrect username or password !")) {
       res = "error";
     }
     else if (result.equals("login success !")) {
       Map session = ActionContext.getContext().getSession();
       session.put("username", this.username);
       session.put("password", this.password);
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
 }

