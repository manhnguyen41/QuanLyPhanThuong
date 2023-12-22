import dbConnector.Connector;
import models.ListOfNganQuy;
import models.NganQuyTangThuong;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {

        // TEST CASE 1: ADD NGAN QUY TANG THUONG

//        NganQuyTangThuong nganQuyTangThuong1 = new NganQuyTangThuong("1",100,"2020-02-02","hvbfhdfbb");
//        nganQuyTangThuong1.addNewRow();

        // test case done, add successfully

        // TEST CASE 2: EDIT NGAN QUY TANG THUONG

//        NganQuyTangThuong nganQuyTangThuong2 = new NganQuyTangThuong("2",100,"2020-02-02","hvbfhdfbb");
//        nganQuyTangThuong2.addNewRow();
//        nganQuyTangThuong2.editRow(200, "2021-06-04","chi tiết của nfuruhuh", false);

        // test case done

        // TEST CASE 3: DELETE NGAN QUY TANG THUONG

//        NganQuyTangThuong nganQuyTangThuong3 = new NganQuyTangThuong("3",100,"2020-02-02","hvbfhdfbb");
//        nganQuyTangThuong3.addNewRow();
//        nganQuyTangThuong3.deleteRow();

        // test case done

        // TEST CASE 4: SELECT LIST OF NGÂN QUỸ

        ListOfNganQuy listOfNganQuy = new ListOfNganQuy();
        listOfNganQuy.getListFromDatabase();

        // test case done
    }
}
