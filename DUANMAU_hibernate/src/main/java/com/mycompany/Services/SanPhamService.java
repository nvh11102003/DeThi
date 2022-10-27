
package com.mycompany.Services;

import com.mycompany.Models.SanPham;
import java.util.List;


public interface SanPhamService {
    
    public List<SanPham> getAll();
    public Boolean add(SanPham sp);
    public Boolean delete(String maSP);
    public Boolean update(SanPham sp, String maSP);
}
