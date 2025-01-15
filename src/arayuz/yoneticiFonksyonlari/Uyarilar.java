package arayuz.yoneticiFonksyonlari;

import arayuz.ArayuzYonetici;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import kisiler.Yonetici;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import yonetim.EnerjiYonetimi;
import yonetim.SuYonetimi;
import yonetim.TrafikYonetimi;

public class Uyarilar extends javax.swing.JFrame {
    private DefaultTableModel uyariTableModel;
    
    public Uyarilar() {
        initComponents();
        uyariTableModel = (DefaultTableModel) uyariTable.getModel();

        // Add rows to the table model
        ArrayList<ArrayList<String>> uyarilar = Yonetici.getUyarilar();
        for (ArrayList row : uyarilar){
            uyariTableModel.addRow(row.toArray());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        platte = new javax.swing.JScrollPane();
        uyariTable = new javax.swing.JTable();
        coz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uyarılar Yönetimi");
        setLocationRelativeTo(null); // Center the window

        // Customize Button
        jButton5.setText("Geri");
        jButton5.setBackground(new java.awt.Color(72, 133, 237)); // Blue color
        jButton5.setForeground(java.awt.Color.white);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        uyariTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Uyari Turu", "İçerik"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        platte.setViewportView(uyariTable);

        coz.setText("Problemi Çöz");
        coz.setBackground(new java.awt.Color(34, 167, 240)); // Light blue
        coz.setForeground(java.awt.Color.white);
        coz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cozActionPerformed(evt);
            }
        });

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(platte, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(coz, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(platte, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(coz, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cozActionPerformed
        try {
            int selectedRow = uyariTable.getSelectedRow();
            if (selectedRow != -1) {
                ArrayList row = new ArrayList();
                row.add(uyariTableModel.getValueAt(selectedRow, 0));
                row.add(uyariTableModel.getValueAt(selectedRow, 1));
                uyariTableModel.removeRow(selectedRow);
                Yonetici.uyariSil(row);
                JOptionPane.showMessageDialog(null, "Sorun başarıyla çözüldü", "Başarı", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen bir satır seçin!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bilinmeyen bir hata oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cozActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ArayuzYonetici yonetici = new ArayuzYonetici();
        yonetici.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uyarilar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coz;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane platte;
    private javax.swing.JTable uyariTable;
    // End of variables declaration//GEN-END:variables
}
