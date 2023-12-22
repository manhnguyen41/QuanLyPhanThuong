package dbConnector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {
    // Attribute
    private Connection connection = null;

    // Constructor
    public Connector() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demographic","root","");
    }

    //

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");

        // ----- thêm chủ hộ vào nhân khẩu -----
        String sql = "INSERT INTO nhan_khau (ho_ten, biet_danh, gioi_tinh, ngay_sinh, "
                + "so_CMND, ngay_cap_CMND, noi_cap_CMND, noi_sinh, nguyen_quan, dan_toc, nghe_nghiep, "
                + "noi_lam_viec, quan_he_voi_chu_ho, ngay_dang_ky_thuong_tru, dia_chi_truoc_khi_chuyen, so_ho_khau)\n"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);\n";
        PreparedStatement add = conn.prepareStatement(sql);
        add.setString(1, tfHoTen.getText());
        add.setString(2, tfBietDanh.getText());
        add.setString(3, cbGioiTinh.getSelectedItem().toString());
        add.setString(4, tfNgaySinh.getText());
        add.setString(5, tfSoCMND.getText());
        add.setString(6, tfNgayCap.getText());
        add.setString(7, tfNoiCap.getText());
        add.setString(8, tfNoiSinh.getText());
        add.setString(9, tfNguyenQuan.getText());
        add.setString(10, tfDanToc.getText());
        add.setString(11, tfNgheNghiep.getText());
        add.setString(12, tfNoiLamViec.getText());
        add.setString(13, "Chủ hộ");
        add.setString(14, tfNgayDangKyThuongTru.getText());
        add.setString(15, tfDiaChiTruocKhiChuyen.getText());
        add.setString(16, tfSoHoKhau.getText());

        int row = add.executeUpdate();

        // ----- thêm hộ khẩu ------
        sql = "INSERT INTO ho_khau (so_ho_khau, chu_ho_id ,chu_ho_CMND, dia_chi, la_chung_cu, ngay_lap)"
                + " SELECT ?,nhan_khau_id,?,?,?,?\n"
                + " FROM nhan_khau"
                + " WHERE so_CMND = ?;"
        ;
        add = conn.prepareStatement(sql);
        add.setString(1, tfSoHoKhau.getText());
        add.setString(2,tfSoCMND.getText());
        add.setString(3, tfDiaChi.getText());
        add.setString(4, cbLaChungCu.getSelectedItem().toString());
        add.setString(5, tfNgayLap.getText());
        add.setString(6, tfSoCMND.getText());

        row = add.executeUpdate();

        // ----- log việc thêm hộ khẩu ------
        sql = "INSERT INTO ho_khau_log (ho_khau_id, so_ho_khau, chu_ho_id ,chu_ho_CMND, dia_chi, la_chung_cu, ngay_lap)"
                + " SELECT ho_khau_id,?,chu_ho_id,?,?,?,?\n"
                + " FROM ho_khau"
                + " WHERE so_ho_khau = ?;"
        ;
        add = conn.prepareStatement(sql);
        add.setString(1, tfSoHoKhau.getText());
        add.setString(2,tfSoCMND.getText());
        add.setString(3, tfDiaChi.getText());
        add.setString(4, cbLaChungCu.getSelectedItem().toString());
        add.setString(5, tfNgayLap.getText());
        add.setString(6, tfSoHoKhau.getText());

        row = add.executeUpdate();

//                sql = "UPDATE ho_khau\n" +
//                "SET chu_ho_id = (SELECT nhan_khau_id FROM nhan_khau WHERE chu_ho_CMND = ?)\n" +
//                "WHERE chu_ho_CMND = ?;";
//                add = conn.prepareStatement(sql);
//                add.setString(1, tfSoCMND.getText());
//                add.setString(2, tfSoCMND.getText());

        JOptionPane.showMessageDialog(this, "Đã thêm hộ khẩu." );
        conn.close();
        this.dispose();
    }
        catch (Exception e){
        try {
            // ------------ xóa những gì mới cập nhật -----------------
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");

            String sql = "DELETE FROM nhan_khau WHERE so_CMND = ?";
            PreparedStatement add = conn.prepareStatement(sql);
            add.setString(1, tfSoCMND.getText());

            add.execute();

            sql = "DELETE FROM ho_khau WHERE so_ho_khau = ?";
            add = conn.prepareStatement(sql);
            add.setString(1, tfSoHoKhau.getText());

            add.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ThemHoKhauForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Bạn vui lòng kiểm tra lại các trường thông tin.\n"
                + "Lỗi này xảy ra khi bạn nhập sai cú pháp ngày tháng, sai số CMND hoặc hộ đã tồn tại trong cơ sở dữ liệu.");
    }
}
