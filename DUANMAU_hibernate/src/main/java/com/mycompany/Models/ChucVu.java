
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
@Table(name =  "ChucVu")
public class ChucVu {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "idCV", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "Ma")
    private String maCV;
    
    @Column(name = "Ten")
    private String ten;
    
    @OneToMany(mappedBy = "chucVu")
    private List<NhanVien> listnv;

    public ChucVu() {
    }

    public ChucVu(String id, String maCV, String ten, List<NhanVien> listnv) {
        this.id = id;
        this.maCV = maCV;
        this.ten = ten;
        this.listnv = listnv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<NhanVien> getListnv() {
        return listnv;
    }

    public void setListnv(List<NhanVien> listnv) {
        this.listnv = listnv;
    }
    
}
