package models;

import java.util.ArrayList;
import java.util.List;

public class ListOfTangThuong {
    // Attribute
    private List<TangThuong> tangThuongList = new ArrayList<>();

    // Constructor
    public ListOfTangThuong() {
    }

    // Search by so ho khau
    public List<TangThuong> searchBySoHoKhau(String soHoKhau) {
        List<TangThuong> filteredList = new ArrayList<>();
        for (TangThuong tangThuong: tangThuongList) {
            if (tangThuong.getSoHoKhau().contains(soHoKhau)) {
                filteredList.add(tangThuong);
            }
        }
        return filteredList;
    }

    // Search by ten dip
    public List<TangThuong> searchByTenDip(String tenDip) {
        List<TangThuong> filteredList = new ArrayList<>();
        for (TangThuong tangThuong: tangThuongList) {
            if (tangThuong.getTenDip().toLowerCase()
                    .contains(tenDip.toLowerCase())) {
                filteredList.add(tangThuong);
            }
        }
        return filteredList;
    }

    // Search by so ho khau and ten dip
    public List<TangThuong> searchBySoHoKhau(String soHoKhau, String tenDip) {
        List<TangThuong> filteredList = new ArrayList<>();
        for (TangThuong tangThuong: tangThuongList) {
            if (tangThuong.getSoHoKhau().contains(soHoKhau)
                    && tangThuong.getTenDip().toLowerCase()
                    .contains(tenDip.toLowerCase())) {
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
