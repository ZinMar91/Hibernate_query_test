package h04.service;

import h04.entity.CustomerData;
import h04.entity.PhoneType;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DBOperation {

    Transaction tx = null;
    Session session = null;

    public Integer savePhone(PhoneType p) {
        System.out.println(p.getPhonetype());
        Integer id;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            id = (Integer) session.save(p);
            tx.commit();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
            return 0;
        } finally {
            session.close();
        }
    }

    public boolean savecustomer(CustomerData c) {

        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.persist(c);
            tx.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            session.close();
        }
    }

    public List<CustomerData> searchdata(String address, String city) {

        System.out.println(address + city);
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            SQLQuery q = session.createSQLQuery("select * from CustomerData c where c.city LIKE :city and c.address LIKE :address");
            System.out.println("Success");
            q.addEntity(CustomerData.class);
            q.setParameter("city", city);
            q.setParameter("address", address);

            tx.commit();
            List<CustomerData> list = q.list();
            System.out.println(list.get(0).getAge());
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
            return null;
        } finally {
            session.close();
        }
    }
}
