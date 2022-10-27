
package com.mycompany.Services.Impl;

import com.mycompany.Repositorys.SanPhamRepo;
import com.mycompany.Models.SanPham;
import java.util.List;
import com.mycompany.Services.SanPhamService;


public class SanPhamImpl implements SanPhamService{
    private SanPhamRepo QLSP = new SanPhamRepo();

    @Override
    public Boolean add(SanPham sp) {
        return QLSP.add(sp);
    }

    @Override
    public List<SanPham> getAll() {
        return QLSP.getALL();
    }

    @Override
    public Boolean delete(String maSP) {
        return QLSP.delete(maSP);
    }

    @Override
    public Boolean update( SanPham sp, String maSP) {
        return QLSP.update(sp, maSP);
    }
}
