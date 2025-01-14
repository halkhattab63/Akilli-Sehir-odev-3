package varliklar;

import java.util.ArrayList;

public abstract class Varlik {
    public static ArrayList<Arac> araclar = new ArrayList<>();
    public static ArrayList<Bina> binalar = new ArrayList<>();
    public static ArrayList<Enerjikaynagi> enerjiKaynaklar = new ArrayList<>();
    
    protected String isim;
    protected String tip;
    protected int konum;

    public Varlik(String isim, int konum) {
        this.isim = isim;
        this.konum = konum;   
    }

    public static ArrayList<Arac> getAraclar() {
        return araclar;
    }

    public static ArrayList<Bina> getBinalar() {
        return binalar;
    }

    public static ArrayList<Enerjikaynagi> getEnerjiKaynaklar() {
        return enerjiKaynaklar;
    }
    
 
    public String getIsim() {
        return isim;
    }

    public int getKonum() {
        return konum;
    }

    public String getTip() {
        return tip;
    }
}
