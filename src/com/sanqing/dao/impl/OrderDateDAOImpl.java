 package com.sanqing.dao.impl;
 
 import com.sanqing.dao.OrderDateDAO;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.OrderDate;
 import java.sql.Timestamp;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.springframework.orm.hibernate3.HibernateTemplate;
 import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
 public class OrderDateDAOImpl extends HibernateDaoSupport
   implements OrderDateDAO
 {
   public void save(OrderDate orderDate)
   {
     getHibernateTemplate().save(orderDate);
   }
 
   public void delete(Commodity commodity, Date orderDate)
   {
     Session session = getSession();
     Query query = session.createQuery("from OrderDate o where o.commodity=:commodity and o.orderDate:=orderDate");
 
     query.setEntity("commodity", commodity);
     query.setEntity("orderDate", orderDate);
 
     if (query.list().size() >= 1)
       getHibernateTemplate().delete((OrderDate)query.list().get(0));
   }
 
   public List<OrderDate> showOrderDates(Commodity commodity)
   {
     Session session = getSession();
     Query query = session.createQuery("from OrderDate where commodity=:commodity");
 
     query.setEntity("commodity", commodity);
 
     List dateToShow = new ArrayList();
     if (query.list().size() >= 1)
     {
       for (int i = 0; i < query.list().size(); i++) {
         if (((OrderDate)query.list().get(i)).getOrderDate().getTime() - new Date().getTime() > 0L)
         {
           dateToShow.add((OrderDate)query.list().get(i));
         }
       }
     }
     return dateToShow;
   }
 }

