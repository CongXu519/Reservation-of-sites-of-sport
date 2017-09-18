 package com.sanqing.dao.impl;
 
 import com.sanqing.dao.UserDAO;
 import com.sanqing.po.User;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.springframework.orm.hibernate3.HibernateTemplate;
 import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
 public class UserDAOImpl extends HibernateDaoSupport
   implements UserDAO
 {
   public String login(User user)
   {
     String result = null;
     Session session = getSession();
     Query query = session.createQuery("from User where username =:username and password=:password ");
     query.setString("username", user.getUsername());
     query.setString("password", user.getPassword());
     if (query.list().size() == 0) {
       result = "uncorrect username or password !";
     }
     else if (query.list().size() == 1) {
       result = "login success !";
     }
     return result;
   }
   public String register(User user) {
     getHibernateTemplate().save(user);
     return "register success !";
   }
 
   public Integer getUserID(User user) {
     int result = 0;
     Session session = getSession();
     Query query = session.createQuery("from User where username =:username and password=:password ");
     query.setString("username", user.getUsername());
     query.setString("password", user.getPassword());
     if (query.list().size() == 0) {
       result = -1;
     }
     else if (query.list().size() == 1) {
       result = ((User)query.list().get(0)).getUserId().intValue();
     }
     return Integer.valueOf(result);
   }
 }

