 package com.sanqing.dao.impl;
 
 import com.sanqing.dao.CommodityClassDAO;
 import com.sanqing.page.Page;
 import com.sanqing.po.CommodityClass;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.springframework.orm.hibernate3.HibernateTemplate;
 import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
 public class CommodityClassDAOImpl extends HibernateDaoSupport
   implements CommodityClassDAO
 {
   public List<CommodityClass> findAll(Page page)
   {
     Session session = getSession();
     Query query = session.createQuery("from CommodityClass");
     query.setFirstResult(page.getBeginIndex());
     query.setMaxResults(page.getEveryPage());
     return query.list();
   }
   public void save(CommodityClass commodityclass) {
     getHibernateTemplate().save(commodityclass);
   }
   public int findAllCount() {
     List commodityClasses = 
       getHibernateTemplate().find("from CommodityClass");
     return commodityClasses.size();
   }
 
   public List<CommodityClass> findAll() {
     return getHibernateTemplate().find("from CommodityClass");
   }
   public CommodityClass findByID(int commodityClassID) {
     return (CommodityClass)getHibernateTemplate().load(CommodityClass.class, Integer.valueOf(commodityClassID));
   }
 }

