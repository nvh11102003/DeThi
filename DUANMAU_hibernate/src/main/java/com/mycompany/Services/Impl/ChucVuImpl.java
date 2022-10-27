
package com.mycompany.Services.Impl;

import com.mycompany.Models.ChucVu;
import com.mycompany.Repositorys.ChucVuRepo;
import com.mycompany.Services.ChucVuService;
import java.util.List;


public class ChucVuImpl implements ChucVuService{
    private ChucVuRepo qlCV = new ChucVuRepo();

    @Override
    public List<ChucVu> getAll() {
        return this.qlCV.getAll();
    }

    @Override
    public Boolean add(ChucVu cv) {
        return this.qlCV.add(cv);
    }

    @Override
    public Boolean update(ChucVu cv, String ma) {
        return this.qlCV.update(cv, ma);
    }

    @Override
    public Boolean delete(String ma) {
        return this.qlCV.delete(ma);
    }
    
}
