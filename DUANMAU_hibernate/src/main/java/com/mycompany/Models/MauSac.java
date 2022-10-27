
package com.mycompany.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "MauSac")
public class MauSac {
    
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "IdMauSac", columnDefinition = "uniqueidentifier")
    private String idMS;
    
    @Column(name = "ma", unique = true)
    private String maMau;
    
    @Column(name = "Ten", columnDefinition = "Nvarchar(100)")
    private String tenMau;
    
    @OneToMany(mappedBy = "mauSac", fetch = FetchType.EAGER)
    private List<ChiTietSP> listCTSP;


    public MauSac(String idMS, String maMau, String tenMau) {
        this.idMS = idMS;
        this.maMau = maMau;
        this.tenMau = tenMau;
    }


    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public List<ChiTietSP> getListCTSP() {
        return listCTSP;
    }

    public void setListCTSP(List<ChiTietSP> listCTSP) {
        this.listCTSP = listCTSP;
    }

    public MauSac() {
    }

    public MauSac(String maMau, String tenMau, List<ChiTietSP> listCTSP) {
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.listCTSP = listCTSP;
    }

    public MauSac(String idMS, String maMau) {
        this.idMS = idMS;
        this.maMau = maMau;
    }

    public String getIdMS() {
        return idMS;
    }

    public void setIdMS(String idMS) {
        this.idMS = idMS;
    }

    @Override
    public String toString() {
        return tenMau;
    }


}
