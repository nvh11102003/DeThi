package com.mycompany.Repositorys;

import com.mycompany.Models.SanPham;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SanPhamRepo {

    public List<SanPham> getALL() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<SanPham> listSP = session.createCriteria(SanPham.class).list();
        return listSP;
    }

    public Boolean add(SanPham spn) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(spn);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(SanPham spn, String maSP) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            String update = "UPDATE SanPham set tenSP = :LK WHERE maSP = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("LK", spn.getTenSP());
            query.setParameter("Hello", maSP);
            if (query.executeUpdate() > 0) {
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String maSP) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            String update = "DELETE SanPham WHERE maSP = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("Hello", maSP);
            if (query.executeUpdate() > 0) {
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
