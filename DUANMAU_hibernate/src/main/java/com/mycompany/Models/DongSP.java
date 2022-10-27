
package com.mycompany.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "DongSP")
public class DongSP {
    
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "IdDongSP", columnDefinition = "uniqueidentifier")
    private String idDSP;
    
    @Column(name = "Ma", unique = true)
    private String maDongSP;
    
    @Column (name = "Ten", columnDefinition = "Nvarchar(100)")
    private String tenDongSP;
    
    @OneToMany(mappedBy = "dongSP", fetch = FetchType.EAGER)
    private List<ChiTietSP> listCTSP;

    public DongSP() {
    }

    public DongSP(String maDongSP, String tenDongSP, List<ChiTietSP> listCTSP) {
        this.maDongSP = maDongSP;
        this.tenDongSP = tenDongSP;
        this.listCTSP = listCTSP;
    }

    public DongSP(String idDSP, String maDongSP) {
        this.idDSP = idDSP;
        this.maDongSP = maDongSP;
    }


    public String getIdDSP() {
        return idDSP;
    }

    public void setIdDSP(String idDSP) {
        this.idDSP = idDSP;
    }

    public String getMaDongSP() {
        return maDongSP;
    }

    public void setMaDongSP(String maDongSP) {
        this.maDongSP = maDongSP;
    }

    public String getTenDongSP() {
        return tenDongSP;
    }

    public void setTenDongSP(String tenDongSP) {
        this.tenDongSP = tenDongSP;
    }

    public List<ChiTietSP> getListCTSP() {
        return listCTSP;
    }

    public void setListCTSP(List<ChiTietSP> listCTSP) {
        this.listCTSP = listCTSP;
    }

    @Override
    public String toString() {
        return tenDongSP;
    }


    
}
