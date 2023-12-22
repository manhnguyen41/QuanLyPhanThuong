package models;

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
}
