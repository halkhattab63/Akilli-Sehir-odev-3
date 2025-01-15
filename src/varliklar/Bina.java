
package varliklar;

public abstract class Bina extends Varlik{
    protected int katSayisi;
    protected float enerjiTuketimi;
    protected float suTuketimi;

    public Bina(String isim, int konum, int katsayisi, float enerjiTuketimi, float suTuketimi) {
        super(isim, konum);
        this.katSayisi = katsayisi;
        this.enerjiTuketimi = enerjiTuketimi;
        this.suTuketimi = suTuketimi;
        
        binalar.add(this);
    }
    
    public int getKatSayisi() {
        return katSayisi;
    }

    public float getEnerjiTuketimi() {
        return enerjiTuketimi;
    }

    public float getSuTuketimi() {
        return suTuketimi;
    }
    
    public void guncelle (String isim, int konum, int katSayisi, float enerjiTuketimi, float suTuketimi) {
        this.isim = isim;
        this.konum = konum;
        this.katSayisi = katSayisi; 
        this.enerjiTuketimi = enerjiTuketimi;
        this.suTuketimi = suTuketimi;
    }
}
