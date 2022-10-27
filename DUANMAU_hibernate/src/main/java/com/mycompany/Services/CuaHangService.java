
package com.mycompany.Services;

import com.mycompany.Models.CuaHang;
import java.util.List;


public interface CuaHangService {
   public List<CuaHang> getAll();
    public Boolean add(CuaHang ch);
    public Boolean update(CuaHang ch, String ma);
    public Boolean delete(String ma); 
}
