
package varliklar.binalar;

import varliklar.Bina;

public class Geleneksel extends Bina{

    public Geleneksel(String isim, int konum, int katsayisi, float enerjiTuketimi, float suTuketimi) {
        super(isim, konum, katsayisi, enerjiTuketimi, suTuketimi);
        this.tip = "Geleneksel";
    }
    
}
