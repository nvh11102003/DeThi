
package com.mycompany.Services;

import com.mycompany.Models.DongSP;
import java.util.List;


public interface DongSPService {
     public List<DongSP> getAll();
    public Boolean add(DongSP dsp);
    public Boolean update(DongSP dsp , String maDSP);
    public Boolean delete(String maDSP);
}
