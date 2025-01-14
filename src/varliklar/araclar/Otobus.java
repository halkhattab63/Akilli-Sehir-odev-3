/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varliklar.araclar;

import varliklar.Arac;


public class Otobus extends Arac{
    public Otobus(String isim, int konum, int kapasite, float tuketim) {
        super(isim, konum, kapasite, tuketim);
        this.tip = "Otobüs";
    }
    
}
