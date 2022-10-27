
package com.mycompany.Services.Impl;

import com.mycompany.Repositorys.ChiTietSPRepo;
import com.mycompany.Models.ChiTietSP;
import java.util.List;
import com.mycompany.Services.ChiTietSPService;
import com.mycompany.viewModels.CTSanPhamViewModel;
import java.util.ArrayList;


public class ChitietSPImpl implements ChiTietSPService{
    private ChiTietSPRepo QLSTSP = new ChiTietSPRepo();
    
    @Override
    public List<ChiTietSP> getALL(){
        return this.QLSTSP.getALL();
    }
    
    @Override
    public Boolean add(ChiTietSP ctsp){
        return this.QLSTSP.add(ctsp);
    }
    @Override
    public Boolean update(ChiTietSP ctsp, String id){
        return this.QLSTSP.update(ctsp, id);
    }
    @Override
    public Boolean delete(String id){
        return this.QLSTSP.delete(id);
    }

    @Override
    public ChiTietSP getCTSPByMa(String id) {
        return this.QLSTSP.getCTSPByMa(id);
    }

    @Override
    public ArrayList<CTSanPhamViewModel> getALLSP() {
        return this.QLSTSP.getlistCTSPVM();
    }
    


}
