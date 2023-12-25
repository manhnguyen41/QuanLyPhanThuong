package models;

import dbConnector.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListOfHocSinh {
    // Attribute
    private List<HocSinh> hocSinhList = new ArrayList<>();

    // Constructor
    public ListOfHocSinh() {
        try {
            Connection connection = Connector.getConnection();

            String selectQuery = "SELECT * FROM hoc_sinh;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                HocSinh hocSinh = new HocSinh(resultSet.getInt("nhan_khau_id"),
                        resultSet.getString("hoc_ky"), resultSet.getString("ho_ten"), resultSet.getString("so_ho_khau"),
                        resultSet.getString("truong"), resultSet.getString("lop"), resultSet.getString("thanh_tich"),
                        resultSet.getBoolean("isDeleted"));
                hocSinhList.add(hocSinh);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to add a new list of Hoc Sinh base on hoc ky
    public void addNewHocKy(String hocKy) {
        if (Character.isDigit(hocKy.charAt(0))) {
            int year = Integer.parseInt(hocKy.substring(0, 4));

            try {
                Connection connection = Connector.getConnection();

                String selectQuery = "SELECT\n" +
                        "  `nhan_khau_id`,\n" +
                        "  `ho_ten`,\n" +
                        "  `so_ho_khau`\n" +
                        "  FROM nhan_khau WHERE YEAR(ngay_sinh) > "
                        + (year - 17) + " AND YEAR(ngay_sinh) < "+ (year - 6) + ";";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectQuery);
                while (resultSet.next()) {
                    HocSinh hocSinh = new HocSinh(resultSet.getInt("nhan_khau_id"),
                            hocKy, resultSet.getString("ho_ten"), resultSet.getString("so_ho_khau"));
                    hocSinh.addNewRow();
                    hocSinhList.add(hocSinh);
                    System.out.println(hocSinh.getNhanKhauId());
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            int year = Integer.parseInt(hocKy.substring(hocKy.length() - 4));

            try {
                Connection connection = Connector.getConnection();

                String selectQuery = "SELECT\n" +
                        "  `nhan_khau_id`,\n" +
                        "  `ho_ten`,\n" +
                        "  `so_ho_khau`\n" +
                        "  FROM nhan_khau WHERE YEAR(ngay_sinh) >= "
                        + (year - 18) + " AND YEAR(ngay_sinh) <= "+ (year - 1) + ";";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectQuery);
                while (resultSet.next()) {
                    HocSinh hocSinh = new HocSinh(resultSet.getInt("nhan_khau_id"),
                            hocKy, resultSet.getString("ho_ten"), resultSet.getString("so_ho_khau"));
                    hocSinh.addNewRow();
                    hocSinhList.add(hocSinh);
                    System.out.println(hocSinh.getNhanKhauId());
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Method to get list of HocSinh base on hocKy
    public List<HocSinh> getListOfHocSinhByHocKy(String hocKy) {
        List<HocSinh> filteredList = new ArrayList<>();
        for (HocSinh hocSinh: hocSinhList) {
            if (hocSinh.getHocKy().equals(hocKy)) {
                filteredList.add(hocSinh);
            }
        }
        return filteredList;
    }

    // Method to get list of HocSinh base on hocKy and thanhTich
    public List<HocSinh> getListOfHocSinhByHocKyAndThanhTich(String hocKy, String thanhTich) {
        List<HocSinh> filteredList = new ArrayList<>();
        for (HocSinh hocSinh: hocSinhList) {
            if (hocSinh.getHocKy().equals(hocKy)) {
                if (thanhTich.equals("Trung binh")) {
                    if (hocSinh.getThanhTich().equals(thanhTich) || hocSinh.getThanhTich().equals(" ")) {
                        filteredList.add(hocSinh);
                    }
                } else {
                    if (hocSinh.getThanhTich().equals(thanhTich)) {
                        filteredList.add(hocSinh);
                    }
                }
            }
        }
        return filteredList;
    }

    // Method to get HocSinh by hoTen, soHoKhau and hocKy
    public HocSinh getHocSinhByHoTenSoHoKhauHocKy(String hoTen, String soHoKhau, String hocKy) {
        for (HocSinh hocSinh: hocSinhList) {
            if (hocSinh.getHoTen().equals(hoTen)
                    && hocSinh.getSoHoKhau().equals(soHoKhau)
                    && hocSinh.getHocKy().equals(hocKy)) {
                return hocSinh;
            }
        }
        return null;
    }

    // Get not deleted hocSinh
    public List<HocSinh> getNotDeletedHocSinh() {
        List<HocSinh> filteredList = new ArrayList<>();
        for (HocSinh hocSinh: hocSinhList) {
            if (!hocSinh.isDeleted()) {
                filteredList.add(hocSinh);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<HocSinh> getHocSinhList() {
        return hocSinhList;
    }

    public void setHocSinhList(List<HocSinh> hocSinhList) {
        this.hocSinhList = hocSinhList;
    }
}
