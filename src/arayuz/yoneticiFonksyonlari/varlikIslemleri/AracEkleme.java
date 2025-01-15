package arayuz.yoneticiFonksyonlari.varlikIslemleri;

import arayuz.yoneticiFonksyonlari.VarlikEkGu;
import kisiler.Yonetici;
import yonetim.TrafikYonetimi;

public class AracEkleme extends javax.swing.JFrame {

    public AracEkleme() {
        initComponents();
    }

    public String getaIsim() {
        return aIsim.getText();
    }

    public int getaKonum() {
        return Integer.parseInt(aKonum.getSelectedItem().toString());
    }

    public int getaKapasite() {
        return Integer.parseInt(aKapasite.getText());
    }

    public float getaTuketim() {
        return Float.parseFloat(aTuketim.getText());
    }

    public int getAracTuru() {
        return aracTuru.getSelectedIndex();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        araclistesi = new javax.swing.JButton();
        aracTuru = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        aIsim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aKapasite = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aTuketim = new javax.swing.JTextField();
        aEkle = new javax.swing.JButton();
        aKonum = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Araç Ekleme");
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

        araclistesi.setText("Araçlar listesi");
        araclistesi.setBackground(new java.awt.Color(34, 167, 240)); // Light blue
        araclistesi.setForeground(java.awt.Color.white);
        araclistesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araclistesiActionPerformed(evt);
            }
        });

        aracTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otobüs", "Otomobil", "Motosiklet", "Elektrikli araç" }));
        aracTuru.setBackground(new java.awt.Color(242, 242, 242)); // Light gray
        aracTuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracTuruActionPerformed(evt);
            }
        });

        jLabel1.setText("Araç türü :");

        aIsim.setBackground(new java.awt.Color(242, 242, 242)); // Light gray
        jLabel2.setText("Isim :");

        jLabel3.setText("Konum :");

        jLabel4.setText("Kapasite :");

        aKapasite.setBackground(new java.awt.Color(242, 242, 242)); // Light gray
        jLabel5.setText("Tüketim :");

        aTuketim.setBackground(new java.awt.Color(242, 242, 242)); // Light gray

        // Customize "Ekle" Button
        aEkle.setText("Ekle");
        aEkle.setBackground(new java.awt.Color(34, 167, 240)); // Light blue
        aEkle.setForeground(java.awt.Color.white);
        aEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aEkleActionPerformed(evt);
            }
        });

        aKonum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        // Layout setup
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(araclistesi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(aEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aKapasite)
                            .addComponent(aTuketim, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aIsim)
                            .addComponent(aracTuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aKonum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(araclistesi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aracTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aIsim)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aKonum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aKapasite)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aTuketim)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        VarlikEkGu varlikekle = new VarlikEkGu();
        varlikekle.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void araclistesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araclistesiActionPerformed
        
        AracListesi aracListesi = new AracListesi();
        aracListesi.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_araclistesiActionPerformed

    private void aEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aEkleActionPerformed
        // Aracı ekle
        Yonetici y = new Yonetici();
        y.new EkleGuncelle().aracEkle(this);
        
        // Bölgedeki araç sayısını güncelle
        int konum = Integer.parseInt((String) aKonum.getSelectedItem());    
        TrafikYonetimi.bolgeler.put(konum, TrafikYonetimi.bolgeler.get(konum) + 1);
    }//GEN-LAST:event_aEkleActionPerformed

    private void aracTuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracTuruActionPerformed
       
    }//GEN-LAST:event_aracTuruActionPerformed

    private void aIsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aIsimActionPerformed
       
    }//GEN-LAST:event_aIsimActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AracEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton aEkle;
    private javax.swing.JTextField aIsim;
    private javax.swing.JTextField aKapasite;
    private javax.swing.JComboBox<String> aKonum;
    private javax.swing.JTextField aTuketim;
    private javax.swing.JComboBox<String> aracTuru;
    private javax.swing.JButton araclistesi;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration
}
