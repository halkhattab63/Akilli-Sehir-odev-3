
package varliklar.enerjiKaynaklari;

import varliklar.Enerjikaynagi;


public class Fosil extends Enerjikaynagi{

    public Fosil(String isim, int konum, int kapasite, float uretim) {
        super(isim, konum, kapasite, uretim);
        this.tip = "Fosil";
    }
    
}
