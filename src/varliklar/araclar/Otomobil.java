/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varliklar.araclar;

import varliklar.Arac;
        

public class Otomobil extends Arac{

    public Otomobil(String isim, int konum, int kapasite, float tuketim) {
        super(isim, konum, kapasite, tuketim);
        this.tip = "Otomobil";
    }
    
}
