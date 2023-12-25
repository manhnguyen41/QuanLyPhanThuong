package models;

import dbConnector.Connector;
import jsonHandle.WriteToJson;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DipTangThuong implements DBActing{
    // Attribute
    private int idDipTangThuong;
    private String thanhTich;
    private String hocKy;
    private String ngayTangThuong;
    private int tongSoTien;
    private int soCuonVo;
    private int giaTien;
    private boolean isDeleted = false;
    private ListOfHocSinh listOfHocSinh;
    private NganQuyTangThuong nganQuyTangThuong;

    // Constructor
    public DipTangThuong(String thanhTich, String hocKy,
                         int soCuonVo, int giaTien) {
        this.thanhTich = thanhTich;
        this.hocKy = hocKy;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.ngayTangThuong = currentDate.format(formatter);
        this.soCuonVo = soCuonVo;
        this.giaTien = giaTien;
        listOfHocSinh = new ListOfHocSinh();
        calculateTongSoTien();
    }
    public DipTangThuong(int idDipTangThuong, String thanhTich, String hocKy, String ngayTangThuong,
                         int tongSoTien, int soCuonVo, int giaTien, boolean isDeleted,
                         ListOfHocSinh listOfHocSinh) {
        this.idDipTangThuong = idDipTangThuong;
        this.thanhTich = thanhTich;
        this.hocKy = hocKy;
        this.ngayTangThuong = ngayTangThuong;
        this.tongSoTien = tongSoTien;
        this.soCuonVo = soCuonVo;
        this.giaTien = giaTien;
        this.isDeleted = isDeleted;
        this.listOfHocSinh = listOfHocSinh;
    }

    // Method to calculate tongSoTien
    public void calculateTongSoTien() {
        List<HocSinh> hocSinhList = listOfHocSinh.getListOfHocSinhByHocKyAndThanhTich(hocKy, thanhTich);
        int soTien = soCuonVo * giaTien;
        soTien *= hocSinhList.size();
        tongSoTien = soTien;
    }

    // Phuong thuc de them mot dip tang thuong vao csdl
    @Override
    public void addNewRow() {
        try {
            Connection connection = Connector.getConnection();

            calculateTongSoTien();

            String insertQuery = "INSERT INTO dip_tang_thuong (\n" +
                    "  `thanh_tich`,\n" +
                    "  `hoc_ky`,\n" +
                    "  `ngay_tang_thuong`,\n" +
                    "  `tong_so_tien`,\n" +
                    "  `so_cuon_vo`,\n" +
                    "  `gia_tien`\n" +
                    ") VALUES (\n" +
                    "  '" + thanhTich +
                    "', '" + hocKy +
                    "', '" + ngayTangThuong +
                    "',  " + tongSoTien +
                    ",   " + soCuonVo +
                    ",   " + giaTien +
                    ");\n";

            PreparedStatement add = connection.prepareStatement(insertQuery);
            int row = add.executeUpdate();

            String selectQuery = "SELECT * FROM dip_tang_thuong WHERE\n" +
                    " `thanh_tich` = '" + thanhTich + "' AND `hoc_ky` = '" + hocKy + "';";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

            resultSet.next();
            idDipTangThuong = resultSet.getInt("id_dip_tang_thuong");

            nganQuyTangThuong = new NganQuyTangThuong(idDipTangThuong, tongSoTien, "Thuong hoc sinh " + thanhTich + " hoc ky " + hocKy);
            nganQuyTangThuong.addNewRow();

            for (HocSinh hocSinh: listOfHocSinh.getListOfHocSinhByHocKyAndThanhTich(hocKy, thanhTich)) {
                ListOfTangThuong listOfTangThuong = new ListOfTangThuong();
                TangThuong tangThuong = new TangThuong(idDipTangThuong, hocSinh.getSoHoKhau(), hocKy);
                int index = listOfTangThuong.getTangThuongList().indexOf(tangThuong);
                if (index > 0) {
                    tangThuong = listOfTangThuong.getTangThuongList().get(index);
                    if (tangThuong.getChiTietPhanQua().containsKey(thanhTich)) {
                        tangThuong.getChiTietPhanQua().replace(thanhTich, tangThuong.getChiTietPhanQua().get(thanhTich) + 1);
                    } else {
                        tangThuong.getChiTietPhanQua().put(thanhTich, 1);
                    }
                    tangThuong.editRow();
                } else {
                    tangThuong.getChiTietPhanQua().put(thanhTich, 1);
                    tangThuong.addNewRow();
                }
            }

            // --- thêm một đoạn dialog báo thêm thành công ở đây

            add.close();
            connection.close();
        } catch (Exception e) {
//            throw new RuntimeException("Dip tang thuong bi lap");
            e.printStackTrace();
        }
    }

    // Phuong thuc de sua mot dip tang thuong
    @Override
    public void editRow() {
        try {
            Connection connection = Connector.getConnection();

            calculateTongSoTien();

            String updateQuery = "UPDATE `dip_tang_thuong`\n" +
                    "SET\n" +
                    "  `thanh_tich` = '" + thanhTich +
                    "', `hoc_ky` = '" + hocKy +
                    "', `tong_so_tien` = " + tongSoTien +
                    ", `so_cuon_vo` = " + soCuonVo +
                    ", `gia_tien` = " + giaTien +
                    " WHERE\n" +
                    "  `id_dip_tang_thuong` = " + idDipTangThuong + ";";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            nganQuyTangThuong.setChiTiet("Thuong hoc sinh " + thanhTich + " hoc ky " + hocKy);
            nganQuyTangThuong.setSoTienThayDoi(tongSoTien);
            nganQuyTangThuong.editRow();

            ListOfTangThuong listOfTangThuong = new ListOfTangThuong();
            for (TangThuong tangThuong: listOfTangThuong.getTangThuongList()) {
                tangThuong.deleteRow();
            }

            for (HocSinh hocSinh: listOfHocSinh.getListOfHocSinhByHocKyAndThanhTich(hocKy, thanhTich)) {
                listOfTangThuong = new ListOfTangThuong();
                TangThuong tangThuong = new TangThuong(idDipTangThuong, hocSinh.getSoHoKhau(), hocKy);
                int index = listOfTangThuong.getTangThuongList().indexOf(tangThuong);
                if (index > 0) {
                    tangThuong = listOfTangThuong.getTangThuongList().get(index);
                    if (tangThuong.getChiTietPhanQua().containsKey(thanhTich)) {
                        tangThuong.getChiTietPhanQua().replace(thanhTich, tangThuong.getChiTietPhanQua().get(thanhTich) + 1);
                    } else {
                        tangThuong.getChiTietPhanQua().put(thanhTich, 1);
                    }
                    tangThuong.editRow();
                } else {
                    tangThuong.getChiTietPhanQua().put(thanhTich, 1);
                    tangThuong.addNewRow();
                }
            }

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Phuong thuc de xoa mot dip tang thuong
    public void deleteRow() {
        try {
            Connection connection = Connector.getConnection();

            isDeleted = true;

            String updateQuery = "UPDATE `dip_tang_thuong`\n" +
                    "SET\n" +
                    "  `isDeleted` = " + (isDeleted ? 1 : 0) +
                    " WHERE\n" +
                    "  `id_dip_tang_thuong` = " + idDipTangThuong + ";";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            nganQuyTangThuong.deleteRow();

            ListOfTangThuong listOfTangThuong = new ListOfTangThuong();
            for (TangThuong tangThuong: listOfTangThuong.getTangThuongList()) {
                tangThuong.deleteRow();
            }

            edit.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Getter and Setter

    public int getIdDipTangTuong() {
        return idDipTangThuong;
    }

    public void setIdDipTangTuong(int idDipTangThuong) {
        this.idDipTangThuong = idDipTangThuong;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
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

    public int getSoCuonVo() {
        return soCuonVo;
    }

    public void setSoCuonVo(int soCuonVo) {
        this.soCuonVo = soCuonVo;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public NganQuyTangThuong getNganQuyTangThuong() {
        return nganQuyTangThuong;
    }

    public void setNganQuyTangThuong(NganQuyTangThuong nganQuyTangThuong) {
        this.nganQuyTangThuong = nganQuyTangThuong;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
