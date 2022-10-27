
package com.mycompany.Services.Impl;

import com.mycompany.Models.HoaDon;
import com.mycompany.Repositorys.HoaDonRepo;
import com.mycompany.Services.HoaDonService;
import java.util.List;


public class HoaDonImpl implements HoaDonService{
    private HoaDonRepo hoaDonRepo = new HoaDonRepo();

    @Override
    public List<HoaDon> getAll() {
        return this.hoaDonRepo.getAll();
    }

    @Override
    public Boolean add(HoaDon hd) {
        return this.hoaDonRepo.add(hd);
    }

    @Override
    public HoaDon getHDbyMa(String ma) {
        return this.hoaDonRepo.getHDByMaHD(ma);
    }

    @Override
    public Boolean updateTT(HoaDon hd, String id) {
        return hoaDonRepo.update(hd, id);
    }
    
    
}
