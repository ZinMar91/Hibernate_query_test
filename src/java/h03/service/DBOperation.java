package h03.service;

import h03.entity.Party;
import h03.entity.Voter;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DBOperation {

    Transaction tx = null;
    Session session = null;

    public List<Party> saveParty(Party p) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.save(p);
            tx.commit();
            List<Party> list = showParty();
            return list;

        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
            return null;
        } finally {session.close();
            //if(em!=null) em.close();
        }
    }

    public List<Party> showParty() {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Query q = session.createQuery("select p from Party p");
            List<Party> list = q.list();
            tx.commit();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
            return null;
        } finally {
            //if(em!=null) em.close();
        }
    }

    public boolean savePeople(Voter v) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.persist(v);
            tx.commit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            //if(em!=null) em.close();
        }
    }

    public List<Voter> searchvote(String n) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            SQLQuery q = session.createSQLQuery("select v.* from Voter v where v.nationality LIKE :nation");
            q.addEntity(Voter.class);
            q.setParameter("nation", n);

            List<Voter> list = q.list();
            tx.commit();

            return list;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
            return null;
        } finally {
            //if(em!=null) em.close();
        }
    }
}
