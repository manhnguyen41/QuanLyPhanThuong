package models;

import dbConnector.Connector;
import textHandle.WriteToJson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TangThuong implements DBActing{
    // Attribute
    private int idDipTangThuong;
    private String soHoKhau;
    private String hocKy;
    private Map<String, Integer> chiTietPhanQua = new HashMap<>();
    private boolean isDeleted = false;

    // Constructor
    public TangThuong(int idDipTangThuong, String soHoKhau, String hocKy) {
        this.idDipTangThuong = idDipTangThuong;
        this.soHoKhau = soHoKhau;
        this.hocKy = hocKy;
    }

    public TangThuong(int idDipTangThuong, String soHoKhau, String hocKy, Map<String, Integer> chiTietPhanQua, boolean isDeleted) {
        this.idDipTangThuong = idDipTangThuong;
        this.soHoKhau = soHoKhau;
        this.hocKy = hocKy;
        this.chiTietPhanQua = chiTietPhanQua;
        this.isDeleted = isDeleted;
    }

    // Phuong thuc de them mot dong vao csdl
    public boolean addNewRow() {
        try {
            Connection connection = Connector.getConnection();

            String insertQuery = "INSERT INTO `tang_thuong` (\n" +
                    "  `id_dip_tang_thuong`,\n" +
                    "  `so_ho_khau`,\n" +
                    "  `hoc_ky`,\n" +
                    "  `chi_tiet_phan_qua`\n" +
                    ") VALUES (\n" +
                    "   " + idDipTangThuong +
                    ", '" + soHoKhau +
                    "', '" + hocKy +
                    "', '" + WriteToJson.mapToJson(chiTietPhanQua) +
                    "');\n";

            PreparedStatement add = connection.prepareStatement(insertQuery);
            int row = add.executeUpdate();

            // --- thêm một đoạn dialog báo thêm thành công ở đây

            add.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editRow() {
        try {
            Connection connection = Connector.getConnection();

            String updateQuery = "UPDATE `tang_thuong`\n" +
                    "SET\n" +
                    " `chi_tiet_phan_qua` = '" + WriteToJson.mapToJson(chiTietPhanQua) +
                    "' WHERE\n" +
                    "  `hoc_ky` = '" + hocKy +
                    "' AND `so_ho_khau` = '" + soHoKhau + "';";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteRow() {
        try {
            Connection connection = Connector.getConnection();

            String deleteQuery = "DELETE FROM `tang_thuong`\n" +
                    " WHERE\n" +
                    "  `hoc_ky` = '" + hocKy +
                    "' AND `so_ho_khau` = '" + soHoKhau + "';";

            PreparedStatement edit = connection.prepareStatement(deleteQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TangThuong that = (TangThuong) o;
        return Objects.equals(soHoKhau, that.soHoKhau) && Objects.equals(hocKy, that.hocKy);
    }

    // Getter and Setter

    public int getIdDipTangThuong() {
        return idDipTangThuong;
    }

    public void setIdDipTangThuong(int idDipTangThuong) {
        this.idDipTangThuong = idDipTangThuong;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
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
