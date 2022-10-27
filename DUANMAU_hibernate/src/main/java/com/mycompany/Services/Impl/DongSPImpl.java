
package com.mycompany.Services.Impl;

import com.mycompany.Repositorys.DongSPRepo;
import com.mycompany.Models.DongSP;
import java.util.List;
import com.mycompany.Services.DongSPService;


public class DongSPImpl implements DongSPService{
    private DongSPRepo QLDSP = new DongSPRepo();
    
    @Override
    public List<DongSP> getAll(){
        return this.QLDSP.getALL();
    }
    
    @Override
    public Boolean add(DongSP dsp){
        return this.QLDSP.add(dsp);
    }
    
    @Override
    public Boolean update(DongSP dsp, String maDSP){
        return this.QLDSP.update(dsp, maDSP);
    }
    
    @Override
    public Boolean delete(String maDSP){
        return this.QLDSP.delete(maDSP);
    }
}
