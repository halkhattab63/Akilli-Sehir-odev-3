/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varliklar.araclar;

import java.util.Random;
import kisiler.Yonetici;
import varliklar.Arac;

public class ElektrikliArac extends Arac{
    private boolean uyar = false;
    private int sarj;

    public ElektrikliArac(String isim, int konum, int kapasite, float tuketim) {
        super(isim, konum, kapasite, tuketim);
        this.sarj = new Random().nextInt(101);
        this.tip = "Elektrikli araç";
        
        if (this.sarj < 20){
            this.sarjUyari();
            uyar = true;
        }
    }
    
    public int getSarj() {
        return sarj;
    }

    public void setSarj(int sarj) {
        this.sarj = sarj;
    }
    
    public void sarjUyari() {
        if(sarj < 20 && !uyar) {
            Yonetici.uyariEkle("Elektrikli araç", "Şarj seviyesi %20 altına düştü. İstasyona git");
        }
    }
}
