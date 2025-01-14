package kisiler;

import arayuz.yoneticiFonksyonlari.varlikIslemleri.AracEkleme;
import arayuz.yoneticiFonksyonlari.varlikIslemleri.EnerjiKaynagiEkleme;
import arayuz.yoneticiFonksyonlari.varlikIslemleri.BinaEkleme;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import varliklar.araclar.*;
import varliklar.binalar.*;
import varliklar.enerjiKaynaklari.*;


public class Yonetici {
    private static ArrayList<ArrayList<String>> uyarilar = new ArrayList<>();
    private static String ad = "hayan";
    private static int sifre = 200;

    public static ArrayList<ArrayList<String>> getUyarilar() {
        return uyarilar;
    }
    
    public static void uyariEkle(String kaynak, String icerik) {
        uyarilar.add(new ArrayList<>());
        uyarilar.get(uyarilar.size() - 1).add(kaynak);
        uyarilar.get(uyarilar.size() - 1).add(icerik);
    }
    
    public static void uyariSil(ArrayList uyari) {
        uyarilar.remove(uyari);
    }

    public static String getAd() {
        return ad;
    }

    public static void setAd(String ad) {
        Yonetici.ad = ad;
    }

    public static int getSifre() {
        return sifre;
    }

    public static void setSifre(int sifre) {
        Yonetici.sifre = sifre;
    }
    
    //Inner class
    public class EkleGuncelle {

