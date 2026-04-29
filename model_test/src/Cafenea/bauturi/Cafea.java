package Cafenea.bauturi;

public class Cafea implements Bautura{
    private String denumire;
    private int volum;
    private float pret;

    public Cafea(String denumire, int volum, float pret) {
        this.denumire = denumire;
        this.volum = volum;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPasiDePreparare() {
        System.out.println(this.toString());
        System.out.println("Baga capsula in espresor, apasa pe buton si ai cafea");
    }

    @Override
    public float getPretBautura() {
        return this.pret;
    }
}
