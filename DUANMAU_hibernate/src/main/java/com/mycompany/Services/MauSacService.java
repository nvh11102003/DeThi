
package com.mycompany.Services;

import com.mycompany.Models.MauSac;
import java.util.List;


public interface MauSacService {
    public List<MauSac> getAll();
    public Boolean add(MauSac ms);
    public Boolean update(MauSac ms, String maMS);
    public Boolean delete(String maMS);
}
