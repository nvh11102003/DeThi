package com.mycompany.Services.Impl;

import com.mycompany.Models.CuaHang;
import com.mycompany.Repositorys.CuaHangRepo;
import com.mycompany.Services.CuaHangService;
import java.util.List;

public class CuaHangImpl implements CuaHangService {

    private CuaHangRepo qlCH = new CuaHangRepo();

    @Override
    public List<CuaHang> getAll() {
        return this.qlCH.getAll();
    }

    @Override
    public Boolean add(CuaHang ch) {
        return this.qlCH.add(ch);
    }

    @Override
    public Boolean update(CuaHang ch, String ma) {
        return this.qlCH.update(ch, ma);
    }

    @Override
    public Boolean delete(String ma) {
        return this.qlCH.delete(ma);
    }

}
