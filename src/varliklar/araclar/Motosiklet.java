
package varliklar.araclar;

import varliklar.Arac;

public class Motosiklet extends Arac{

    public Motosiklet(String isim, int konum, int kapasite, float tuketim) {
        super(isim, konum, kapasite, tuketim);
        this.tip = "Motosiklet";
    }
    
}
