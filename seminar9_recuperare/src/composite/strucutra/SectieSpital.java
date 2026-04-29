package composite.strucutra;

public class SectieSpital implements StructuraSpital{
    private String denumireSectie;
    private int dimensiunePersonal;

    public SectieSpital(String denumireSectie, int dimensiunePersonal) {
        this.denumireSectie = denumireSectie;
        this.dimensiunePersonal = dimensiunePersonal;
    }

    public String getDenumireSectie() {
        return denumireSectie;
    }

    public void setDenumireSectie(String denumireSectie) {
        this.denumireSectie = denumireSectie;
    }

    public int getDimensiunePersonal() {
        return dimensiunePersonal;
    }

    public void setDimensiunePersonal(int dimensiunePersonal) {
        this.dimensiunePersonal = dimensiunePersonal;
    }

    @Override
    public void afiseazaPersonal() {
        StringBuilder sb = new StringBuilder(this.denumireSectie).append(" are un personal total de ").append(dimensiunePersonal);
        System.out.println(sb.toString());
    }
}
