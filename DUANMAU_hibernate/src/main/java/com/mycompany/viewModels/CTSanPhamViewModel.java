
package com.mycompany.viewModels;


public class CTSanPhamViewModel {
    private String id;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private float giaNhap;


    public CTSanPhamViewModel() {
    }

    public CTSanPhamViewModel(String id, int namBH, String moTa, int soLuongTon, float giaNhap) {
        this.id = id;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }
    
    public String hienThiTT(){
        if(soLuongTon >= 900){
            return "Nhieu San Pham";
        }
        return "It San Pham";
    }

}    
