/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.visual.inputdata;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafhi
 */
public class fromBarang extends javax.swing.JFrame {
    
       private Connection conn = DBConnection.getConnection();
      
      /**
     * Creates new form fromBarang
     */
    public fromBarang() {
        initComponents();
        kosongkanFrom();
        showData();
        conn = DBConnection.getConnection();
    }
     
    private void kosongkanFrom(){
        kodeBarang.setText(null);
        namaBarang.setText(null);
        modelBarang.setText(null);
        beratBarang.setText(null);
    }
    
    private void showData(){
          DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No :");
            model.addColumn("kode Barang ");
            model.addColumn("Nama Barang ");
            model.addColumn("Model Barang ");
            model.addColumn("Jenis Barang ");
            model.addColumn("Kadar Barang ");
            model.addColumn("Berat Barang(gram)");
            
            String cari = searchKey.getText();
            try{
                int no = 1;
                String sql = "SELECT * FROM data WHERE model_barang LIKE '%"+cari+"'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                   model.addRow(new Object[] {
                        no++,
                        rs.getString("kode_barang"),
                        rs.getString("nama_barang"),
                        rs.getString("model_barang"),
                        rs.getString("jenis_barang"),
                        rs.getString("kadar_barang"),
                        rs.getString("berat_barang")
                   });
                    Table1.setModel(model);
                }
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, 
                        ex.getMessage(),"Error",
                        JOptionPane.ERROR_MESSAGE);
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tbsave = new javax.swing.JButton();
        tbedit = new javax.swing.JButton();
        tbdelete = new javax.swing.JButton();
        tbclear = new javax.swing.JButton();
        tbexit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        searchKey = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kodeBarang = new javax.swing.JTextField();
        namaBarang = new javax.swing.JTextField();
        modelBarang = new javax.swing.JTextField();
        jenisBarang = new javax.swing.JComboBox<>();
        kadarBarang = new javax.swing.JComboBox<>();
        beratBarang = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jEditorPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 204, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField1.setText("Rahzan Aryo T_202043500753");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tbsave.setText("SAVE");
        tbsave.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbsaveAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tbsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbsaveActionPerformed(evt);
            }
        });

        tbedit.setText("UPDATE");
        tbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbeditActionPerformed(evt);
            }
        });

        tbdelete.setText("DELETE");
        tbdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdeleteActionPerformed(evt);
            }
        });

        tbclear.setText("CLEAR");
        tbclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbclearActionPerformed(evt);
            }
        });

        tbexit.setText("EXIT");
        tbexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbexitActionPerformed(evt);
            }
        });

        jLabel8.setText("Search ");

        searchKey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyKeyReleased(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Model", "Jenis", "Kadar", "Berat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table1.setEnabled(false);
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Table1MouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(Table1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(tbsave)
                                .addGap(92, 92, 92)
                                .addComponent(tbedit)
                                .addGap(78, 78, 78)
                                .addComponent(tbdelete)
                                .addGap(71, 71, 71)
                                .addComponent(tbclear)
                                .addGap(75, 75, 75)
                                .addComponent(tbexit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbsave)
                    .addComponent(tbedit)
                    .addComponent(tbdelete)
                    .addComponent(tbclear)
                    .addComponent(tbexit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(searchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("DATA BARANG");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Model");

        jLabel5.setText("Jenis");

        jLabel6.setText("Kadar");

        jLabel7.setText("Berat (gram)");

        kodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBarangActionPerformed(evt);
            }
        });

        jenisBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Logam Mulia", "Emas Antam", "Big Gold", "UBS" }));
        jenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisBarangActionPerformed(evt);
            }
        });

        kadarBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "99%", "89%", "47,1%", " ", " " }));
        kadarBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadarBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kodeBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(namaBarang)
                    .addComponent(modelBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kadarBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beratBarang)
                    .addComponent(jenisBarang, 0, 126, Short.MAX_VALUE))
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kadarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(modelBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beratBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(767, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbexitActionPerformed

    private void tbsaveAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbsaveAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbsaveAncestorAdded

    private void jenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisBarangActionPerformed

    private void kadarBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadarBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kadarBarangActionPerformed
    // btnSave
    private void tbsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbsaveActionPerformed
        // TODO add your handling code here:
        // cek semaua field harus terisi
        if (kodeBarang.getText().isEmpty() || namaBarang.getText().isEmpty() || modelBarang.getText().isEmpty() 
                || jenisBarang.getSelectedIndex() == -1 || kadarBarang.getSelectedIndex() == -1 
                || beratBarang.getText().isEmpty())  {
            JOptionPane.showMessageDialog(null, "Harap lengkapi semua field", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
           String sql = "INSERT INTO data VALUES (?,?,?,?,?,?)";
           PreparedStatement stmt = conn.prepareStatement(sql);
           stmt.setString(1,kodeBarang.getText());
           stmt.setString(2,namaBarang.getText());
           stmt.setString(3, modelBarang.getText());
           stmt.setString(4,jenisBarang.getSelectedItem().toString());
           stmt.setString(5,kadarBarang.getSelectedItem().toString());
           stmt.setString(6,beratBarang.getText());
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Data berhasil Disimpan");
           showData();
           kosongkanFrom();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this, 
                        ex.getMessage(),"Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbsaveActionPerformed

    private void kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeBarangActionPerformed

    private void Table1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseEntered
        // TODO add your handling code here:
       
        Table1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int baris = Table1.rowAtPoint(e.getPoint());

            if (baris >= 0) {
                String kode = Table1.getValueAt(baris, 1).toString();
                String nama = Table1.getValueAt(baris, 2).toString();
                String model = Table1.getValueAt(baris, 3).toString();
                String jenis = Table1.getValueAt(baris, 4).toString();
                String kadar = Table1.getValueAt(baris, 5).toString();
                String berat = Table1.getValueAt(baris, 6).toString();

                kodeBarang.setText(kode);
                namaBarang.setText(nama);
                modelBarang.setText(model);
                jenisBarang.setSelectedItem(jenis);
                kadarBarang.setSelectedItem(kadar);
                beratBarang.setText(berat);
            }
        }
            });
  

    }//GEN-LAST:event_Table1MouseEntered

    private void tbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbeditActionPerformed
        // TODO add your handling code here:
          // validasi input semua field
          if (kodeBarang.getText().isEmpty() || namaBarang.getText().isEmpty() || modelBarang.getText().isEmpty() 
                  || jenisBarang.getSelectedIndex() == -1 || kadarBarang.getSelectedIndex() == -1 
                  || beratBarang.getText().isEmpty())  {
            JOptionPane.showMessageDialog(null, "Harap lengkapi semua field", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
          }
        try{
            String sql = "UPDATE data SET nama_barang = ? , model_barang=?, jenis_barang = ?, kadar_barang = ?,"
                   + "berat_barang = ? WHERE kode_barang = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,namaBarang.getText());
            stmt.setString(2,modelBarang.getText());
            stmt.setString(3,jenisBarang.getSelectedItem().toString());
            stmt.setString(4,kadarBarang.getSelectedItem().toString());
            stmt.setString(5,beratBarang.getText());
            stmt.setString(6,kodeBarang.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil Diupdate");
            showData();
            kosongkanFrom();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbeditActionPerformed

    private void tbdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdeleteActionPerformed
        // TODO add your handling code here:
        // tampilkan dialog konfirmasi
        int jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (jawab != JOptionPane.YES_OPTION) {
            return;
        }
        try {
            // buat statement untuk menghapus data
            String sql = "DELETE FROM data WHERE kode_barang = '"+kodeBarang.getText()+"'";
            PreparedStatement stmt = conn.prepareStatement(sql);
            // eksekusi statement
            int jumlahBarisTerhapus = stmt.executeUpdate();

            // periksa jumlah baris yang terpengaruh
            if (jumlahBarisTerhapus == 1) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                // refresh tampilan data di tabel
                showData();
            } else {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_tbdeleteActionPerformed

    private void searchKeyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyKeyReleased
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_searchKeyKeyReleased

    private void tbclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbclearActionPerformed
        // TODO add your handling code here:
        kodeBarang.setText("");
        namaBarang.setText("");
        modelBarang.setText("");
        beratBarang.setText("");
        
    }//GEN-LAST:event_tbclearActionPerformed

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
            java.util.logging.Logger.getLogger(fromBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new fromBarang().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JTextField beratBarang;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jenisBarang;
    private javax.swing.JComboBox<String> kadarBarang;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField modelBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField searchKey;
    private javax.swing.JButton tbclear;
    private javax.swing.JButton tbdelete;
    private javax.swing.JButton tbedit;
    private javax.swing.JButton tbexit;
    private javax.swing.JButton tbsave;
    // End of variables declaration//GEN-END:variables
}