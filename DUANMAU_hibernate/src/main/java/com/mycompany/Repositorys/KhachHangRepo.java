
package com.mycompany.Repositorys;

import com.mycompany.Models.khachHang;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class KhachHangRepo {
    public List<khachHang> getALL() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<khachHang> listKH = session.createCriteria(khachHang.class).list();
        return listKH;
    }

    public Boolean add(khachHang kh) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(kh);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean update(khachHang kh,String ma){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE KhachHang set Ho = :h, TenDem = :td, Ten = :t, NgaySinh = :ns, DiaChi = :dc, sdt = :sdt, MatKhau = :mk, ThanhPho = :tp, QuocGia = :qg WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("h", kh.getHo());
            query.setParameter("td", kh.getTendem());
            query.setParameter("t", kh.getTenKH());
            query.setParameter("ns", kh.getNgaysinh());
            query.setParameter("dc", kh.getDiachi());
            query.setParameter("sdt", kh.getSdt());
            query.setParameter("mk", kh.getMatKhau());
            query.setParameter("tp", kh.getThanhpho());
            query.setParameter("qg", kh.getQuocgia());
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
            String update = "DELETE KhachHang WHERE Ma = :Hello";
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
