
package com.mycompany.Repositorys;

import com.mycompany.Models.ChucVu;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ChucVuRepo {
    public List<ChucVu> getAll(){
        Session session = HibernateUntil.getFACTORY().openSession();
        List<ChucVu> listcv = session.createCriteria(ChucVu.class).list();
        return listcv;
    }
    
    public Boolean add(ChucVu cv){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            session.save(cv);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Boolean update(ChucVu cv, String macv){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE ChucVu set Ten = :LK WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("LK", cv.getTen());
            query.setParameter("Hello", macv);
            if(query.executeUpdate() > 0){
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean delete(String macv){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "DELETE ChucVu WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("Hello", macv);
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
