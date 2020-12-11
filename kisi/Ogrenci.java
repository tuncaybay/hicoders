package ch.hicoders.jam101.week02.kisi;

public class Ogrenci {

    private  String isim;
    private  int matNot;
    private  int almNot;

    public Ogrenci(String isim, int matNot, int almNot) {
        this.isim = isim;
        this.matNot = matNot;
        this.almNot = almNot;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMatNot(int matNot) {
        this.matNot = matNot;
    }

    public void setAlmNot(int almNot) {
        this.almNot = almNot;
    }

    public String getIsim() {
        return isim;
    }

    public int getMatNot() {
        return matNot;
    }

    public int getAlmNot() {
        return almNot;
    }

}
