/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cnpm_fe;

/**
 *
 * @author MIXI_COMPUTER
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import models.HocSinh;
import models.ListOfHocSinh;

public class DanhSachHocSinh extends javax.swing.JFrame {
    private ListOfHocSinh listOfHocSinh = new ListOfHocSinh();
    private int nhanKhauId = -1;
    private String dipThuong = "";
    private HocSinh hocSinh = null;

    /**
     * Creates new form Danh_sach_hoc_sinh
     */
    public DanhSachHocSinh() {
        initComponents();
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTangThuong = new javax.swing.JLabel();
        btnDipThuong = new javax.swing.JLabel();
        btnQuy = new javax.swing.JLabel();
        btnHocSinh = new javax.swing.JLabel();
        btnThoat = new javax.swing.JLabel();
        Quan_ly_cap_phan_thuong = new javax.swing.JLabel();
        lbDanhSachHocSinh = new javax.swing.JLabel();
        tfDipThuong = new javax.swing.JTextField();
        btnDipThuongSearch = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tHocSinh = new javax.swing.JTable();
        btnThemDipThuong = new javax.swing.JButton();
        btnSuaThongTinHocSinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(828, 449));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        btnTangThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTangThuong.setForeground(new java.awt.Color(255, 255, 255));
        btnTangThuong.setText("Tặng thưởng");
        btnTangThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTangThuongClicked(evt);
            }
        });

        btnDipThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDipThuong.setForeground(new java.awt.Color(255, 255, 255));
        btnDipThuong.setText("Dịp thưởng");
        btnDipThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDipThuongClicked(evt);
            }
        });

        btnQuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuy.setForeground(new java.awt.Color(255, 255, 255));
        btnQuy.setText("Quỹ");
        btnQuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuyClicked(evt);
            }
        });

        btnHocSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHocSinh.setForeground(new java.awt.Color(255, 255, 255));
        btnHocSinh.setText("Học sinh");
        btnHocSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHocSinhClicked(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btnThoat)
                        .addComponent(btnQuy)
                        .addComponent(btnTangThuong)
                        .addComponent(btnDipThuong)
                        .addComponent(btnHocSinh))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(btnHocSinh)
                    .addGap(18, 18, 18)
                    .addComponent(btnDipThuong)
                    .addGap(18, 18, 18)
                    .addComponent(btnTangThuong)
                    .addGap(18, 18, 18)
                    .addComponent(btnQuy)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                    .addComponent(btnThoat)
                    .addGap(35, 35, 35))
        );

        Quan_ly_cap_phan_thuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quan_ly_cap_phan_thuong.setForeground(new java.awt.Color(0, 102, 102));
        Quan_ly_cap_phan_thuong.setText("Quản lý cấp phát phần thưởng");

        lbDanhSachHocSinh.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbDanhSachHocSinh.setForeground(new java.awt.Color(0, 102, 102));
        lbDanhSachHocSinh.setText("Danh sách học sinh");

        tfDipThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDipThuongActionPerformed(evt);
            }
        });

        btnDipThuongSearch.setForeground(new java.awt.Color(0, 102, 102));
        btnDipThuongSearch.setText("Dịp thưởng");

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Lọc");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimClicked(evt);
            }
        });
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        tHocSinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhân khẩu ID", "Trường", "Lớp", "Thành tích", "Dịp thưởng", "Họ tên",
                    "Sổ hộ khẩu"
            }
        ));

        tHocSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tHocSinhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tHocSinh);

        btnThemDipThuong.setBackground(new java.awt.Color(0, 51, 51));
        btnThemDipThuong.setForeground(new java.awt.Color(255, 255, 255));
        btnThemDipThuong.setText("Thêm dịp thưởng");
        btnThemDipThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemDipThuongClicked(evt);
            }
        });
        btnThemDipThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDipThuongActionPerformed(evt);
            }
        });

        btnSuaThongTinHocSinh.setBackground(new java.awt.Color(0, 51, 51));
        btnSuaThongTinHocSinh.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaThongTinHocSinh.setText("Sửa");
        btnSuaThongTinHocSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaThongTinHocSinhMouseClicked(evt);
            }
        });
        btnSuaThongTinHocSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinHocSinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDipThuongSearch)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfDipThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(313, 313, 313))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnThemDipThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnSuaThongTinHocSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 177, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(Quan_ly_cap_phan_thuong))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(lbDanhSachHocSinh)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Quan_ly_cap_phan_thuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDanhSachHocSinh)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDipThuongSearch)
                    .addComponent(tfDipThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim)
                    .addComponent(btnThemDipThuong)
                    .addComponent(btnSuaThongTinHocSinh))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Event click Button Thêm dịp thưởng
    private void btnThemDipThuongClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        ThemDipThuongHocSinh newForm = new ThemDipThuongHocSinh(listOfHocSinh);
        newForm.setVisible(true);
    }

    // Event click Button Tim
    private void btnTimClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        String dipThuong = tfDipThuong.getText();
        listOfHocSinh.setHocSinhList(listOfHocSinh.getListOfHocSinhByHocKy(dipThuong));
        display();
    }

    // Event click Tang Thuong
    private void btnTangThuongClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        DanhSachTangThuong newFrame = new DanhSachTangThuong();
        newFrame.setVisible(true);
        this.dispose();
    }

    // Event click Dip Thuong
    private void btnDipThuongClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        DanhSachDipThuong newFrame = new DanhSachDipThuong();
        newFrame.setVisible(true);
        this.dispose();
    }

    // Event click Hoc Sinh
    private void btnHocSinhClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        DanhSachHocSinh newFrame = new DanhSachHocSinh();
        newFrame.setVisible(true);
        this.dispose();
    }

    // Evene click Ngan Quy
    private void btnQuyClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        DanhSachQuy newFrame = new DanhSachQuy();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTangThuongMouseClicked

    // Event click Thoat
    private void btnThoatClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        this.dispose();
    }

    private void tfDipThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDipThuongActionPerformed
    }

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked

    }

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

    }

    private void btnThemDipThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDipThuongActionPerformed
    }

    private void btnSuaThongTinHocSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:
        // ------ kiểm tra xem đã chọn học sinh chưa
        if (nhanKhauId == -1 || dipThuong.equals("") || hocSinh == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một học sinh trong bảng\n"
                + "để sửa thông tin về học sinh đó.");
            return;
        }
        if (!Character.isDigit(dipThuong.charAt(0))) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một học sinh có dịp thưởng là học kỳ để sửa");
            return;
        }
        // ------ truyền vào form sửa học sinh
        SuaHocSinh newForm = new SuaHocSinh(hocSinh);
        newForm.setVisible(true);
    }

    private void btnSuaThongTinHocSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinHocSinhActionPerformed

    }

    private void tHocSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tHoKhauMouseClicked
        DefaultTableModel model = (DefaultTableModel)tHocSinh.getModel();
        int indexRow = tHocSinh.getSelectedRow();
        nhanKhauId = Integer.parseInt(model.getValueAt(indexRow, 0).toString());
        dipThuong = String.valueOf(model.getValueAt(indexRow, 4).toString());
        hocSinh = listOfHocSinh.getHocSinhByNhanKhauIdHocKy(nhanKhauId, dipThuong);
    }//GEN-LAST:event_tHoKhauMouseClicked

    private void display() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tHocSinh.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        for(HocSinh hocSinh: listOfHocSinh.getHocSinhList()){
            String data[] = {Integer.toString(hocSinh.getNhanKhauId()), hocSinh.getTruong(),
                    hocSinh.getLop(), hocSinh.getThanhTich(), hocSinh.getHocKy(),
                    hocSinh.getHoTen(), hocSinh.getSoHoKhau()};
            defaultTableModel.addRow(data);
        }
        listOfHocSinh = new ListOfHocSinh();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachHocSinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quan_ly_cap_phan_thuong;
    private javax.swing.JLabel btnDipThuong;
    private javax.swing.JLabel btnHocSinh;
    private javax.swing.JLabel btnTangThuong;
    private javax.swing.JLabel btnQuy;
    private javax.swing.JButton btnSuaThongTinHocSinh;
    private javax.swing.JButton btnThemDipThuong;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tHocSinh;
    private javax.swing.JLabel lbDanhSachHocSinh;
    private javax.swing.JLabel btnDipThuongSearch;
    private javax.swing.JTextField tfDipThuong;
    // End of variables declaration//GEN-END:variables
}
