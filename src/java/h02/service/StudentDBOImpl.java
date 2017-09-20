package h02.service;

import h02.entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class StudentDBOImpl {

    Transaction tx = null;
    Session session = null;

    public boolean insertDB(Student stu) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.save(stu);
            tx.commit();
            return true;
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            session.close();
        }
    }

    public ArrayList<Student> searchDB(int ido) {
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Query q = session.createQuery("select s from Student s where s.id LIKE ? ");
            q.setParameter(0, ido);
            if (q != null) {
                tx.commit();
                return (ArrayList<Student>) q.list();
            } else {
                return null;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }

    public List showallDBO() {
        List stulist = null;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Query q = session.createQuery("select s from Student s");
            stulist = q.list();
            tx.commit();
            return stulist;
        } catch (Exception ex) {

            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public ArrayList<Student> updateDBO(int ido, String stuname) {
        ArrayList<Student> arr = null;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            Query q = session.createQuery("update Student s SET s.sname=:stuname where s.id like :id");
            q.setParameter("stuname", stuname);
            q.setParameter("id", ido);
            q.executeUpdate();
            System.out.println("Hi Hi");
            tx.commit();
            arr = searchDB(ido);
            System.out.println(arr.get(0).getSname() + ".............................");
            return arr;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.getStackTrace();
            return null;
        } finally {

        }
    }

    public ArrayList deleteDBO(int sdo) {
        ArrayList arr = null;

        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Query q = session.createQuery("delete from Student s where s.sroll LIKE :id");
            q.setParameter("id", sdo);
            q.executeUpdate();
            tx.commit();
            arr = (ArrayList) showallDBO();
            return arr;

        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }
            e.getStackTrace();
            return null;
        } finally {

        }
    }
}
