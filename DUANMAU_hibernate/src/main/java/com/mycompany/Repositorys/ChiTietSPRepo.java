package com.mycompany.Repositorys;

import com.mycompany.Models.ChiTietSP;
import com.mycompany.viewModels.CTSanPhamViewModel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ChiTietSPRepo {

    public List<ChiTietSP> getALL() {
        Session session = HibernateUntil.getFACTORY().openSession();
        List<ChiTietSP> listCTSP = session.createCriteria(ChiTietSP.class).list();
        return listCTSP;
    }
    
    public ArrayList<CTSanPhamViewModel> getlistCTSPVM(){
        List<ChiTietSP> list = getALL();
        
        ArrayList<CTSanPhamViewModel> listctspvm = new ArrayList<>();
        for (ChiTietSP chiTietSP : list) {
            CTSanPhamViewModel ctspvm = new CTSanPhamViewModel();
            ctspvm.setId(chiTietSP.getIdCTSP());
            ctspvm.setNamBH(chiTietSP.getNamBH());
            ctspvm.setMoTa(chiTietSP.getMoTa());
            ctspvm.setSoLuongTon(chiTietSP.getSoLuongTon());
            ctspvm.setGiaNhap(chiTietSP.getGiaNhap());
            listctspvm.add(ctspvm);
        }
       
        return listctspvm;
    }
    

    public Boolean add(ChiTietSP ctsp) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            session.save(ctsp);
            transac.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(ChiTietSP ctsp, String Id) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            String hql = "UPDATE ChiTietSP SET soLuongTon = :SL, moTa = :MT,namBH = :BH, giaNhap = :GN, giaBan = :GB  where idCTSP = :hid";
            Query query = session.createQuery(hql);
            query.setParameter("SL", ctsp.getSoLuongTon());
            query.setParameter("MT", ctsp.getMoTa());
            query.setParameter("BH", ctsp.getNamBH());
            query.setParameter("GN", ctsp.getGiaNhap());
            query.setParameter("GB", ctsp.getGiaBan());
            query.setParameter("hid", Id);
            if (query.executeUpdate() > 0) {
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {
        Transaction transac = null;
        try ( Session session = HibernateUntil.getFACTORY().openSession()) {
            transac = session.beginTransaction();
            String hql = "DELETE ChiTietSP WHERE idCTSP = :hid";
            Query query = session.createQuery(hql);
            query.setParameter("hid", id);
            if (query.executeUpdate() > 0) {
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ChiTietSP getCTSPByMa(String id){
        Session session = HibernateUntil.getFACTORY().openSession();
        ChiTietSP ctsp = (ChiTietSP) session.get(ChiTietSP.class, id);
        session.close();
        return ctsp;
    }
}
