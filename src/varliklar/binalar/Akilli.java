
package varliklar.binalar;

import varliklar.Bina;

public class Akilli extends Bina{
    private int enerjiTasarrufu;

    public Akilli(String isim, int konum, int katsayisi, float enerjiTuketimi, float suTuketimi) {
        super(isim, konum, katsayisi, enerjiTuketimi, suTuketimi);
        enerjiTasarrufu = 0;
        this.tip = "Akıllı";
    }

    public int getEnerjiTasarrufu() {
        return enerjiTasarrufu;
    }
    
    public void enerjiTasarrufuAc() {
        this.enerjiTasarrufu = 1;
    }
    
    public void enerjiTasarrufuKapat() {
        this.enerjiTasarrufu = 0;
    }
}
