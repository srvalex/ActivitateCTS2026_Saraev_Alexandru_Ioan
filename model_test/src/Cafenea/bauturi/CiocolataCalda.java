package Cafenea.bauturi;

public class CiocolataCalda implements Bautura{
    private String denumire;
    private int volum;
    private float pret;

    public CiocolataCalda(String denumire, int volum, float pret) {
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
        final StringBuilder sb = new StringBuilder("CiocolataCalda{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPasiDePreparare() {
        System.out.println(this.toString());

        System.out.println("Pasi de preparare ciocolata calda: Preia o tableta de ciocolata, topeste in baie marina, pune lapte deasupra si amesteca");
    }

    @Override
    public float getPretBautura() {
        return this.pret;
    }
}
