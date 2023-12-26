package models;

import dbConnector.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListOfNganQuy {
    // Attribute
    private List<NganQuyTangThuong> nganQuyTangThuongList = new ArrayList<>();

    // Constructor
    public ListOfNganQuy() {
        try {
            Connection connection = Connector.getConnection();

            String selectQuery = "SELECT * FROM ngan_quy_tang_thuong;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            NganQuyTangThuong.setTongSoTien(NganQuyTangThuong.getSoTienBanDau());
            while (resultSet.next()) {
                NganQuyTangThuong nganQuyTangThuong = new NganQuyTangThuong(
                        resultSet.getInt("id_ngan_quy_tang_thuong"),
                        resultSet.getInt("so_tien_thay_doi"),
                        resultSet.getString("ngay_thay_doi"),
                        resultSet.getString("chi_tiet"),
                        NganQuyTangThuong.getTongSoTien(),
                        resultSet.getBoolean("isDeleted")
                        );
                if (!nganQuyTangThuong.isDeleted()) {
                    NganQuyTangThuong.setTongSoTien(NganQuyTangThuong.getTongSoTien()
                        - nganQuyTangThuong.getSoTienThayDoi());
                }
                nganQuyTangThuongList.add(nganQuyTangThuong);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Getter and Setter
    public List<NganQuyTangThuong> getNganQuyTangThuongList() {
        return nganQuyTangThuongList;
    }

    public void setNganQuyTangThuongList(List<NganQuyTangThuong> nganQuyTangThuongList) {
        this.nganQuyTangThuongList = nganQuyTangThuongList;
    }

    // Get not deleted nganQuy
    public List<NganQuyTangThuong> getNotDeletedNganQuy() {
        List<NganQuyTangThuong> filteredList = new ArrayList<>();
        for (NganQuyTangThuong nganQuyTangThuong: nganQuyTangThuongList) {
            if (!nganQuyTangThuong.isDeleted()) {
                filteredList.add(nganQuyTangThuong);
            }
        }
        return filteredList;
    }

    // Get NganQuy by idNganQuyTangThuong
    public NganQuyTangThuong getNganQuyById(int idNganQuyTangThuong) {
        for (NganQuyTangThuong nganQuyTangThuong: nganQuyTangThuongList) {
            if (nganQuyTangThuong.getIdNganQuyTangThuong() == idNganQuyTangThuong) {
                return nganQuyTangThuong;
            }
        }
        return null;
    }
}
