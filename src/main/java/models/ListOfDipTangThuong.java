package models;

import java.util.ArrayList;
import java.util.List;

public class ListOfDipTangThuong{
    // Attribute
    private List<DipTangThuong> dipTangThuongList = new ArrayList<>();

    // Constructor
    public ListOfDipTangThuong() {
    }

    // Search by tenDip
    public List<DipTangThuong> searchByTenDip(String tenDip) {
        List<DipTangThuong> filteredList = new ArrayList<>();
        for (DipTangThuong dipTangThuong: dipTangThuongList) {
            if (dipTangThuong.getTenDip().toLowerCase()
                    .contains(tenDip.toLowerCase())) {
                filteredList.add(dipTangThuong);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<DipTangThuong> getDipTangThuongList() {
        return dipTangThuongList;
    }

    public void setDipTangThuongList(List<DipTangThuong> dipTangThuongList) {
        this.dipTangThuongList = dipTangThuongList;
    }
}
