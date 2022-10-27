
package com.mycompany.Services.Impl;

import com.mycompany.Models.khachHang;
import com.mycompany.Repositorys.KhachHangRepo;
import com.mycompany.Services.KhachHangService;
import java.util.List;


public class KhachHangImpl implements KhachHangService{
    private KhachHangRepo qlKH = new KhachHangRepo();
    
    @Override
    public List<khachHang> getAll() {
        return this.qlKH.getALL();
    }

    @Override
    public Boolean add(khachHang kh) {
        return this.qlKH.add(kh);
    }

    @Override
    public Boolean update(khachHang kh, String ma) {
        return this.qlKH.update(kh, ma);
    }

    @Override
    public Boolean delete(String ma) {
        return this.qlKH.delete(ma);
    }
    
}
