 package com.sanqing.dao.impl;
 
 import com.sanqing.dao.OrderListDAO;
 import com.sanqing.po.OrderList;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.springframework.orm.hibernate3.HibernateTemplate;
 import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
 public class OrderListDAOImpl extends HibernateDaoSupport
   implements OrderListDAO
 {
   public void save(OrderList orderlist)
   {
     getHibernateTemplate().save(orderlist);
   }
 
   public List<OrderList> getOrdersByOrderFormID(Integer orderFormID)
   {
     Session session = getSession();
     Query query = session.createQuery("from OrderList where orderFormID =:orderFormID");
     query.setInteger("orderFormID", orderFormID.intValue());
 
     List list = query.list();
 
     return list;
   }
 }

