
package gui;

public class jFPegawai extends javax.swing.JFrame {
    int x=0;

    /**
     * Creates new form jFKaryawan
     */
    public jFPegawai() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNamaPegawai = new javax.swing.JTextField();
        jCBKategoriPegawai = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTFIdPegawai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFAlamatPegawai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPegawai = new javax.swing.JTable();
        jBTambahPegawai = new javax.swing.JButton();
        jBEditPegawai = new javax.swing.JButton();
        jBHapusPegawai = new javax.swing.JButton();
        jBKembaliPegawai = new javax.swing.JButton();
        jBClearPegawai = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATA MOBIL");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 3, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SECTION_DATA_PEGAWAI");

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATA PEGAWAI");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 3, true));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("KATEGORI");

        jCBKategoriPegawai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supir Travel", "Supir Rental", "Staff Admin", " " }));
        jCBKategoriPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBKategoriPegawaiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("ALAMAT");

        jTFIdPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdPegawaiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        jTPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "ALAMAT", "KATEGORI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTPegawai);

        jBTambahPegawai.setBackground(new java.awt.Color(255, 255, 51));
        jBTambahPegawai.setText("TAMBAH");
        jBTambahPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTambahPegawaiActionPerformed(evt);
            }
        });

        jBEditPegawai.setBackground(new java.awt.Color(255, 255, 51));
        jBEditPegawai.setText("EDIT");
        jBEditPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditPegawaiActionPerformed(evt);
            }
        });

        jBHapusPegawai.setBackground(new java.awt.Color(255, 255, 51));
        jBHapusPegawai.setText("HAPUS");
        jBHapusPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHapusPegawaiActionPerformed(evt);
            }
        });

        jBKembaliPegawai.setBackground(new java.awt.Color(0, 204, 102));
        jBKembaliPegawai.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jBKembaliPegawai.setForeground(new java.awt.Color(255, 255, 255));
        jBKembaliPegawai.setText("KEMBALI");
        jBKembaliPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKembaliPegawaiActionPerformed(evt);
            }
        });

        jBClearPegawai.setBackground(new java.awt.Color(255, 204, 51));
        jBClearPegawai.setText("CLEAR");
        jBClearPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearPegawaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFAlamatPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBHapusPegawai)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTFIdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCBKategoriPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBClearPegawai)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBKembaliPegawai)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jBTambahPegawai)
                                .addGap(34, 34, 34)
                                .addComponent(jBEditPegawai))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBKembaliPegawai)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBKategoriPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFIdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTFNamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAlamatPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTambahPegawai)
                    .addComponent(jBEditPegawai)
                    .addComponent(jBHapusPegawai)
                    .addComponent(jBClearPegawai))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel7)
                .addContainerGap(162, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBKembaliPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKembaliPegawaiActionPerformed
        // TODO add your handling code here:
        new jFMDIUtama().setVisible(true);
        

    }//GEN-LAST:event_jBKembaliPegawaiActionPerformed

    private void jTFIdPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdPegawaiActionPerformed

    private void jCBKategoriPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBKategoriPegawaiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCBKategoriPegawaiActionPerformed

    private void jBTambahPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTambahPegawaiActionPerformed
        // TODO add your handling code here:
        jTPegawai.setValueAt(jTFIdPegawai.getText(),x,0);
        jTPegawai.setValueAt(jTFNamaPegawai.getText(),x,1);
        jTPegawai.setValueAt(jTFAlamatPegawai.getText(),x,2);
        jTPegawai.setValueAt(jCBKategoriPegawai.getSelectedItem(),x,3);
        x=x+1;
    }//GEN-LAST:event_jBTambahPegawaiActionPerformed

    private void jBClearPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearPegawaiActionPerformed
        // TODO add your handling code here:
        jTFIdPegawai.setText("");
        jTFNamaPegawai.setText("");
        jTFAlamatPegawai.setText("");
        jCBKategoriPegawai.setSelectedItem(null);
        jTFIdPegawai.requestFocus();
    }//GEN-LAST:event_jBClearPegawaiActionPerformed

    private void jBHapusPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHapusPegawaiActionPerformed
        // TODO add your handling code here:
        jTPegawai.setValueAt("",jTPegawai.getSelectedRow(),0);
        jTPegawai.setValueAt("",jTPegawai.getSelectedRow(),1);
        jTPegawai.setValueAt("",jTPegawai.getSelectedRow(),2);
        jTPegawai.setValueAt("",jTPegawai.getSelectedRow(),3);
    }//GEN-LAST:event_jBHapusPegawaiActionPerformed

    private void jBEditPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditPegawaiActionPerformed
        // TODO add your handling code here:
        jTPegawai.setValueAt(jTFIdPegawai.getText(),jTPegawai.getSelectedRow(),0);
        jTPegawai.setValueAt(jTFNamaPegawai.getText(),jTPegawai.getSelectedRow(),1);
        jTPegawai.setValueAt(jTFAlamatPegawai.getText(),jTPegawai.getSelectedRow(),2);
        jTPegawai.setValueAt(jCBKategoriPegawai.getSelectedItem(),jTPegawai.getSelectedRow(),3);
    }//GEN-LAST:event_jBEditPegawaiActionPerformed

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
            java.util.logging.Logger.getLogger(jFPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClearPegawai;
    private javax.swing.JButton jBEditPegawai;
    private javax.swing.JButton jBHapusPegawai;
    private javax.swing.JButton jBKembaliPegawai;
    private javax.swing.JButton jBTambahPegawai;
    private javax.swing.JComboBox<String> jCBKategoriPegawai;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAlamatPegawai;
    private javax.swing.JTextField jTFIdPegawai;
    private javax.swing.JTextField jTFNamaPegawai;
    private javax.swing.JTable jTPegawai;
    // End of variables declaration//GEN-END:variables
}