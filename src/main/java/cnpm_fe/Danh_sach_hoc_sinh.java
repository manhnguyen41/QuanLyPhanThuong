/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cnpm_fe;

/**
 *
 * @author MIXI_COMPUTER
 */
import cnpm_fe.Them_hoc_sinh;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import cnpm_fe.Them_thong_tin_hoc_ki;
import models.HocSinh;
import models.ListOfHocSinh;

import java.util.List;

public class Danh_sach_hoc_sinh extends javax.swing.JFrame {
    private ListOfHocSinh listOfHocSinh = new ListOfHocSinh();

    /**
     * Creates new form Danh_sach_hoc_sinh
     */
    public Danh_sach_hoc_sinh() {
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
        lbTangThuong = new javax.swing.JLabel();
        lbDipThuong = new javax.swing.JLabel();
        lbNganQuy = new javax.swing.JLabel();
        lbHocSinh = new javax.swing.JLabel();
        lbThoat = new javax.swing.JLabel();
        Quan_ly_cap_phan_thuong = new javax.swing.JLabel();
        lbDanhSachHocSinh = new javax.swing.JLabel();
        tfDipThuong = new javax.swing.JTextField();
        lbDipThuongSearch = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tHocSinh = new javax.swing.JTable();
        btnThemDipThuong = new javax.swing.JButton();
        btnSuaThongTinHocSinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(828, 449));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        lbTangThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTangThuong.setForeground(new java.awt.Color(255, 255, 255));
        lbTangThuong.setText("Tặng thưởng");
        lbTangThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTangThuongClicked(evt);
            }
        });

        lbDipThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDipThuong.setForeground(new java.awt.Color(255, 255, 255));
        lbDipThuong.setText("Dịp thưởng");
        lbDipThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDipThuongClicked(evt);
            }
        });

        lbNganQuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNganQuy.setForeground(new java.awt.Color(255, 255, 255));
        lbNganQuy.setText("Quỹ");
        lbNganQuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNganQuyClicked(evt);
            }
        });

        lbHocSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbHocSinh.setForeground(new java.awt.Color(255, 255, 255));
        lbHocSinh.setText("Học sinh");
        lbHocSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHocSinhClicked(evt);
            }
        });

        lbThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThoat.setForeground(new java.awt.Color(255, 255, 255));
        lbThoat.setText("Thoát");
        lbThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThoatClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbThoat)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbNganQuy)
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDipThuong)
                            .addComponent(lbTangThuong)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbHocSinh)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbTangThuong)
                .addGap(18, 18, 18)
                .addComponent(lbDipThuong)
                .addGap(18, 18, 18)
                .addComponent(lbNganQuy)
                .addGap(18, 18, 18)
                .addComponent(lbHocSinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(lbThoat)
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

        lbDipThuongSearch.setForeground(new java.awt.Color(0, 102, 102));
        lbDipThuongSearch.setText("Dịp thưởng");

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm");
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
                                        .addComponent(lbDipThuongSearch)
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
                    .addComponent(lbDipThuongSearch)
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
        Them_thong_tin_hoc_ki newFrame = new Them_thong_tin_hoc_ki(listOfHocSinh);
        newFrame.setVisible(true);
        display();
    }

    // Event click Button Tim
    private void btnTimClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        String dipThuong = tfDipThuong.getText();
        listOfHocSinh.setHocSinhList(listOfHocSinh.getListOfHocSinhByHocKy(dipThuong));
        display();
    }

    // Event click Tang Thuong
    private void lbTangThuongClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        Danh_sach_phan_thuong newFrame = new Danh_sach_phan_thuong();
        newFrame.setVisible(true);
        this.dispose();
    }

    // Event click Dip Thuong
    private void lbDipThuongClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        Danh_sach_dip_thuong newFrame = new Danh_sach_dip_thuong();
        newFrame.setVisible(true);
        this.dispose();
    }

    // Event click Hoc Sinh
    private void lbHocSinhClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        Danh_sach_hoc_sinh newFrame = new Danh_sach_hoc_sinh();
        newFrame.setVisible(true);
        this.dispose();
    }

    // Evene click Ngan Quy
    private void lbNganQuyClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        Danh_sach_quy newFrame = new Danh_sach_quy();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbTangThuongMouseClicked

    // Event click Thoat
    private void lbThoatClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        this.dispose();
    }

    private void tfDipThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDipThuongActionPerformed
    }

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        if(tfDipThuong.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin");
        }
    }

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

    }

    private void btnThemDipThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemDipThuongMouseClicked
        Them_thong_tin_hoc_ki newForm = new Them_thong_tin_hoc_ki(listOfHocSinh);
        newForm.setVisible(true);
        display();
    }

    private void btnThemDipThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDipThuongActionPerformed
    }

    private void btnSuaThongTinHocSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaThongTinHocSinhMouseClicked
        Them_hoc_sinh newForm = new Them_hoc_sinh();
        newForm.setVisible(true);
    }

    private void btnSuaThongTinHocSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinHocSinhActionPerformed
    }

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
            java.util.logging.Logger.getLogger(Danh_sach_hoc_sinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Danh_sach_hoc_sinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Danh_sach_hoc_sinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Danh_sach_hoc_sinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Danh_sach_hoc_sinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quan_ly_cap_phan_thuong;
    private javax.swing.JLabel lbDipThuong;
    private javax.swing.JLabel lbHocSinh;
    private javax.swing.JLabel lbTangThuong;
    private javax.swing.JLabel lbNganQuy;
    private javax.swing.JButton btnSuaThongTinHocSinh;
    private javax.swing.JButton btnThemDipThuong;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tHocSinh;
    private javax.swing.JLabel lbDanhSachHocSinh;
    private javax.swing.JLabel lbDipThuongSearch;
    private javax.swing.JTextField tfDipThuong;
    // End of variables declaration//GEN-END:variables
}
