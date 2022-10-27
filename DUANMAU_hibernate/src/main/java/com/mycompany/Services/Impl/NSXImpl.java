
package com.mycompany.Services.Impl;

import com.mycompany.Repositorys.DongSPRepo;
import com.mycompany.Repositorys.NSXRepo;
import com.mycompany.Models.DongSP;
import com.mycompany.Models.NSX;
import java.util.List;
import com.mycompany.Services.NSXService;


public class NSXImpl implements NSXService{
    private NSXRepo QLNSX = new NSXRepo();
    
    @Override
    public List<NSX> getAll(){
        return this.QLNSX.getALL();
    }
    
    @Override
    public Boolean add(NSX nsx){
        return this.QLNSX.add(nsx);
    }
    
    @Override
    public Boolean update(NSX nsx, String maNSX){
        return this.QLNSX.update(nsx, maNSX);
    }
    
    @Override
    public Boolean delete(String maNSX){
        return this.QLNSX.delete(maNSX);
    }
}
