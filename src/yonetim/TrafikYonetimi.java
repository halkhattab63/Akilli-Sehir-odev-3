/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yonetim;

import java.util.Map;
import java.util.HashMap;
import kisiler.Yonetici;

/**
 *
 * @author Hayan Alkhattab 
 */
public class TrafikYonetimi implements Yonetimler{
    public static boolean uyari_1;
    public static boolean uyari_2;
    public static boolean uyari_3;
    public static boolean uyari_4;
    
    public static Map<Integer, Integer> bolgeler = new HashMap<>() {{
        put(1, 0);
        put(2, 0);
        put(3, 0);
        put(4, 0);
    }};

    @Override
    public void uyar() {
        if (bolgeler.get(1) >= 5 && !uyari_1) {
            Yonetici.uyariEkle("Trafik", "Bölge 1'de sıkışma vardır");
            uyari_1 = true;
        }
        
        if (bolgeler.get(2) >= 5 && !uyari_2) {
            Yonetici.uyariEkle("Trafik", "Bölge 2'de sıkışma vardır");
            uyari_2 = true;
        }
        
        if (bolgeler.get(3) >= 5 && !uyari_3) {
            Yonetici.uyariEkle("Trafik", "Bölge 3'de sıkışma vardır");
            uyari_3 = true;
        }
        
        if (bolgeler.get(4) >= 5 && !uyari_4) {
            Yonetici.uyariEkle("Trafik", "Bölge 4'de sıkışma vardır");
            uyari_4 = true;
        }
    }
}
