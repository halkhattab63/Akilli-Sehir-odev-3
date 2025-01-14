/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varliklar.binalar;

import varliklar.Bina;

public class Geleneksel extends Bina{

    public Geleneksel(String isim, int konum, int katsayisi, float enerjiTuketimi, float suTuketimi) {
        super(isim, konum, katsayisi, enerjiTuketimi, suTuketimi);
        this.tip = "Geleneksel";
    }
    
}
