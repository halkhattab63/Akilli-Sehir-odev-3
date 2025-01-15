package arayuz.yoneticiFonksyonlari;

import arayuz.yoneticiFonksyonlari.varlikIslemleri.AracEkleme;
import arayuz.yoneticiFonksyonlari.varlikIslemleri.EnerjiKaynagiEkleme;
import arayuz.yoneticiFonksyonlari.varlikIslemleri.BinaEkleme;
import arayuz.ArayuzYonetici;
import javax.swing.JOptionPane;
import java.awt.Color;

public class VarlikEkGu extends javax.swing.JFrame {

    /**
     * Creates new form VarlikEkGu
     */
    public VarlikEkGu() {
        initComponents();
    }

    private void customizeButton(javax.swing.JButton button) {
        button.setBackground(new Color(75, 175, 80));  // Green button color
        button.setForeground(Color.WHITE);
        button.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        button.setFocusPainted(false);
        button.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        binabtn = new javax.swing.JButton();
        arababtn = new javax.swing.JButton();
        enerjıbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Varlık Ekleme");
        setSize(500, 400);

        // Customize the back button
        jButton5.setText("Geri");
        jButton5.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
        jButton5.setBackground(new Color(255, 87, 34)); // Orange color
        jButton5.setForeground(Color.WHITE);
        jButton5.setFocusPainted(false);
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        // Customize buttons
        binabtn.setText("Bina");
        binabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binabtnActionPerformed(evt);
            }
        });

        arababtn.setText("Araç");
        arababtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arababtnActionPerformed(evt);
            }
        });

        enerjıbtn.setText("Enerji Kaynağı");
        enerjıbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enerjıbtnActionPerformed(evt);
            }
        });

        // Customize all buttons
        customizeButton(binabtn);
        customizeButton(arababtn);
        customizeButton(enerjıbtn);

        // Set Layout for the frame
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(binabtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(arababtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(enerjıbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(binabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(arababtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(enerjıbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Go back to the main screen
        ArayuzYonetici yonetici = new ArayuzYonetici();
        yonetici.setVisible(true);
        this.dispose(); // Close current window
    }//GEN-LAST:event_jButton5ActionPerformed

    private void binabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binabtnActionPerformed
        // Open BinaEkleme screen
        BinaEkleme binaEkleme = new BinaEkleme();
        binaEkleme.setVisible(true);
        this.dispose(); // Close current window
        
        JOptionPane.showMessageDialog(this, "Bina ekleme işlemi başarılı", "Başarı", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_binabtnActionPerformed

    private void arababtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arababtnActionPerformed
        // Open AracEkleme screen
        AracEkleme aracEkleme = new AracEkleme();
        aracEkleme.setVisible(true);
        this.dispose(); // Close current window
        
        JOptionPane.showMessageDialog(this, "Araç ekleme işlemi başarılı", "Başarı", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_arababtnActionPerformed

    private void enerjıbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enerjıbtnActionPerformed
        // Open EnerjiKaynagiEkleme screen
        EnerjiKaynagiEkleme enerjiKaynagiEkleme = new EnerjiKaynagiEkleme();
        enerjiKaynagiEkleme.setVisible(true);
        this.dispose(); // Close current window
        
        JOptionPane.showMessageDialog(this, "Enerji kaynağı ekleme işlemi başarılı", "Başarı", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_enerjıbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VarlikEkGu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VarlikEkGu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arababtn;
    private javax.swing.JButton binabtn;
    private javax.swing.JButton enerjıbtn;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
