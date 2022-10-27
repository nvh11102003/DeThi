
package com.mycompany.Services.Impl;

import com.mycompany.Models.HoaDonChiTiet;
import com.mycompany.Repositorys.HoaDonChiTietRepo;
import com.mycompany.Services.HoaDonChiTietService;
import com.mycompany.viewModels.ChiTietHoaDonViewModel;
import java.util.List;

public class HoaDonChiTietImpl implements HoaDonChiTietService{
    private HoaDonChiTietRepo hoadoncttietrepo = new HoaDonChiTietRepo();
    @Override
    public Boolean add(HoaDonChiTiet hdct) {
        return this.hoadoncttietrepo.add(hdct);
    }

    @Override
    public List<HoaDonChiTiet> getAll() {
        return hoadoncttietrepo.getAll();
    }
    
}
