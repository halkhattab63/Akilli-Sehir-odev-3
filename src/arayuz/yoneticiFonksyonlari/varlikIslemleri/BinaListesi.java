package arayuz.yoneticiFonksyonlari.varlikIslemleri;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import varliklar.Bina;
import varliklar.Varlik;
import varliklar.binalar.Akilli;
import varliklar.binalar.Geleneksel;

public class BinaListesi extends javax.swing.JFrame {

    DefaultTableModel binaListesiModel = new DefaultTableModel();
    ArrayList<Bina> binalar = Varlik.getBinalar();

    // تعريف المتغيرات
    private javax.swing.JTable binaList;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField enerjiTuketim;
    private javax.swing.JButton bGun;
    private javax.swing.JTextField bIsim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField suTuketim;
    private javax.swing.JTextField bKat;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton bSil;
    private javax.swing.JComboBox<String> bKonum;
    private javax.swing.JButton tasMod;

    /**
     * Creates new form BinaListe
     */
    public BinaListesi() {
        initComponents();
        tasMod.setVisible(false);

        binaListesiModel = (DefaultTableModel) binaList.getModel();

        // Add rows to the table model
        for (Bina bina : binalar) {
            binaListesiModel.addRow(new Object[]{bina.getIsim(), bina.getKonum(), bina.getKatSayisi(), bina.getEnerjiTuketimi(), bina.getSuTuketimi(), bina.getTip()});
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        binaList = new javax.swing.JTable();
        enerjiTuketim = new javax.swing.JTextField();
        bGun = new javax.swing.JButton();
        bIsim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        suTuketim = new javax.swing.JTextField();
        bKat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bSil = new javax.swing.JButton();
        bKonum = new javax.swing.JComboBox<>();
        tasMod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton6.setText("Geri");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        binaList.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Isim", "Konum", "Kat sayısı", "Enerji tüketim", "Su tüketimi", "Tip"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        binaList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                binaListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(binaList);

        bGun.setText("Güncelle");
        bGun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGunActionPerformed(evt);
            }
        });

        bIsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIsimActionPerformed(evt);
            }
        });

        jLabel2.setText("Isim                 :");

        jLabel3.setText("Konum            :");

        jLabel4.setText("Kat sayısı         :");

        jLabel6.setText("Su tüketim       :");

        jLabel5.setText("Enerji tüketim  :");

        bSil.setText("Sil");
        bSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSilActionPerformed(evt);
            }
        });

        bKonum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4"}));

        tasMod.setText("Tasarruf modu çalıştır");
        tasMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(12, 12, 12)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(bIsim)
                                                                .addComponent(bKonum, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(bGun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(bKat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(enerjiTuketim, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(suTuketim, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(12, 12, 12)
                                                                        .addComponent(bSil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))).addComponent(tasMod, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(bIsim)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bKonum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(bKat)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(enerjiTuketim)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(suTuketim)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(bGun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bSil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tasMod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        BinaEkleme binaEkleme = new BinaEkleme();
        binaEkleme.setVisible(true);
        setVisible(false);
    }

    private void bGunActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = binaList.getSelectedRow();
        if (selectedRow != -1) {
            try {
                Bina bina = null;
                String isim = bIsim.getText();
                int konum = Integer.parseInt(bKonum.getSelectedItem().toString());
                int kat = Integer.parseInt(bKat.getText());
                float et = Float.parseFloat(enerjiTuketim.getText());
                float st = Float.parseFloat(suTuketim.getText());

                if (isim == null || isim.trim().isEmpty())
                    throw new IllegalArgumentException("Bina ismi boş olamaz!");

                if (kat <= 0)
                    throw new IllegalArgumentException("Kapasite 0 veya negatif olamaz!");

                if (et < 0)
                    throw new IllegalArgumentException("Enerji tüketimi negatif olamaz!");

                if (st < 0)
                    throw new IllegalArgumentException("Su tüketimi negatif olamaz!");

                switch ((String) binaList.getValueAt(selectedRow, 5)) {
                    case "Geleneksel" -> bina = new Geleneksel(isim, konum, kat, et, st);
                    case "Akıllı" -> bina = new Akilli(isim, konum, kat, et, st);
                    default -> throw new IllegalArgumentException("Bina türü geçersiz!");
                }

                binalar.remove(binalar.size() - 1);
                binalar.set(selectedRow, bina);

                binaListesiModel.setRowCount(0);
                for (Bina b : binalar) {
                    binaListesiModel.addRow(new Object[]{
                            b.getIsim(), b.getKonum(), b.getKatSayisi(), b.getEnerjiTuketimi(), b.getSuTuketimi(), b.getTip()
                    });
                }

                JOptionPane.showMessageDialog(this, "Bina başarıyla güncellendi", "Başarılı Işlem", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Lütfen geçerli bir sayı girin!", "Hata", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Bilinmeyen bir hata oluştu: ", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bIsimActionPerformed(java.awt.event.ActionEvent evt) {
        // Empty method for handling bIsim action
    }

    private void binaListMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = binaList.getSelectedRow();
        if (selectedRow != -1) {
            bIsim.setText(binaListesiModel.getValueAt(selectedRow, 0).toString());
            bKonum.setSelectedItem(binaListesiModel.getValueAt(selectedRow, 1).toString());
            bKat.setText(binaListesiModel.getValueAt(selectedRow, 2).toString());
            suTuketim.setText(binaListesiModel.getValueAt(selectedRow, 3).toString());
            enerjiTuketim.setText(binaListesiModel.getValueAt(selectedRow, 4).toString());

            if (binalar.get(selectedRow) instanceof Akilli)
                tasMod.setVisible(true);
            else
                tasMod.setVisible(false);
        }
    }

    private void bSilActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = binaList.getSelectedRow();
        if (selectedRow != -1) {
            binalar.remove(selectedRow);
            binaListesiModel.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, "Bina başarıyla silinmiştir!", "Başarılı Işlem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void tasModActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = binaList.getSelectedRow();
        Akilli bina = (Akilli) binalar.get(selectedRow);
        if (bina.getEnerjiTasarrufu() == 0) {
            tasMod.setText("Tasarruf modu çalıştır");
            bina.enerjiTasarrufuAc();
            tasMod.setText("Tasarruf modu kapat");
            JOptionPane.showMessageDialog(null, "Tasarruf modu çalıştırıldı!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } else {
            tasMod.setText("Tasarruf modu kapat");
            bina.enerjiTasarrufuKapat();
            tasMod.setText("Tasarruf modu çalıştır");
            JOptionPane.showMessageDialog(null, "Tasarruf modu kapatıldı!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaListesi().setVisible(true);
            }
        });
    }
}
