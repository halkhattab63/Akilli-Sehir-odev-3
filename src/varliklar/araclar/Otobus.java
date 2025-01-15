
package varliklar.araclar;

import varliklar.Arac;


public class Otobus extends Arac{
    public Otobus(String isim, int konum, int kapasite, float tuketim) {
        super(isim, konum, kapasite, tuketim);
        this.tip = "Otobüs";
    }
    
}
