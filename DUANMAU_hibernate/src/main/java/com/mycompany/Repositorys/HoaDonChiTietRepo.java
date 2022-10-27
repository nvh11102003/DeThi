
package com.mycompany.Repositorys;

import com.mycompany.Models.HoaDonChiTiet;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class HoaDonChiTietRepo {
    public Boolean add(HoaDonChiTiet hdct){
        Transaction transac = null;
        try(Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(hdct);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<HoaDonChiTiet> getAll(){
        Session session = HibernateUntil.getFACTORY().openSession();
        List<HoaDonChiTiet> listhd = session.createCriteria(HoaDonChiTiet.class).list();
        return listhd;
    }
    
    
}
