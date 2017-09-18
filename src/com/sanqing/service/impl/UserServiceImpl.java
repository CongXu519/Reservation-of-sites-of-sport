 package com.sanqing.service.impl;
 
 import com.sanqing.dao.UserDAO;
 import com.sanqing.po.User;
 import com.sanqing.service.UserService;
 
 public class UserServiceImpl
   implements UserService
 {
   private UserDAO userDAO;
 
   public void setUserDAO(UserDAO userDAO)
   {
     this.userDAO = userDAO;
   }
 
   public String addUser(User user) {
     return this.userDAO.register(user);
   }
 
   public String loginValidate(User user) {
     return this.userDAO.login(user);
   }
 
   public Integer getUserID(User user) {
     return this.userDAO.getUserID(user);
   }
 }

