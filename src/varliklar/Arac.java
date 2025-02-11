
package varliklar;


public abstract class Arac extends Varlik{
    protected int kapasite;
    protected float tuketim;

    public Arac(String isim, int konum, int kapasite, float tuketim) {
        super(isim, konum);
        this.kapasite = kapasite;
        this.tuketim = tuketim;
        
        araclar.add(this);
    }

    
    
    public int getKapasite() {
        return kapasite;
    }

    public float getTuketim() {
        return tuketim;
    }
    
    public void guncelle(String isim,int konum, int kapasite, float tuketim){
        this.isim = isim;
        this.konum = konum;
        this.kapasite = kapasite;
        this.tuketim = tuketim;
    }
}
