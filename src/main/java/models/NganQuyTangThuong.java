package models;

import dbConnector.Connector;

import javax.swing.*;
import java.sql.*;

public class NganQuyTangThuong implements DBActing{
    // Attribute
    private String idNganQuyTangThuong;
    private int soTienThayDoi;
    private String ngayThayDoi;
    private static int tongSoTien;
    private String chiTiet;
    private boolean isDeleted = false;

    public NganQuyTangThuong() {
    }

    // Constructor
    public NganQuyTangThuong(String idNganQuyTangThuong, int soTienThayDoi, String ngayThayDoi, String chiTiet) {
        this.idNganQuyTangThuong = idNganQuyTangThuong;
        this.soTienThayDoi = soTienThayDoi;
        this.ngayThayDoi = ngayThayDoi;
        this.chiTiet = chiTiet;
    }

    // Phuong thuc de them mot dong vao csdl
    public void addNewRow(NganQuyTangThuong nganQuyTangThuong) {
        Connection connection = Connector.getConnection();

    }

    @Override
    public void addNewRow() {
        try {
            Connection connection = Connector.getConnection();

            String insertQuery = "INSERT INTO `ngan_quy_tang_thuong` (\n" +
                    "  `id_ngan_quy_tang_thuong`,\n" +
                    "  `so_tien_thay_doi`,\n" +
                    "  `ngay_thay_doi`,\n" +
                    "  `chi_tiet`,\n" +
                    "  `isDeleted`\n" +
                    ") VALUES (\n" +
                    "  '" + this.getIdNganQuyTangThuong() + "',   -- Replace 'your_id_value' with the actual value for id_ngan_quy_tang_thuong\n" +
                    "  " + this.getSoTienThayDoi() +",               -- Replace 100 with the actual value for so_tien_thay_doi\n" +
                    "  '" + this.getNgayThayDoi() + "',      -- Replace '2023-12-22' with the actual value for ngay_thay_doi\n" +
                    "  '" + this.getChiTiet() +"',  -- Replace 'your_chi_tiet_value' with the actual value for chi_tiet\n" +
                    "  0                 -- Replace 0 with the actual value for isDeleted\n" +
                    ");\n";

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

    }

    // Phuong thuc de sua mot dong

    public void editRow(int soTienThayDoi, String ngayThayDoi, String chiTiet, boolean isDeleted) {
        try {
            Connection connection = Connector.getConnection();

            String updateQuery = "UPDATE `ngan_quy_tang_thuong`\n" +
                    "SET\n" +
                    "  `so_tien_thay_doi` = " + soTienThayDoi +",                -- Replace 150 with the new value for so_tien_thay_doi\n" +
                    "  `ngay_thay_doi` = '" + ngayThayDoi +"',          -- Replace '2023-12-23' with the new value for ngay_thay_doi\n" +
                    "  `chi_tiet` = '" + chiTiet +"',       -- Replace 'new_chi_tiet_value' with the new value for chi_tiet\n" +
                    "  `isDeleted` = " + (isDeleted ? 1 : 0) +"                          -- Replace 1 with the new value for isDeleted\n" +
                    "WHERE\n" +
                    "  `id_ngan_quy_tang_thuong` = '" + this.idNganQuyTangThuong +"';";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    public static NganQuyTangThuong searchNganQuyTangThuong(String idNganQuyTangThuong){
//        try {
//            Connection connection = Connector.getConnection();
//
//            String sql = "SELECT\n" +
//                    "  `id_ngan_quy_tang_thuong`,\n" +
//                    "  `so_tien_thay_doi`,\n" +
//                    "  `ngay_thay_doi`,\n" +
//                    "  `tong_so_tien`,\n" +
//                    "  `chi_tiet`,\n" +
//                    "  `isDeleted`\n" +
//                    "FROM\n" +
//                    "  `ngan_quy_tang_thuong`\n" +
//                    "WHERE id_ngan_quy_tang_thuong = `" + idNganQuyTangThuong +"`;\n";
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            NganQuyTangThuong nganQuyTangThuongNew = new NganQuyTangThuong();
//
//            while (resultSet.next()) {
//                nganQuyTangThuongNew.setIdNganQuyTangThuong(resultSet.getString("id_ngan_quy_tang_thuong"));
//                nganQuyTangThuongNew.setSoTienThayDoi(resultSet.getInt("so_tien_thay_doi"));
//                nganQuyTangThuongNew.setNgayThayDoi(resultSet.getString("ngay_thay_doi"));
//                nganQuyTangThuongNew.setChiTiet(resultSet.getString("chi_tiet"));
//                nganQuyTangThuongNew.setDeleted(Boolean.parseBoolean(resultSet.getString("isDeleted")));
//            }
//
//            return nganQuyTangThuongNew;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    // Phuong thuc de xoa mot dong
    public void deleteRow() {
        try {
            Connection connection = Connector.getConnection();

            String updateQuery = "UPDATE `ngan_quy_tang_thuong`\n" +
                    "SET\n" +
                    "  `isDeleted` = 1\n" +
                    "WHERE\n" +
                    "  `id_ngan_quy_tang_thuong` = '" + this.idNganQuyTangThuong +"';";

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

    @Override
    public String toString() {
        return "NganQuyTangThuong{" +
                "idNganQuyTangThuong='" + idNganQuyTangThuong + '\'' +
                ", soTienThayDoi=" + soTienThayDoi +
                ", ngayThayDoi='" + ngayThayDoi + '\'' +
                ", tongSoTien=" + tongSoTien +
                ", chiTiet='" + chiTiet + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

}
