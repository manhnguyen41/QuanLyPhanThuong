package models;

import dbConnector.Connector;
import textHandle.ReadFromJson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListOfDipTangThuong{
    // Attribute
    private List<DipTangThuong> dipTangThuongList = new ArrayList<>();

    // Constructor
    public ListOfDipTangThuong() {
        ListOfHocSinh listOfHocSinh = new ListOfHocSinh();
        try {
            Connection connection = Connector.getConnection();

            String selectQuery = "SELECT * FROM dip_tang_thuong;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                DipTangThuong dipTangThuong = new DipTangThuong(
                        resultSet.getInt("id_dip_tang_thuong"),
                        resultSet.getString("thanh_tich"),
                        resultSet.getString("hoc_ky"),
                        resultSet.getString("ngay_tang_thuong"),
                        resultSet.getInt("tong_so_tien"),
                        ReadFromJson.jsonToMap(resultSet.getString("chi_tiet")),
                        resultSet.getBoolean("isDeleted"),
                        listOfHocSinh);
                ListOfNganQuy listOfNganQuy = new ListOfNganQuy();
                NganQuyTangThuong nganQuyTangThuong = listOfNganQuy.getNganQuyById(dipTangThuong.getIdDipTangTuong());
                dipTangThuong.setNganQuyTangThuong(nganQuyTangThuong);
                dipTangThuongList.add(dipTangThuong);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search by hocKy
    public List<DipTangThuong> searchByHocKy(String hocKy) {
        List<DipTangThuong> filteredList = new ArrayList<>();
        for (DipTangThuong dipTangThuong: dipTangThuongList) {
            if (dipTangThuong.getHocKy().toLowerCase()
                    .contains(hocKy.toLowerCase()) && !dipTangThuong.isDeleted()) {
                filteredList.add(dipTangThuong);
            }
        }
        return filteredList;
    }

    // Method to  DipTangThuong base on hocKy and thanhTich
    public DipTangThuong getListOfDipTangThuongByHocKyAndThanhTich(String hocKy, String thanhTich) {
        for (DipTangThuong dipTangThuong: dipTangThuongList) {
            if (dipTangThuong.getHocKy().contains(hocKy)
                    && dipTangThuong.getThanhTich().contains(thanhTich) && !dipTangThuong.isDeleted()) {
                return dipTangThuong;
            }
        }
        return null;
    }

    // Get not deleted dipTangThuong
    public List<DipTangThuong> getNotDeletedDipTangThuong() {
        List<DipTangThuong> filteredList = new ArrayList<>();
        for (DipTangThuong dipTangThuong: dipTangThuongList) {
            if (!dipTangThuong.isDeleted()) {
                filteredList.add(dipTangThuong);
            }
        }
        return filteredList;
    }

    // Get newest hoc ky

    // Getter and Setter
    public List<DipTangThuong> getDipTangThuongList() {
        return dipTangThuongList;
    }

    public void setDipTangThuongList(List<DipTangThuong> dipTangThuongList) {
        this.dipTangThuongList = dipTangThuongList;
    }
}
