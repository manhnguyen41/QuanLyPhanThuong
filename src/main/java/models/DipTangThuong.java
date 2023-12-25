package models;

import dbConnector.Connector;
import textHandle.WriteToJson;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DipTangThuong implements DBActing{
    // Attribute
    private int idDipTangThuong;
    private String thanhTich;
    private String hocKy;
    private String ngayTangThuong;
    private int tongSoTien;
    private Map<String, Integer> chiTiet = new HashMap<>();
    private boolean isDeleted = false;
    private List<HocSinh> listOfHocSinh;
    private NganQuyTangThuong nganQuyTangThuong;

    // Constructor
    public DipTangThuong(String thanhTich, String hocKy,
                         Map<String, Integer> chiTiet) {
        this.thanhTich = thanhTich.equals(" ") ? hocKy : thanhTich;
        this.hocKy = hocKy;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.ngayTangThuong = currentDate.format(formatter);
        this.chiTiet = chiTiet;
        listOfHocSinh = filter(new ListOfHocSinh());
        calculateTongSoTien();
    }
    public DipTangThuong(int idDipTangThuong, String thanhTich, String hocKy, String ngayTangThuong,
                         int tongSoTien, Map<String, Integer> chiTiet, boolean isDeleted,
                         ListOfHocSinh listOfHocSinh) {
        this.idDipTangThuong = idDipTangThuong;
        this.thanhTich = thanhTich;
        this.hocKy = hocKy;
        this.ngayTangThuong = ngayTangThuong;
        this.tongSoTien = tongSoTien;
        this.chiTiet = chiTiet;
        this.isDeleted = isDeleted;
        this.listOfHocSinh = filter(listOfHocSinh);
    }

    // Method to calculate tongSoTien
    public void calculateTongSoTien() {
        int soTien = 0;
        for (Integer giaTien: chiTiet.values()) {
            soTien += giaTien;
        }
        soTien *= listOfHocSinh.size();
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
                    "  `chi_tiet`,\n" +
                    "  `tong_so_tien`\n" +
                    ") VALUES (\n" +
                    "  '" + thanhTich +
                    "', '" + hocKy +
                    "', '" + ngayTangThuong +
                    "',  '" + WriteToJson.mapToJson(chiTiet) +
                    "',  " + tongSoTien +
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

            for (HocSinh hocSinh: listOfHocSinh) {
                ListOfTangThuong listOfTangThuong = new ListOfTangThuong();
                TangThuong tangThuong = new TangThuong(idDipTangThuong, hocSinh.getSoHoKhau(), hocKy);
                int index = listOfTangThuong.getTangThuongList().indexOf(tangThuong);
                if (index >= 0) {
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
                    ", `chi_tiet` = '" + WriteToJson.mapToJson(chiTiet) +
                    "' WHERE\n" +
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

            for (HocSinh hocSinh: listOfHocSinh) {
                listOfTangThuong = new ListOfTangThuong();
                TangThuong tangThuong = new TangThuong(idDipTangThuong, hocSinh.getSoHoKhau(), hocKy);
                int index = listOfTangThuong.getTangThuongList().indexOf(tangThuong);
                if (index >= 0) {
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

    // Filter
    private List<HocSinh> filter(ListOfHocSinh listOfHocSinh) {
        List<HocSinh> hocSinhList;
        if (Character.isDigit(hocKy.indexOf(0))) {
            hocSinhList = listOfHocSinh.
                    getListOfHocSinhByHocKyAndThanhTich(hocKy, thanhTich);
        } else {
            hocSinhList = listOfHocSinh.
                    getListOfHocSinhByHocKy(hocKy);
        }
        return hocSinhList;
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

    public Map<String, Integer> getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(Map<String, Integer> chiTiet) {
        this.chiTiet = chiTiet;
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
