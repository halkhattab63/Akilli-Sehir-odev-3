
package varliklar.enerjiKaynaklari;

import varliklar.Enerjikaynagi;

public class Nukleer extends Enerjikaynagi{

    public Nukleer(String isim, int konum, int kapasite, float uretim) {
        super(isim, konum, kapasite, uretim);
        this.tip = "Nükleer";
    }
    
}
