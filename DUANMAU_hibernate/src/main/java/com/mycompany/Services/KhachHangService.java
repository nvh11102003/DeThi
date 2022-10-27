
package com.mycompany.Services;

import com.mycompany.Models.khachHang;
import java.util.List;


public interface KhachHangService {
    public List<khachHang> getAll();
    public Boolean add(khachHang kh);
    public Boolean update(khachHang kh, String ma);
    public Boolean delete(String ma);
}
