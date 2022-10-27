package com.mycompany.Models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "KhachHang")
public class khachHang {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "idKH", columnDefinition = "uniqueidentifier")
    private String idKH;

    @Column(name = "Ma")
    private String maKH;

    @Column(name = "Ten")
    private String tenKH;

    @Column(name = "TenDem")
    private String Tendem;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "NgaySinh")
    private Date Ngaysinh;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "DiaChi")
    private String diachi;

    @Column(name = "ThanhPho")
    private String thanhpho;

    @Column(name = "QuocGia")
    private String quocgia;

    @Column(name = "MatKhau")
    private String matKhau;

    @OneToMany(mappedBy = "khachHang")
    private List<HoaDon> listHoaDon;

    public khachHang() {
    }

    public khachHang(String idKH, String maKH, String tenKH, String Tendem, String ho, Date Ngaysinh, String sdt, String diachi, String thanhpho, String quocgia, String matKhau, List<HoaDon> listHoaDon) {
        this.idKH = idKH;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.Tendem = Tendem;
        this.ho = ho;
        this.Ngaysinh = Ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
        this.matKhau = matKhau;
        this.listHoaDon = listHoaDon;
    }

    

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTendem() {
        return Tendem;
    }

    public void setTendem(String Tendem) {
        this.Tendem = Tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    public List<HoaDon> getListHoaDon() {
        return listHoaDon;
    }

    public void setListHoaDon(List<HoaDon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }

}
