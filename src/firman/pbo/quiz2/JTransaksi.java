/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firman.pbo.quiz2;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS 10.1
 */
public class JTransaksi extends javax.swing.JFrame {
    private  int id;
    private String kode;
    private  DefaultTableModel tblModel;
    private  DefaultComboBoxModel cbxModel;
    private  ArrayList<Item> keranjang = new ArrayList<>();
    /**
     * Creates new form JTransaksi
     */
    public JTransaksi() {
        TransaksiComboBox cbxModel= new TransaksiComboBox();
        this.cbxModel=new DefaultComboBoxModel(cbxModel.getNama().toArray());
        TransaksiTableModel tblModel = new TransaksiTableModel(); 
        this.tblModel = new DefaultTableModel(tblModel.getNamaKolom(), 0);
        initComponents();
    }
  private String setKode() {
        this.incrementId();  
        String date = new SimpleDateFormat("yyMMdd").format(new Date());
        this.kode = String.format(date+"%02d", this.id);  // then merge it with id with 0 pad
        return kode;
    }
   private void incrementId() {
        this.id +=1;
    }
    private void decerementId() {
        this.id -=1;
    }
     private Object[] tambahItem(String nama, int satuan) {
        float harga = 0;
        TransaksiComboBox items = new TransaksiComboBox();
        for(int i = 0; i < items.getNama().size(); i++) {
            if(nama.equalsIgnoreCase(items.getNama().get(i))) {
                harga = items.getHarga().get(i);
            }
        } 
        Object[] object = {
          nama,
          harga,
          satuan
        };
        return object;
    }
     private void updateSatuan(String nama, int tambah) {
        ArrayList<String> item = new ArrayList<>();
        for (int i = 0; i < tblModel.getRowCount(); i++){
            item.add(tblModel.getValueAt(i, 0).toString());
        }
        for(int i = 0; i < item.size(); i++) {
            if(item.get(i).equals(nama)) {
                int satuan = new Integer(tblModel.getValueAt(i, 2).toString());
                tblModel.setValueAt(satuan+tambah, i, 2);  
            } 
        }
    } 
    private boolean isDuplikat(String nama) {
        boolean hasil = false;
        ArrayList<String> item = new ArrayList<>();
        for (int i = 0; i < tblModel.getRowCount(); i++){
            item.add(tblModel.getValueAt(i, 0).toString());
        }
        for(String i : item) {
            if(i.equals(nama)) {
                hasil = true;
            } 
        }
        return hasil;
    } 
    private boolean isEmpty() {
        return this.jTableTransaksi.getModel().getRowCount()<=0;
    }
     private void cekKeranjang() {
        if(isEmpty()) {
            this.jButtonSave.setEnabled(false);
            this.jButtonRemove.setEnabled(false);
        } else {
            this.jButtonSave.setEnabled(true);
            this.jButtonRemove.setEnabled(true);
        }
    }
    private void newTransaksi() {
        this.jTextFieldSatuan.setText("");
        this.jTextFieldCode.setText("");
        this.jButtonNew.setEnabled(true);
        this.jButtonSave.setEnabled(false);
        this.jButtonCancel.setEnabled(false);
        this.jButtonAdd.setEnabled(false);
        this.jButtonRemove.setEnabled(false);
        this.jTextFieldSatuan.setEnabled(false);
        this.jComboBoxItem.setEnabled(false);
        this.tblModel.setRowCount(0);
        this.keranjang.clear();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxItem = new javax.swing.JComboBox<>();
        jTextFieldCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTransaksi = new javax.swing.JTable();
        jButtonNew = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jTextFieldSatuan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Code");

        jLabel3.setText("Items");

        jComboBoxItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kopi", "Rokok", "Susu", "Tepung", " " }));
        jComboBoxItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxItemActionPerformed(evt);
            }
        });

        jTextFieldCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodeActionPerformed(evt);
            }
        });

        jTableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTransaksi);

        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonSave.setText("Save");

        jButtonCancel.setText("Cancel");

        jTextFieldSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSatuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxItem, 0, 225, Short.MAX_VALUE)
                            .addComponent(jTextFieldCode))
                        .addGap(50, 50, 50)
                        .addComponent(jTextFieldSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRemove)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSave)
                .addGap(67, 67, 67)
                .addComponent(jButtonCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonNew)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonAdd)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodeActionPerformed

    private void jComboBoxItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxItemActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
         this.jTextFieldSatuan.setText("1");
        this.jButtonNew.setEnabled(false);
        this.jButtonCancel.setEnabled(true);
        this.jButtonAdd.setEnabled(true);
        this.jTextFieldSatuan.setEnabled(true);
        this.jComboBoxItem.setEnabled(true);
        this.jTextFieldCode.setText(this.setKode());
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
      
    
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
      String nama= this.cbxModel.getSelectedItem().toString();
      int satuan= new Integer(this.jTextFieldSatuan.getText());
      if(isDuplikat(nama)){
          updateSatuan(nama, satuan);
      }else{
          tblModel.addRow(tambahItem(nama, satuan));
      }
      this.cekKeranjang();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextFieldSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSatuanActionPerformed

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
            java.util.logging.Logger.getLogger(JTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTransaksi;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldSatuan;
    // End of variables declaration//GEN-END:variables

   
}
