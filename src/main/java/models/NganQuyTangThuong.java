package models;

public class NganQuyTangThuong implements DBActing{
    // Attribute
    private String idNganQuyTangThuong;
    private int soTienThayDoi;
    private String ngayThayDoi;
    private static int tongSoTien;
    private String chiTiet;
    private boolean isDeleted = false;

    // Constructor
    public NganQuyTangThuong(String idNganQuyTangThuong, int soTienThayDoi, String ngayThayDoi, String chiTiet) {
        this.idNganQuyTangThuong = idNganQuyTangThuong;
        this.soTienThayDoi = soTienThayDoi;
        this.ngayThayDoi = ngayThayDoi;
        this.chiTiet = chiTiet;
    }

    // Phuong thuc de them mot dong vao csdl
    public void addNewRow() {

    }

    // Phuong thuc de sua mot dong
    public void editRow() {

    }

    // Phuong thuc de xoa mot dong
    public void deleteRow() {

    }

    // Getter and Setter
    public String getIdNganQuyTangThuong() {
        return idNganQuyTangThuong;
    }

    public void setIdNganQuyTangThuong(String idNganQuyTangThuong) {
        this.idNganQuyTangThuong = idNganQuyTangThuong;
    }

    public int getSoTienThayDoi() {
        return soTienThayDoi;
    }

    public void setSoTienThayDoi(int soTienThayDoi) {
        this.soTienThayDoi = soTienThayDoi;
    }

    public String getNgayThayDoi() {
        return ngayThayDoi;
    }

    public void setNgayThayDoi(String ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public static int getTongSoTien() {
        return tongSoTien;
    }

    public static void setTongSoTien(int tongSoTien) {
        NganQuyTangThuong.tongSoTien = tongSoTien;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
