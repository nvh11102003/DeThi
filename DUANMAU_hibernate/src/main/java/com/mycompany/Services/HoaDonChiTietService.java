
package com.mycompany.Services;

import com.mycompany.Models.HoaDonChiTiet;
import com.mycompany.viewModels.ChiTietHoaDonViewModel;
import java.util.List;


public interface HoaDonChiTietService {
    public Boolean add(HoaDonChiTiet hdct);
    public List<HoaDonChiTiet> getAll();
}
