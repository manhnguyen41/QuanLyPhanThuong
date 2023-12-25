package models;

import dbConnector.Connector;
import textHandle.ReadFromJson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListOfTangThuong {
    // Attribute
    private List<TangThuong> tangThuongList = new ArrayList<>();

    // Constructor
    public ListOfTangThuong() {
        try {
            Connection connection = Connector.getConnection();

            String selectQuery = "SELECT * FROM tang_thuong;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                TangThuong tangThuong = new TangThuong(
                        resultSet.getInt("id_dip_tang_thuong"),
                        resultSet.getString("so_ho_khau"),
                        resultSet.getString("hoc_ky"),
                        ReadFromJson.jsonToMap(resultSet.getString("chi_tiet_phan_qua")),
                        resultSet.getBoolean("isDeleted")
                );
                tangThuongList.add(tangThuong);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search by so ho khau and hoc ky
    public List<TangThuong> searchBySoHoKhauAndHocKy(String soHoKhau, String hocKy) {
        List<TangThuong> filteredList = new ArrayList<>();
        for (TangThuong tangThuong: tangThuongList) {
            if (tangThuong.getSoHoKhau().contains(soHoKhau)
                    && tangThuong.getHocKy().contains(hocKy)) {
                filteredList.add(tangThuong);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<TangThuong> getTangThuongList() {
        return tangThuongList;
    }

    public void setTangThuongList(List<TangThuong> tangThuongList) {
        this.tangThuongList = tangThuongList;
    }
}
