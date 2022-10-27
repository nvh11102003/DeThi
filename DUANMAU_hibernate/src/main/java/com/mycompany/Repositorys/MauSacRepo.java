
package com.mycompany.Repositorys;

import com.mycompany.Models.MauSac;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MauSacRepo {
    public List<MauSac> getALL() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<MauSac> listMS = session.createCriteria(MauSac.class).list();
        return listMS;
    }

    public Boolean add(MauSac MS) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(MS);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean update(MauSac MS, String maMS){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE MauSac set tenMau = :LK WHERE maMau = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("LK", MS.getTenMau());
            query.setParameter("Hello", maMS);
            if(query.executeUpdate() > 0){
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean delete(String maMau){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "DELETE mauSac WHERE maMau = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("Hello", maMau);
            if(query.executeUpdate() > 0){
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
