package com.mycompany.Repositorys;

import com.mycompany.Models.HoaDon;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HoaDonRepo {

    public List<HoaDon> getAll() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<HoaDon> listHD = session.createCriteria(HoaDon.class).list();
        return listHD;
    }

    public Boolean add(HoaDon hd) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(hd);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public HoaDon getHDByMaHD(String id) {
        Session session = HibernateUntil.getFACTORY().openSession();
        HoaDon hd = (HoaDon) session.get(HoaDon.class, id);
        session.close();
        return hd;
    }

    public Boolean update(HoaDon hd, String ma) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            String update = "UPDATE HoaDon set tinhTrang = :LK WHERE ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("LK", 1);
            query.setParameter("Hello", ma);
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
