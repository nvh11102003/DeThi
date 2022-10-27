
package com.mycompany.Services;

import com.mycompany.Models.HoaDon;
import java.util.List;


public interface HoaDonService {  
    
    public List<HoaDon> getAll();
    public Boolean add(HoaDon hd);
    public HoaDon getHDbyMa(String ma);
    public Boolean updateTT(HoaDon hd, String ma);
}
