 package com.sanqing.action;
 
 import com.opensymphony.xwork2.ActionContext;
 import com.opensymphony.xwork2.ActionSupport;
 import java.util.Map;
 
 public class LogOut extends ActionSupport
 {
   public String execute()
     throws Exception
   {
     Map session = ActionContext.getContext().getSession();
     session.remove("user");
     session.remove("password");
     return "success";
   }
 }

