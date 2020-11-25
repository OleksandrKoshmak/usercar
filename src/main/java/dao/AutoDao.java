package dao;

import hibernateUtil.HibernateUtil;
import models.Auto;
import models.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AutoDao implements AutoDaoInterface {
    public Auto findByID(int id) {
        Auto auto = null;
     try (  Session session = HibernateUtil.getSessionFactory().openSession()) {
         Transaction tx1 = session.beginTransaction();
         auto = session.get(Auto.class, id);
         tx1.commit();
     } catch (HibernateException e) {
         e.printStackTrace();
     }
return auto;
    }

    public void save(Auto auto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(auto);
        tx1.commit();
        session.close();

    }

    public void update(Auto auto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(auto);
        tx1.commit();
        session.close();

    }

    public void delete(Auto auto) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            session.delete(auto);
            tx1.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }


    public List<Auto> findALL() {
        List<Auto> autosList = (List<Auto>) HibernateUtil.getSessionFactory().openSession().createQuery("From Auto").list();
        return autosList;

    }
}
