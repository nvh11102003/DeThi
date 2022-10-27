
package com.mycompany.Services;

import com.mycompany.Models.ChiTietSP;
import com.mycompany.Models.DongSP;
import com.mycompany.Models.MauSac;
import com.mycompany.Models.NSX;
import com.mycompany.Models.SanPham;
import com.mycompany.viewModels.CTSanPhamViewModel;
import java.util.ArrayList;
import java.util.List;


public interface ChiTietSPService {
    public List<ChiTietSP> getALL();
    public ArrayList<CTSanPhamViewModel> getALLSP();
    public Boolean add(ChiTietSP ctsp); 
    public Boolean update(ChiTietSP ctsp, String id); 
    public Boolean delete(String id); 
    public ChiTietSP getCTSPByMa(String ma);
}
