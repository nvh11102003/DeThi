
package com.mycompany.Models;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "HoaDon")
public class HoaDon{
    
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "idHoaDon" , columnDefinition = "uniqueidentifier")
    private String idChiTietSP;
    
    @Column(name = "Ma")
    private String maHD;
    
    @ManyToOne
    @JoinColumn(name = "IdKH")
    private khachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien nhanVien;
    @Column(name = "NgayTao")
    private Date ngayTao;
    
    @Column(name = "NgayThanhToan")
    private Date ngayThanhToan;
    
    @Column(name = "NgayShip")
    private Date ngayShip;
    
    @Column(name = "NgayNhan")
    private Date ngayNhan;
    
    @Column(name = "TinhTrang")
    private int tinhTrang;
    
    @Column(name = "TenNguoiNhan")
    private String TenNguoiNhan;
    
    @Column(name = "DiaChi")
    private String diaChi;
    
    @Column(name = "sdt")
    private String sdt;

    @OneToMany(mappedBy = "hoaDon", fetch =  FetchType.EAGER)
    private List<HoaDonChiTiet> ListHDCT;
    
    public HoaDon() {
    }

    public HoaDon(String idChiTietSP, String maHD, Date ngayTao, int tinhTrang) {
        this.idChiTietSP = idChiTietSP;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tinhTrang = tinhTrang;
    }

    public HoaDon(String maHD, Date ngayTao, int tinhTrang) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.tinhTrang = tinhTrang;
    }

    public HoaDon(String idChiTietSP, String maHD, Date ngayTao, Date ngayThanhToan, Date ngayShip, Date ngayNhan, int tinhTrang, String TenNguoiNhan, String diaChi, String sdt, List<HoaDonChiTiet> ListHDCT) {
        this.idChiTietSP = idChiTietSP;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.TenNguoiNhan = TenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ListHDCT = ListHDCT;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public List<HoaDonChiTiet> getListHDCT() {
        return ListHDCT;
    }

    public void setListHDCT(List<HoaDonChiTiet> ListHDCT) {
        this.ListHDCT = ListHDCT;
    }

    public String trangThaiString(){
        if(tinhTrang == 0){
            return "Chưa thanh toán";
        }
        return "Đã thanh toán";
    }

    public khachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(khachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
    
    
    
    
}
