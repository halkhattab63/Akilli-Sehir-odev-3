
package varliklar;

public abstract class Enerjikaynagi extends Varlik{
    protected int kapasite;
    protected float uretim;

    public Enerjikaynagi(String isim, int konum, int kapasite, float uretim) {
        super(isim, konum);
        this.kapasite = kapasite;
        this.uretim = uretim;
        
        enerjiKaynaklar.add(this);
        
    }
    
    

    public int getKapasite() {
        return kapasite;
    }

    public float getUretim() {
        return uretim;
    }
    
    public void guncelle(String isim, int konum, int kapasite, float uretim) {
        this.isim = isim;
        this.konum = konum;
        this.kapasite = kapasite;
        this.uretim = uretim;
    }
}
