
package varliklar.araclar;

import varliklar.Arac;
        

public class Otomobil extends Arac{

    public Otomobil(String isim, int konum, int kapasite, float tuketim) {
        super(isim, konum, kapasite, tuketim);
        this.tip = "Otomobil";
    }
    
}
