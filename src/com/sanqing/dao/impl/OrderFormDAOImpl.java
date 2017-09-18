 package com.sanqing.dao.impl;
 
 import com.sanqing.dao.OrderFormDAO;
 import com.sanqing.po.OrderForm;
 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.springframework.orm.hibernate3.HibernateTemplate;
 import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
 public class OrderFormDAOImpl extends HibernateDaoSupport
   implements OrderFormDAO
 {
   public void save(OrderForm orderform)
   {
     getHibernateTemplate().save(orderform);
   }
 
   public List<Integer> getOrderFormsByUserID(Integer userID) {
     List list = new ArrayList();
     Session session = getSession();
     Query query = session.createQuery("from OrderForm where userID =:userID");
     query.setInteger("userID", userID.intValue());
     for (OrderForm of : (List<OrderForm>)query.list()) {
       list.add(of.getOrderFormId());
     }
 
     System.out.println(list);
     return list;
   }
 }

