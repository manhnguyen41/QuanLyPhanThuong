package models;

public class TangThuong implements DBActing{
    // Attribute
    private String idTangThuong;
    private String idDipTangThuong;
    private String tenDip;
    private String soHoKhau;
    private int soTien;
    private int soPhanQua;
    private boolean isDeleted = false;

    // Constructor
    public TangThuong(String idTangThuong, String idDipTangThuong, String tenDip,
                      String soHoKhau, int soTien, int soPhanQua) {
        this.idTangThuong = idTangThuong;
        this.idDipTangThuong = idDipTangThuong;
        this.tenDip = tenDip;
        this.soHoKhau = soHoKhau;
        this.soTien = soTien;
        this.soPhanQua = soPhanQua;
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
    public String getIdTangThuong() {
        return idTangThuong;
    }

    public void setIdTangThuong(String idTangThuong) {
        this.idTangThuong = idTangThuong;
    }

    public String getIdDipTangThuong() {
        return idDipTangThuong;
    }

    public void setIdDipTangThuong(String idDipTangThuong) {
        this.idDipTangThuong = idDipTangThuong;
    }

    public String getTenDip() {
        return tenDip;
    }

    public void setTenDip(String tenDip) {
        this.tenDip = tenDip;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public int getSoPhanQua() {
        return soPhanQua;
    }

    public void setSoPhanQua(int soPhanQua) {
        this.soPhanQua = soPhanQua;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
