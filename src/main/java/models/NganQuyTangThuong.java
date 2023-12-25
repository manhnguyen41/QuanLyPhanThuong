package models;

import dbConnector.Connector;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NganQuyTangThuong implements DBActing{
    // Attribute
    private int idNganQuyTangThuong;
    private int soTienThayDoi;
    private String ngayThayDoi;
    private static int tongSoTien;
    private String chiTiet;
    private boolean isDeleted = false;

    // Constructor
    public NganQuyTangThuong() {
    }

    public NganQuyTangThuong(int idDipTangThuong, int soTienThayDoi, String chiTiet) {
        this.idNganQuyTangThuong = idDipTangThuong;
        this.soTienThayDoi = soTienThayDoi;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.ngayThayDoi = currentDate.format(formatter);
        this.chiTiet = chiTiet;
    }

    public NganQuyTangThuong(int idNganQuyTangThuong, int soTienThayDoi, String ngayThayDoi,
                             String chiTiet, int tongSoTien, boolean isDeleted) {
        this.idNganQuyTangThuong = idNganQuyTangThuong;
        this.soTienThayDoi = soTienThayDoi;
        this.ngayThayDoi = ngayThayDoi;
        this.chiTiet = chiTiet;
        NganQuyTangThuong.tongSoTien = tongSoTien;
        this.isDeleted = isDeleted;
    }

    // Phuong thuc de them mot dong vao csdl
    @Override
    public void addNewRow() {
        try {
            Connection connection = Connector.getConnection();

            tongSoTien -= soTienThayDoi;

            String insertQuery = "INSERT INTO `ngan_quy_tang_thuong` (\n" +
                    "  `id_ngan_quy_tang_thuong`,\n" +
                    "  `so_tien_thay_doi`,\n" +
                    "  `ngay_thay_doi`,\n" +
                    "  `tong_so_tien`,\n" +
                    "  `chi_tiet`\n" +
                    ") VALUES (\n" +
                    "   " + idNganQuyTangThuong +
                    ",  " + this.getSoTienThayDoi() +
                    ", '" + this.getNgayThayDoi() +
                    "', " + tongSoTien +
                    ", '" + this.getChiTiet() +
                    "');\n";

            PreparedStatement add = connection.prepareStatement(insertQuery);
            int row = add.executeUpdate();

            // --- thêm một đoạn dialog báo thêm thành công ở đây

            add.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editRow() {
        try {
            Connection connection = Connector.getConnection();

            String updateQuery = "UPDATE `ngan_quy_tang_thuong`\n" +
                    "SET\n" +
                    "`so_tien_thay_doi` = " + soTienThayDoi +
                    ", `tong_so_tien` = " + tongSoTien +
                    ", `chi_tiet` = '" + chiTiet +
                    "'WHERE\n" +
                    "`id_ngan_quy_tang_thuong` = " + idNganQuyTangThuong + ";";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteRow() {
        try {
            Connection connection = Connector.getConnection();

            isDeleted = true;
            tongSoTien += soTienThayDoi;

            String updateQuery = "UPDATE `ngan_quy_tang_thuong`\n" +
                    "SET\n" +
                    "`isDeleted` = " + (isDeleted ? 1 : 0) +
                    " WHERE\n" +
                    "`id_ngan_quy_tang_thuong` = " + idNganQuyTangThuong +
                    ";";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Getter and Setter
    public int getIdNganQuyTangThuong() {
        return idNganQuyTangThuong;
    }

    public void setIdNganQuyTangThuong(int idNganQuyTangThuong) {
        this.idNganQuyTangThuong = idNganQuyTangThuong;
    }

    public int getSoTienThayDoi() {
        return soTienThayDoi;
    }

    public void setSoTienThayDoi(int soTienThayDoi) {
        tongSoTien += this.soTienThayDoi;
        tongSoTien -= soTienThayDoi;
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
