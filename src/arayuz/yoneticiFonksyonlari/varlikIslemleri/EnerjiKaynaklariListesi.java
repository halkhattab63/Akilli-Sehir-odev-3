package arayuz.yoneticiFonksyonlari.varlikIslemleri;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import varliklar.Enerjikaynagi;
import varliklar.Varlik;
import varliklar.enerjiKaynaklari.Fosil;
import varliklar.enerjiKaynaklari.Gunes;
import varliklar.enerjiKaynaklari.Nukleer;
import varliklar.enerjiKaynaklari.Ruzgar;

public class EnerjiKaynaklariListesi extends javax.swing.JFrame {

    DefaultTableModel kaynakListesiModel = new DefaultTableModel();
    ArrayList<Enerjikaynagi> enerjikaynaklari = Varlik.getEnerjiKaynaklar();
    private JTable kaynakList; // تعريف الجدول هنا

    public EnerjiKaynaklariListesi() {
        initComponents();
        
        kaynakListesiModel = (DefaultTableModel) kaynakList.getModel();

        for (Enerjikaynagi kaynak : enerjikaynaklari) {
            kaynakListesiModel.addRow(new Object[]{kaynak.getIsim(),kaynak.getKonum(),kaynak.getKapasite(),kaynak.getUretim(),kaynak.getTip()});
        }
    }

    private void initComponents() {
        // Create layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding

        // Initialize Components
        JLabel lblIsim = new JLabel("Isim:");
        JTextField tfIsim = new JTextField(20);
        JLabel lblKonum = new JLabel("Konum:");
        JComboBox<String> cbKonum = new JComboBox<>(new String[] {"1", "2", "3", "4"});
        JLabel lblKapasite = new JLabel("Kapasite:");
        JTextField tfKapasite = new JTextField(20);
        JLabel lblUretim = new JLabel("Üretim:");
        JTextField tfUretim = new JTextField(20);
        JButton btnGuncelle = new JButton("Güncelle");
        JButton btnSil = new JButton("Sil");
        JButton btnGeri = new JButton("Geri");

        // Table setup
        kaynakList = new JTable();
        JScrollPane tableScroll = new JScrollPane(kaynakList);

        // Table Model
        kaynakList.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {"Isim", "Konum", "Kapasite", "Üretim", "Tip"}
        ));

        // Add Components to layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblIsim, gbc);

        gbc.gridx = 1;
        add(tfIsim, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblKonum, gbc);

        gbc.gridx = 1;
        add(cbKonum, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblKapasite, gbc);

        gbc.gridx = 1;
        add(tfKapasite, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lblUretim, gbc);

        gbc.gridx = 1;
        add(tfUretim, gbc);

        // Buttons Layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnGuncelle);
        buttonPanel.add(btnSil);
        buttonPanel.add(btnGeri);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(buttonPanel, gbc);

        // Table Layout
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(tableScroll, gbc);

        // Event Handlers
        btnGuncelle.addActionListener(evt -> updateEnerjiKaynagi(tfIsim, tfKapasite, tfUretim, cbKonum, kaynakList));
        btnSil.addActionListener(evt -> deleteEnerjiKaynagi(kaynakList));
        btnGeri.addActionListener(evt -> goBack());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    private void updateEnerjiKaynagi(JTextField tfIsim, JTextField tfKapasite, JTextField tfUretim, JComboBox<String> cbKonum, JTable kaynakList) {
        int selectedRow = kaynakList.getSelectedRow();
        if (selectedRow != -1) {
            try {
                String isim = tfIsim.getText();
                int konum = Integer.parseInt(cbKonum.getSelectedItem().toString());
                int kapasite = Integer.parseInt(tfKapasite.getText());
                float ure = Float.parseFloat(tfUretim.getText());

                if (isim.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Kaynak ismi boş olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (kapasite <= 0 || ure < 0) {
                    JOptionPane.showMessageDialog(this, "Kapasite veya üretim değeri geçersiz!", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Enerjikaynagi kaynak = null;
                String kaynakTip = (String) kaynakList.getValueAt(selectedRow, 4);
                switch (kaynakTip) {
                    case "Güneş":
                        kaynak = new Gunes(isim, konum, kapasite, ure);
                        break;
                    case "Rüzgar":
                        kaynak = new Ruzgar(isim, konum, kapasite, ure);
                        break;
                    case "Fosil":
                        kaynak = new Fosil(isim, konum, kapasite, ure);
                        break;
                    case "Nükleer":
                        kaynak = new Nukleer(isim, konum, kapasite, ure);
                        break;
                }

                enerjikaynaklari.set(selectedRow, kaynak);
                updateTable();
                JOptionPane.showMessageDialog(this, "Kaynak başarıyla güncellendi", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Lütfen geçerli bir sayı girin!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteEnerjiKaynagi(JTable kaynakList) {
        int selectedRow = kaynakList.getSelectedRow();
        if (selectedRow != -1) {
            enerjikaynaklari.remove(selectedRow);
            updateTable();
            JOptionPane.showMessageDialog(this, "Kaynak başarıyla silindi", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir satır seçin!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) kaynakList.getModel();
        model.setRowCount(0); // Clear the table
        for (Enerjikaynagi kaynak : enerjikaynaklari) {
            model.addRow(new Object[]{
                    kaynak.getIsim(),
                    kaynak.getKonum(),
                    kaynak.getKapasite(),
                    kaynak.getUretim(),
                    kaynak.getTip()
            });
        }
    }

    private void goBack() {
        this.setVisible(false);
        new EnerjiKaynagiEkleme().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new EnerjiKaynaklariListesi().setVisible(true));
    }
}
