
package com.mycompany.Services;

import com.mycompany.Models.ChucVu;
import java.util.List;


public interface ChucVuService {
    public List<ChucVu> getAll();
    public Boolean add(ChucVu cv);
    public Boolean update(ChucVu cv, String ma);
    public Boolean delete(String ma);
}
