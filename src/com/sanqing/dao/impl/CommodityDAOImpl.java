 package com.sanqing.dao.impl;
 
 import com.sanqing.dao.CommodityDAO;
 import com.sanqing.page.Page;
 import com.sanqing.po.Commodity;
 import com.sanqing.po.CommodityClass;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.springframework.orm.hibernate3.HibernateTemplate;
 import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
 public class CommodityDAOImpl extends HibernateDaoSupport
   implements CommodityDAO
 {
   public List<Commodity> findAll(Page page)
   {
     Session session = getSession();
     Query query = session.createQuery("from Commodity");
     query.setFirstResult(page.getBeginIndex());
     query.setMaxResults(page.getEveryPage());
     return query.list();
   }
   public List<Commodity> findAll() {
     Session session = getSession();
     Query query = session.createQuery("from Commodity");
     return query.list();
   }
   public void save(Commodity commodity) {
     getHibernateTemplate().save(commodity);
   }
   public int findAllCount() {
     List commodities = 
       getHibernateTemplate().find("from Commodity");
     return commodities.size();
   }
   public void delete(int commodityID) {
     Commodity commodity = (Commodity)getHibernateTemplate()
       .load(Commodity.class, Integer.valueOf(commodityID));
     getHibernateTemplate().delete(commodity);
   }
   public List<Commodity> findByTime(int num) {
     Session session = getSession();
     Query query = session.createQuery(
       "from Commodity order by regTime desc");
     query.setFirstResult(0);
     query.setMaxResults(num);
     return query.list();
   }
   public Commodity findByID(int commodityID) {
     return (Commodity)getHibernateTemplate().load(Commodity.class, Integer.valueOf(commodityID));
   }
   public List<Commodity> findByClass(CommodityClass commodityClass, Page page) {
     Session session = getSession();
     Query query = session.createQuery("from Commodity where commodityClass =:commodityClass");
     query.setEntity("commodityClass", commodityClass);
     query.setFirstResult(page.getBeginIndex());
     query.setMaxResults(page.getEveryPage());
     return query.list();
   }
   public int findAllCount(CommodityClass commodityClass) {
     Session session = getSession();
     Query query = session.createQuery("from Commodity where commodityClass =:commodityClass");
     query.setEntity("commodityClass", commodityClass);
     return query.list().size();
   }
 }

