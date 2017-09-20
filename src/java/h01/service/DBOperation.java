package h01.service;

import h01.entity.Count;
import h01.entity.Customer;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.*;
import util.HibernateUtil;

public class DBOperation {

    Transaction tx = null;
    Session session = null;
    List<Customer> custlist;
    List<Count> count;

    public boolean insertcustomer(Customer c) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.save(c);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            session.close();
        }
    }

    public List<Customer> searchAddress(String add) {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            Query q = session.getNamedQuery("byAddress");
            q.setParameter("address", add);
            tx = session.beginTransaction();
            custlist = q.list();
            tx.commit();
            return custlist;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return custlist;
        } finally {
            session.close();
        }

    }

    public List<Customer> searchName(String na) {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            Query q = session.createQuery("from Customer c where UPPER(c.userName) like ?");

            /*
		Remove Comment to use Native SQL query 
		SQLQuery q=session.createSQLQuery("select * from CustomerNewTable c where UPPER(c.userName) like ?");
		q.addEntity(Customer.class);
		
             */
            q.setParameter(0, na.toUpperCase());
            tx = session.beginTransaction();
            custlist = q.list();
            tx.commit();
            return custlist;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return custlist;
        } finally {
            session.close();
        }

    }

    public List<Customer> searchEmail(String mail) {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            Query q = session.createQuery("from Customer c where c.email like '%" + mail + "%'");
            tx = session.beginTransaction();
            custlist = q.list();
            tx.commit();
            return custlist;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return custlist;
        } finally {
            session.close();
        }

    }

    public HashMap countCustomer1() {
        HashMap<Object, Object> countMap = new HashMap<Object, Object>();

        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Query q = session.createQuery("select c.address,count(*) from Customer c group by c.address");
            Iterator it = q.iterate();
            while (it.hasNext()) {
                Object values[] = (Object[]) it.next();
                countMap.put(values[0], values[1]);
                System.out.println(countMap.get(values[0]));

            }
            tx.commit();
            return countMap;
        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }
            e.getStackTrace();
            return null;
        } finally {
            session.close();
        }

    }

    public List<Count> countCustomer() {

        try {
            session = HibernateUtil.getSession();
            System.out.println("got session obj........");
            Query q = session.createQuery("select NEW entity.Count(c.address,count(*)) from Customer c group by c.address");
            tx = session.beginTransaction();
            count = q.list();
            tx.commit();
            return count;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return count;
        } finally {
            session.close();
        }

    }

}
