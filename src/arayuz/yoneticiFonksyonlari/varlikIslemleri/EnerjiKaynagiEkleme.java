package arayuz.yoneticiFonksyonlari.varlikIslemleri;

import arayuz.yoneticiFonksyonlari.VarlikEkGu;
import kisiler.Yonetici;
import javax.swing.*;
import java.awt.*;

public class EnerjiKaynagiEkleme extends javax.swing.JFrame {

    public EnerjiKaynagiEkleme() {
        initComponents();
    }

    public String geteIsim() {
        return eIsim.getText();
    }

    public int geteKonum() {
        return Integer.parseInt(eKonum.getSelectedItem().toString());
    }

    public int geteKapasite() {
        return Integer.parseInt(eKapasite.getText());
    }

    public float getUretim() {
        return Float.parseFloat(uretim.getText());
    }

    public int getKaynakTuru() {
        return kaynakTuru.getSelectedIndex();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        kaynaklarListesi = new javax.swing.JButton();
        eEkle = new javax.swing.JButton();
        kaynakTuru = new javax.swing.JComboBox<>();
        eIsim = new javax.swing.JTextField();
        eKapasite = new javax.swing.JTextField();
        uretim = new javax.swing.JTextField();
        eKonum = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enerji Kaynağı Ekleme");
        setLocationRelativeTo(null); // Center the window

        // Customize "Back" Button
        jButton5.setText("Geri");
        jButton5.setBackground(new java.awt.Color(72, 133, 237)); // Blue color
        jButton5.setForeground(java.awt.Color.white);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        // Customize "Kaynaklar Listesi" Button
        kaynaklarListesi.setText("Kaynaklar Listesi");
        kaynaklarListesi.setBackground(new java.awt.Color(34, 167, 240)); // Light blue
        kaynaklarListesi.setForeground(java.awt.Color.white);
        kaynaklarListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaynaklarListesiActionPerformed(evt);
            }
        });

        // Customize "Ekle" Button
        eEkle.setText("Ekle");
        eEkle.setBackground(new java.awt.Color(34, 167, 240)); // Light blue
        eEkle.setForeground(java.awt.Color.white);
        eEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eEkleActionPerformed(evt);
            }
        });

        kaynakTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Güneş", "Rüzgar", "Fosil", "Nükleer" }));
        kaynakTuru.setBackground(new java.awt.Color(242, 242, 242)); // Light gray

        eIsim.setBackground(new java.awt.Color(242, 242, 242)); // Light gray
        eKapasite.setBackground(new java.awt.Color(242, 242, 242)); // Light gray
        uretim.setBackground(new java.awt.Color(242, 242, 242)); // Light gray
        eKonum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel1.setText("Kaynak Türü :");
        jLabel2.setText("İsim :");
        jLabel3.setText("Konum :");
        jLabel4.setText("Kapasite :");
        jLabel5.setText("Üretim :");

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(kaynaklarListesi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(eEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eKapasite)
                            .addComponent(uretim, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eIsim)
                            .addComponent(kaynakTuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eKonum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kaynaklarListesi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kaynakTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eIsim)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eKonum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eKapasite)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uretim)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // Return to the previous window
        VarlikEkGu varlikekle = new VarlikEkGu();
        varlikekle.setVisible(true);
        setVisible(false);
    }

    private void kaynaklarListesiActionPerformed(java.awt.event.ActionEvent evt) {
        // Go to the energy sources list
        EnerjiKaynaklariListesi kaynakListesi = new EnerjiKaynaklariListesi();
        kaynakListesi.setVisible(true);
        setVisible(false);
    }

    private void eEkleActionPerformed(java.awt.event.ActionEvent evt) {
        // Add energy source
        Yonetici y = new Yonetici();
        y.new EkleGuncelle().kaynakEkle(this);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EnerjiKaynagiEkleme().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton eEkle;
    private javax.swing.JTextField eIsim;
    private javax.swing.JTextField eKapasite;
    private javax.swing.JComboBox<String> eKonum;
    private javax.swing.JTextField uretim;
    private javax.swing.JComboBox<String> kaynakTuru;
    private javax.swing.JButton kaynaklarListesi;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
}
