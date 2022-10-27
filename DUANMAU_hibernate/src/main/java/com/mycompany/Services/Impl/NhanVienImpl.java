
package com.mycompany.Services.Impl;

import com.mycompany.Models.NhanVien;
import com.mycompany.Repositorys.NhanVienRepo;
import com.mycompany.Services.NhanVienService;
import java.util.List;


public class NhanVienImpl implements NhanVienService{
    private NhanVienRepo qlNV = new NhanVienRepo();
    
    @Override
    public List<NhanVien> getAll() {
        return this.qlNV.getALL();
    }

    @Override
    public Boolean add(NhanVien nv) {
        return this.qlNV.add(nv);
    }

    @Override
    public Boolean update(NhanVien nv, String ma) {
        return this.qlNV.update(nv, ma);
    }

    @Override
    public Boolean delete(String ma) {
        return this.qlNV.delete(ma);
    }
    
}
