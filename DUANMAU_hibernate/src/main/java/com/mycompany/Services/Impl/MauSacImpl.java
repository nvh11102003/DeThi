
package com.mycompany.Services.Impl;

import com.mycompany.Repositorys.MauSacRepo;
import com.mycompany.Models.MauSac;
import java.util.List;
import com.mycompany.Services.MauSacService;


public class MauSacImpl implements MauSacService{
    private MauSacRepo QLMS = new MauSacRepo();
    
    @Override
    public List<MauSac> getAll(){
        return this.QLMS.getALL();
    }
    
    @Override
    public Boolean add(MauSac ms){
        return this.QLMS.add(ms);
    }
    
    @Override
    public Boolean update(MauSac ms , String maMS){
        return this.QLMS.update(ms, maMS);
    }
    
    @Override
    public Boolean delete(String maMS){
        return this.QLMS.delete(maMS);
    }
}
