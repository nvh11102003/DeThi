
package com.mycompany.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "CuaHang")
public class CuaHang {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "idCH", columnDefinition = "uniqueidentifier")
    private String idCH;
    
    @Column(name = "Ma")
    private String maCH;
    
    @Column(name = "Ten")
    private String tenCH;
    
    @Column(name = "DiaChi")
    private String diachi;
    
    @Column(name = "ThanhPho")
    private String thanhpho;
    
    @Column(name = "QuocGia")
    private String quocgia;
    
    @OneToMany(mappedBy = "cuaHang")
    private List<NhanVien> nhanVien;

    public CuaHang() {
    }

    public CuaHang(String idCH, String maCH, String tenCH, String diachi, String thanhpho, String quocgia, List<NhanVien> nhanVien) {
        this.idCH = idCH;
        this.maCH = maCH;
        this.tenCH = tenCH;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
        this.nhanVien = nhanVien;
    }

    public String getIdCH() {
        return idCH;
    }

    public void setIdCH(String idCH) {
        this.idCH = idCH;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getTenCH() {
        return tenCH;
    }

    public void setTenCH(String tenCH) {
        this.tenCH = tenCH;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public List<NhanVien> getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(List<NhanVien> nhanVien) {
        this.nhanVien = nhanVien;
    }
    
}
