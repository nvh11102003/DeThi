
package com.mycompany.Repositorys;

import com.mycompany.Models.NhanVien;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class NhanVienRepo {
    public List<NhanVien> getALL() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<NhanVien> listNV = session.createCriteria(NhanVien.class).list();
        return listNV;
    }

    public Boolean add(NhanVien nv) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(nv);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean update(NhanVien nv,String ma){
        Transaction transac = null;
        try (Session session = HibernateUntil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE NhanVien set Ho = :h, TenDem = :td, Ten = :t, NgaySinh = :ns, GioiTinh = :gt, DiaChi = :dc, TrangThai = :tt, sdt = :sdt, MatKhau = :mk, IdCV = :cv; IdCH = :ch WHERE Ma = :Hello";
            Query query = session.createQuery(update);
            query.setParameter("h", nv.getHo());
            query.setParameter("td", nv.getTenDem());
            query.setParameter("t", nv.getTen());
            query.setParameter("ns", nv.getNgaySinh());
            query.setParameter("gt", nv.getGioiTinh());
            query.setParameter("tt", nv.getTrangThai());
            query.setParameter("dc", nv.getDiaChi());
            query.setParameter("sdt", nv.getSdt());
            query.setParameter("mk", nv.getMatkhau());
            query.setParameter("cv", nv.getChucVu());
            query.setParameter("ch", nv.getChucVu());
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
            String update = "DELETE NhanVien WHERE Ma = :Hello";
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
