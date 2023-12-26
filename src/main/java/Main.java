import models.*;
//import org.apache.commons.math3.analysis.function.Tan;
import textHandle.ReadMapFromText;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListOfDipTangThuong listOfDipTangThuong = new ListOfDipTangThuong();
        ListOfHocSinh listOfHocSinh = new ListOfHocSinh();
//        listOfHocSinh.addNewHocKy("Trung thu 2010");
//        listOfHocSinh.addNewHocKy("20102");
//        HocSinh hocSinh = listOfHocSinh.getHocSinhByHoTenSoHoKhauHocKy(
//                "A", "B", "Trung thu 2010");
        String text = "6 goi bim bim: 120000, 4 cai keo: 10000";
        System.out.println(text.matches("^\\s*(?:\\S+(?:\\s+\\S+)*\\s*:\\s*\\d+\\s*,\\s*)*\\S+(?:\\s+\\S+)*\\s*:\\s*\\d+\\s*$"));
        DipTangThuong dipTangThuong = new DipTangThuong(
                "Gioi", "20101",
                ReadMapFromText.readMapFromText(text));
        dipTangThuong.addNewRow();
        dipTangThuong.setChiTiet(ReadMapFromText.readMapFromText(text));
        dipTangThuong.editRow();
    }
}
