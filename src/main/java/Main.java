import models.*;
import org.apache.commons.math3.analysis.function.Tan;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        NganQuyTangThuong.setTongSoTien(10000000);
//        ListOfNganQuy listOfNganQuy = new ListOfNganQuy();
//        NganQuyTangThuong nganQuyTangThuong = new NganQuyTangThuong(100000, "Test");
//        nganQuyTangThuong.addNewRow();
//        listOfNganQuy = new ListOfNganQuy();
        ListOfDipTangThuong listOfDipTangThuong = new ListOfDipTangThuong();
//        List<DipTangThuong> dipTangThuongList =
//                listOfDipTangThuong.searchByHocKy("20221");
////        DipTangThuong dipTangThuong = new DipTangThuong(
////                "Trung binh", "20102", 5, 10000);
//        dipTangThuong.addNewRow();
        DipTangThuong dipTangThuong = listOfDipTangThuong.
                getListOfDipTangThuongByHocKyAndThanhTich(
                        "20102", "Trung binh");
        dipTangThuong.setThanhTich("Gioi");
        dipTangThuong.editRow();
//        dipTangThuong.deleteRow();
        ListOfNganQuy listOfNganQuy = new ListOfNganQuy();
        List<NganQuyTangThuong> nganQuyTangThuongList =
                listOfNganQuy.getNotDeletedNganQuy();
        int soTienHienCo = NganQuyTangThuong.getTongSoTien();
        ListOfTangThuong listOfTangThuong = new ListOfTangThuong();
        List<TangThuong> tangThuongList = listOfTangThuong.getTangThuongList();
    }
}
