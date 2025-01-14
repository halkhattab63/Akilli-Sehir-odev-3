/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yonetim;

import kisiler.Yonetici;
import varliklar.Bina;
import varliklar.Varlik;

/**
 *
 * @author Hayan Alkhattab 
 */
public class SuYonetimi implements Yonetimler{
    public static float getRezerv() {
        float rezerv = 60;
        return rezerv;
    }

    public static float getTuketim() {
        float tuketim = 0;
        
        for(Bina bina : Varlik.binalar)
            tuketim += bina.getSuTuketimi();
        
        return tuketim;
    }
    
    @Override
    public void uyar() {
        if (getRezerv() < getTuketim())
            Yonetici.uyariEkle("Su", "Su tüketimi rezerv seveyesini aşmıştır");
    }
    
}
