
package com.mycompany.Repositorys;

import com.mycompany.Models.CuaHang;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CuaHangRepo {
    public List<CuaHang> getAll(){
        Session session = HibernateUntil.getFACTORY().openSession();
        List<CuaHang> listch = session.createCriteria(CuaHang.class).list();
        return listch;
    }
    
    public Boolean add(CuaHang ch){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            session.save(ch);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Boolean update(CuaHang ch, String ma){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE CuaHang set Ten = :LK,ThanhPho = :tp, DiaChi = :dc, QuocGia = :qg WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("LK", ch.getTenCH());
            query.setParameter("tp", ch.getThanhpho());
            query.setParameter("dc", ch.getDiachi());
            query.setParameter("qg", ch.getQuocgia());
            query.setParameter("Hello", ma);
            if(query.executeUpdate() > 0){
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean delete(String ma){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "DELETE CuaHang WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("Hello", ma);
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
