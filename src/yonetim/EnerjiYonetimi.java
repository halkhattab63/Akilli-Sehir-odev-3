/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yonetim;

import kisiler.Yonetici;
import varliklar.*;

/**
 *
 * @author Hayan Alkhattab 
 */
public class EnerjiYonetimi implements Yonetimler{
    private boolean uyari = false;

    public void setUyari(boolean uyari) {
        this.uyari = uyari;
    }
    
    public static float getToplamUretim() {
        float uretim = 0;
        
        for(Enerjikaynagi kaynak : Varlik.enerjiKaynaklar)
            uretim += kaynak.getUretim();
        
        return uretim;
    }
    
    public static float getToplamTuketim() {
        float tuketim = 0;
        
        for(Bina bina : Varlik.binalar)
            tuketim += bina.getEnerjiTuketimi();
        
        for(Arac arac : Varlik.araclar)
            tuketim += arac.getTuketim();
        
        return tuketim;
    }

    @Override
    public void uyar() {
        if (getToplamTuketim() > getToplamUretim() && !uyari){
            Yonetici.uyariEkle("Enerji", "Enerji tüketimi üretimi aşmıştır");
            uyari = true;
        }
    }
    
}
