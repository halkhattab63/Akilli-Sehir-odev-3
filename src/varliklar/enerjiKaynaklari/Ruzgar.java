
package varliklar.enerjiKaynaklari;

import varliklar.Enerjikaynagi;


public class Ruzgar extends Enerjikaynagi{

    public Ruzgar(String isim, int konum, int kapasite, float uretim) {
        super(isim, konum, kapasite, uretim);
        this.tip = "Rüzgar";
    }
    
}