        public static void aracEkle(AracEkleme aracEkleme){
            try {    
                String isim = aracEkleme.getaIsim();
                int konum = aracEkleme.getaKonum();
                int kapasite = aracEkleme.getaKapasite();
                float tuketim = aracEkleme.getaTuketim();
                int aracTutu = aracEkleme.getAracTuru();// 0 -> otobus , 1 -> otomobil, 2 -> motosiklet, 3 -> elktrikli arac
            
                if (isim == null || isim.trim().isEmpty())
                    throw new IllegalArgumentException("Araç ismi boş olamaz!"); // Bina ismi eksik veya yanlış girilmiş

                if (kapasite <= 0) 
                    throw new IllegalArgumentException("Kapasite 0 veya negatif olamaz!"); // Kapasite hatalı

                if (tuketim < 0) 
                    throw new IllegalArgumentException("Araç tüketimi negatif olamaz!"); // Tüketim değerleri doğru değil
                
                switch (aracTutu) {
                    case 0 -> {
                        new Otobus(isim, konum, kapasite, tuketim);
                        JOptionPane.showMessageDialog(null, "Otobüs başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 1 -> {
                        new Otomobil(isim, konum, kapasite, tuketim);
                        JOptionPane.showMessageDialog(null, "Otomobil başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 2 -> {
                        new Motosiklet(isim, konum, kapasite, tuketim);
                        JOptionPane.showMessageDialog(null, "Motosiklet başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 3 -> {
                        new ElektrikliArac(isim, konum, kapasite, tuketim);
                        JOptionPane.showMessageDialog(null, "Elektrikli Arac başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    default -> throw new AssertionError();
                }
            } catch (NumberFormatException e) {
                // format hatası
                JOptionPane.showMessageDialog(null, "Kapasite ve tüketim sadece sayı olabilir", "Hata", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Şifre sade int olabilir
                JOptionPane.showMessageDialog(null, e.getMessage(), "Giriş Hatası", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                // Diğer beklenmeyen hatalar
                JOptionPane.showMessageDialog(null, "Bilinmeyen bir hata oluştu: " , "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public static void kaynakEkle(EnerjiKaynagiEkleme enerjiKaynagiEkleme){
            try {
                String isim = enerjiKaynagiEkleme.geteIsim();
                int konum = enerjiKaynagiEkleme.geteKonum();
                int kapasite = enerjiKaynagiEkleme.geteKapasite();
                float uretim = enerjiKaynagiEkleme.getUretim();
                int kaynakTuru = enerjiKaynagiEkleme.getKaynakTuru(); // 0 -> Gunes, 1 -> Ruzgar, 2 -> Fosil, 3 -> Nukleer

                // Veri girişlerinde boş ya da hatalı veri kontrolü
                if (isim == null || isim.trim().isEmpty())
                    throw new IllegalArgumentException("Kaynak ismi boş olamaz!"); // Bina ismi eksik veya yanlış girilmiş

                if (kapasite <= 0) 
                    throw new IllegalArgumentException("Kapasite 0 veya negatif olamaz!"); // Kapasite hatalı

                if (uretim < 0) 
                    throw new IllegalArgumentException("Enerji üretimi negatif olamaz!"); // Tüketim değerleri doğru değil

                // Enerji kaynağı türüne göre işlem yapılır
                switch (kaynakTuru) {
                    case 0 -> {
                        new Gunes(isim, konum, kapasite, uretim);
                        JOptionPane.showMessageDialog(null, "Güneş Enerji kaynağı başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 1 -> {
                        new Ruzgar(isim, konum, kapasite, uretim);
                        JOptionPane.showMessageDialog(null, "Rüzgar Enerji kaynağı başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 2 -> {
                        new Fosil(isim, konum, kapasite, uretim);
                        JOptionPane.showMessageDialog(null, "Fosil Enerji kaynağı başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 3 -> {
                        new Nukleer(isim, konum, kapasite, uretim);
                        JOptionPane.showMessageDialog(null, "Nükleer Enerji kaynağı başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    default -> // Bu satıra gelinmemelidir çünkü IllegalArgumentException zaten kontrol eder
                        throw new AssertionError("Geçersiz enerji kaynağı türü!");
                }
            } catch (NumberFormatException e) {
                // format hatası
                JOptionPane.showMessageDialog(null, "Kapasise ve üretim sadece sayı olabilir", "Hata", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Özel enerji kaynağı hatası
                JOptionPane.showMessageDialog(null, e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                // Diğer beklenmeyen hatalar
                JOptionPane.showMessageDialog(null, "Bilinmeyen bir hata oluştu: " , "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public static void binaEkle(BinaEkleme binaEkleme) {
            try {
                String isim = binaEkleme.getbIsim();
                int konum = binaEkleme.getbKonum();
                int kat = binaEkleme.getbKat();
                float enjTuketim = binaEkleme.getEnerjiTuketim();
                float suTuketim = binaEkleme.getSuTuketim();
                int binaTuru = binaEkleme.getBinaTuru(); // 0 -> Geleneksel, 1 -> Akıllı

                // Veri girişlerinde boş ya da hatalı veri kontrolü
                if (isim == null || isim.trim().isEmpty())
                    throw new IllegalArgumentException("Bina ismi boş olamaz!"); // Bina ismi eksik veya yanlış girilmiş

                if (kat <= 0) 
                    throw new IllegalArgumentException("Kapasite 0 veya negatif olamaz!"); // Kapasite hatalı

                if (enjTuketim < 0) 
                    throw new IllegalArgumentException("Enerji tüketimi negatif olamaz!"); // Tüketim değerleri doğru değil

                if (suTuketim < 0) 
                    throw new IllegalArgumentException("Su tüketimi negatif olamaz!"); // Su tüketim değeri doğru değil


                // Switch case ile bina türünü oluşturma
                switch (binaTuru) {
                    case 0 -> {
                        new Geleneksel(isim, konum, kat, enjTuketim, suTuketim);
                        JOptionPane.showMessageDialog(null, "Geleneksel bina başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    case 1 -> {
                        new Akilli(isim, konum, kat, enjTuketim, suTuketim);
                        JOptionPane.showMessageDialog(null, "Akıllı bina başarıyla eklendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                    }

                    default -> throw new IllegalArgumentException("Desteklenmeyen bina türü!");
                }
            } catch (NumberFormatException e) {
                // Şifre sade ınt 
                JOptionPane.showMessageDialog(null, "Kat sayısı, Enerji tüketimi ve su tüketimi sadece sayı olabilir", "Giriş Hatası", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Hatalı girişler için kullanıcıya mesaj göster
                JOptionPane.showMessageDialog(null, e.getMessage(), "Giriş Hatası", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                // Beklenmeyen hatalar için genel bir mesaj göster
                JOptionPane.showMessageDialog(null, "Bilinmeyen bir hata oluştu: ", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}