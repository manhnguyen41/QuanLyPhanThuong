package models;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DipTangThuong implements DBActing{
    // Attribute
    private String idDipTangTuong;
    private String tenDip;
    private int tuoiToiThieu;
    private int tuoiToiDa;
    private String ngayTangThuong;
    private int tongSoTien;
    private Map<String, Integer> chiTietPhanQua = new HashMap<>();
    private boolean isDeleted = false;

    // Constructor
    public DipTangThuong(String idDipTangTuong, String tenDip, int tuoiToiThieu,
                         int tuoiToiDa, String ngayTangThuong, int tongSoTien,
                         String []qua, int []giaTien) {
        this.idDipTangTuong = idDipTangTuong;
        this.tenDip = tenDip;
        this.tuoiToiThieu = tuoiToiThieu;
        this.tuoiToiDa = tuoiToiDa;
        this.ngayTangThuong = ngayTangThuong;
        this.tongSoTien = tongSoTien;
        for (int i = 0; i < qua.length; i++) {
            chiTietPhanQua.put(qua[i], giaTien[i]);
        }
    }

    // Phuong thuc de them mot dip tang thuong vao csdl
    public void addNewRow() {

    }

    // Phuong thuc de sua mot dip tang thuong
    public void editRow() {

    }

    // Phuong thuc de xoa mot dip tang thuong
    public void deleteRow() {

    }

    //

    // Getter and Setter
    public String getIdDipTangTuong() {
        return idDipTangTuong;
    }

    public void setIdDipTangTuong(String idDipTangTuong) {
        this.idDipTangTuong = idDipTangTuong;
    }

    public String getTenDip() {
        return tenDip;
    }

    public void setTenDip(String tenDip) {
        this.tenDip = tenDip;
    }

    public int getTuoiToiThieu() {
        return tuoiToiThieu;
    }

    public void setTuoiToiThieu(int tuoiToiThieu) {
        this.tuoiToiThieu = tuoiToiThieu;
    }

    public int getTuoiToiDa() {
        return tuoiToiDa;
    }

    public void setTuoiToiDa(int tuoiToiDa) {
        this.tuoiToiDa = tuoiToiDa;
    }

    public String getNgayTangThuong() {
        return ngayTangThuong;
    }

    public void setNgayTangThuong(String ngayTangThuong) {
        this.ngayTangThuong = ngayTangThuong;
    }

    public int getTongSoTien() {
        return tongSoTien;
    }

    public void setTongSoTien(int tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    public Map<String, Integer> getChiTietPhanQua() {
        return chiTietPhanQua;
    }

    public void setChiTietPhanQua(Map<String, Integer> chiTietPhanQua) {
        this.chiTietPhanQua = chiTietPhanQua;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
