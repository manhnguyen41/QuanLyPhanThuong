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
    }

    // Getter and Setter
    public List<NganQuyTangThuong> getNganQuyTangThuongList() {
        return nganQuyTangThuongList;
    }

    public void setNganQuyTangThuongList(List<NganQuyTangThuong> nganQuyTangThuongList) {
        this.nganQuyTangThuongList = nganQuyTangThuongList;
    }

    public List<NganQuyTangThuong> getListFromDatabase() {
        List<NganQuyTangThuong> nganQuyTangThuongList = new ArrayList<>();
        try {
            Connection connection = Connector.getConnection();

            String sql = "SELECT\n" +
                    "  `id_ngan_quy_tang_thuong`,\n" +
                    "  `so_tien_thay_doi`,\n" +
                    "  `ngay_thay_doi`,\n" +
                    "  `tong_so_tien`,\n" +
                    "  `chi_tiet`,\n" +
                    "  `isDeleted`\n" +
                    "FROM\n" +
                    "  `ngan_quy_tang_thuong`\n";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                NganQuyTangThuong nganQuyTangThuongNew = new NganQuyTangThuong();
                nganQuyTangThuongNew.setIdNganQuyTangThuong(resultSet.getString("id_ngan_quy_tang_thuong"));
                nganQuyTangThuongNew.setSoTienThayDoi(resultSet.getInt("so_tien_thay_doi"));
                nganQuyTangThuongNew.setNgayThayDoi(resultSet.getString("ngay_thay_doi"));
                nganQuyTangThuongNew.setChiTiet(resultSet.getString("chi_tiet"));
                nganQuyTangThuongNew.setDeleted(Boolean.parseBoolean(resultSet.getString("isDeleted")));
                nganQuyTangThuongList.add(nganQuyTangThuongNew);
            }

            for (NganQuyTangThuong nganQuyTangThuong : nganQuyTangThuongList) {
                System.out.println(nganQuyTangThuong.toString());
            }
            return nganQuyTangThuongList;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
