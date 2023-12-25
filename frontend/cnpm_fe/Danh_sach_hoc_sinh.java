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
import javax.swing.JOptionPane;
import cnpm_fe.Them_thong_tin_hoc_ki;
public class Danh_sach_hoc_sinh extends javax.swing.JFrame {

    /**
     * Creates new form Danh_sach_hoc_sinh
     */
    public Danh_sach_hoc_sinh() {
        initComponents();
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
        btnPhanThuong = new javax.swing.JLabel();
        btnDipThuong = new javax.swing.JLabel();
        btnQuy = new javax.swing.JLabel();
        btnHocSinh = new javax.swing.JLabel();
        btnThoat = new javax.swing.JLabel();
        Quan_ly_cap_phan_thuong = new javax.swing.JLabel();
        lbDanhSachHocSinh = new javax.swing.JLabel();
        tfHocKi = new javax.swing.JTextField();
        lbHocKi = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnThemHocKi = new javax.swing.JButton();
        btnSuaThongTinHocSinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(828, 449));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        btnPhanThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPhanThuong.setForeground(new java.awt.Color(255, 255, 255));
        btnPhanThuong.setText("Phần thưởng");

        btnDipThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDipThuong.setForeground(new java.awt.Color(255, 255, 255));
        btnDipThuong.setText("Dịp thưởng");

        btnQuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuy.setForeground(new java.awt.Color(255, 255, 255));
        btnQuy.setText("Quỹ");

        btnHocSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHocSinh.setForeground(new java.awt.Color(255, 255, 255));
        btnHocSinh.setText("Học sinh");

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThoat)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnQuy)
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDipThuong)
                            .addComponent(btnPhanThuong)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnHocSinh)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnPhanThuong)
                .addGap(18, 18, 18)
                .addComponent(btnDipThuong)
                .addGap(18, 18, 18)
                .addComponent(btnQuy)
                .addGap(18, 18, 18)
                .addComponent(btnHocSinh)
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

        tfHocKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHocKiActionPerformed(evt);
            }
        });

        lbHocKi.setForeground(new java.awt.Color(0, 102, 102));
        lbHocKi.setText("Học Kì");

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnThemHocKi.setBackground(new java.awt.Color(0, 51, 51));
        btnThemHocKi.setForeground(new java.awt.Color(255, 255, 255));
        btnThemHocKi.setText("Thêm học kì");
        btnThemHocKi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemHocKiMouseClicked(evt);
            }
        });
        btnThemHocKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHocKiActionPerformed(evt);
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
                                        .addComponent(lbHocKi)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfHocKi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(313, 313, 313))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnThemHocKi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lbHocKi)
                    .addComponent(tfHocKi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim)
                    .addComponent(btnThemHocKi)
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

    private void tfHocKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHocKiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHocKiActionPerformed

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        if(tfHocKi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin");
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThemHocKiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemHocKiMouseClicked
        // TODO add your handling code here:
        Them_thong_tin_hoc_ki newForm = new Them_thong_tin_hoc_ki();
        newForm.setVisible(true);
    }//GEN-LAST:event_btnThemHocKiMouseClicked

    private void btnThemHocKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHocKiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemHocKiActionPerformed

    private void btnSuaThongTinHocSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaThongTinHocSinhMouseClicked
        // TODO add your handling code here:
        Them_hoc_sinh newForm = new Them_hoc_sinh();
        newForm.setVisible(true);
    }//GEN-LAST:event_btnSuaThongTinHocSinhMouseClicked

    private void btnSuaThongTinHocSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinHocSinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaThongTinHocSinhActionPerformed

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
    private javax.swing.JLabel btnDipThuong;
    private javax.swing.JLabel btnHocSinh;
    private javax.swing.JLabel btnPhanThuong;
    private javax.swing.JLabel btnQuy;
    private javax.swing.JButton btnSuaThongTinHocSinh;
    private javax.swing.JButton btnThemHocKi;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbDanhSachHocSinh;
    private javax.swing.JLabel lbHocKi;
    private javax.swing.JTextField tfHocKi;
    // End of variables declaration//GEN-END:variables
}
