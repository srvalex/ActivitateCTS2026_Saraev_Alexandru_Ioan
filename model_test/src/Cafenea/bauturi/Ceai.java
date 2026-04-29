package Cafenea.bauturi;

public class Ceai implements Bautura{
    private String denumire;
    private int volum;
    private float pret;

    public Ceai(String denumire, int volum, float pret) {
        this.denumire = denumire;
        this.volum = volum;
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ceai{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPasiDePreparare() {
        System.out.println(this.toString());

        System.out.printf("Pasi de preparare: Pune " + this.volum  +" ml de apa la fiert. Dupa ce apa fierbe, pune la infuzat compozitia de plante pentru 5 minute");

    }

    @Override
    public float getPretBautura() {
        return this.pret;
    }
}
