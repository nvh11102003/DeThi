        
package com.mycompany.Repositorys;

import com.mycompany.Models.DongSP;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class DongSPRepo {
    public List<DongSP> getALL() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<DongSP> listDSP = session.createCriteria(DongSP.class).list();
        return listDSP;
    }

    public Boolean add(DongSP dsp) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(dsp);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean update(DongSP dsp, String maDSP){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE DongSP set Ten = :LK WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("LK", dsp.getTenDongSP());
            query.setParameter("Hello", maDSP);
            if(query.executeUpdate() > 0){
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean delete(String maDSP){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "DELETE DongSP WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("Hello", maDSP);
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
