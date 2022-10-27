
package com.mycompany.Services;

import com.mycompany.Models.NSX;
import java.util.List;


public interface NSXService {
     public List<NSX> getAll();
    public Boolean add(NSX nsx);
    public Boolean update(NSX nsx, String maNSX);
    public Boolean delete(String maNSX);
}
