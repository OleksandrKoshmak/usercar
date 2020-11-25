package dao;

import java.util.List;
import hibernateUtil.HibernateUtil;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao implements UserDaoInterface{S

    public User findByID(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();

    }

    public void update(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public List<User> findALLByID() {
        List<User> users = (List<User>)  HibernateUtil.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }
}
