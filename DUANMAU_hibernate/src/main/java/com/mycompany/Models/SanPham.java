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
@Table(name = "SanPham")
public class SanPham {

    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "IdSP", columnDefinition = "uniqueidentifier")
    private String idSP;

    @Column(name = "ma", unique = true)
    private String maSP;
    
    @Column(name = "ten", columnDefinition = "Nvarchar(100)")
    private String tenSP;
    
    @OneToMany(mappedBy = "sanPham", fetch = FetchType.EAGER)
    private List<ChiTietSP> listCTSP;
   
    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public List<ChiTietSP> getListCTSP() {
        return listCTSP;
    }

    public void setListCTSP(List<ChiTietSP> listCTSP) {
        this.listCTSP = listCTSP;
    }

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, List<ChiTietSP> listCTSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.listCTSP = listCTSP;
    }

    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public SanPham(String idSP, String maSP, String tenSP) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    @Override
    public String toString() {
        return tenSP;
    }


}
