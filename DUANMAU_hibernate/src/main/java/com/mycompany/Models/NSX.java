
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
@Table(name = "NSX")
public class NSX {
    
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "IdNSX", columnDefinition = "uniqueidentifier")
    private String idNSX;
    
    @Column(name = "Ma", unique = true)
    private String maNSX;
    
    @Column(name = "Ten", columnDefinition = "Nvarchar(100)")
    private String tenNSX;
    
    @OneToMany(mappedBy = "nsx", fetch = FetchType.EAGER)
    private List<ChiTietSP> listCTSP;

    public NSX() {
    }

    public NSX(String idNSX, String maNSX, String tenNSX) {
        this.idNSX = idNSX;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public NSX(String maNSX, String tenNSX, List<ChiTietSP> listCTSP) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.listCTSP = listCTSP;
    }

    public NSX(String idNSX, String maNSX) {
        this.idNSX = idNSX;
        this.maNSX = maNSX;
    }


    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public List<ChiTietSP> getListCTSP() {
        return listCTSP;
    }

    public void setListCTSP(List<ChiTietSP> listCTSP) {
        this.listCTSP = listCTSP;
    }

    @Override
    public String toString() {
        return tenNSX;
    }
    
}
