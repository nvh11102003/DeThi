
package com.mycompany.Repositorys;

import com.mycompany.Models.NSX;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class NSXRepo {
    public List<NSX> getALL() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<NSX> listNSX = session.createCriteria(NSX.class).list();
        return listNSX;
    }

    public Boolean add(NSX nsx) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(nsx);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean update(NSX nsx,String maNSX){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE NSX set TenNSX = :LK WHERE MaNSX = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("LK", nsx.getTenNSX());
            query.setParameter("Hello", maNSX);
            if(query.executeUpdate() > 0){
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean delete(String maNSX){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "DELETE NSX WHERE MaNSX = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("Hello", maNSX);
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
