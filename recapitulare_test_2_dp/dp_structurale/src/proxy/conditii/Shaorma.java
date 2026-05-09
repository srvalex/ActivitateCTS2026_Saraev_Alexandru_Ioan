package proxy.conditii;

public class Shaorma implements IMeniu{
    private String denumire;
    private boolean areSos;
    private boolean areCartofiPrajiti;
    private int numarCalorii;
    private boolean areCeapa;

    public String getDenumire() {
        return denumire;
    }

    public boolean isAreSos() {
        return areSos;
    }

    public boolean isAreCartofiPrajiti() {
        return areCartofiPrajiti;
    }

    public int getNumarCalorii() {
        return numarCalorii;
    }

    public boolean isAreCeapa() {
        return areCeapa;
    }

    public Shaorma(String denumire, boolean areSos, boolean areCartofiPrajiti, int numarCalorii, boolean areCeapa) {
        this.denumire = denumire;
        this.areSos = areSos;
        this.areCartofiPrajiti = areCartofiPrajiti;
        this.numarCalorii = numarCalorii;
        this.areCeapa = areCeapa;
    }

    @Override
    public void afisareMeniu() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shaorma{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", areSos=").append(areSos);
        sb.append(", areCartofiPrajiti=").append(areCartofiPrajiti);
        sb.append(", numarCalorii=").append(numarCalorii);
        sb.append(", areCeapa=").append(areCeapa);
        sb.append('}');
        return sb.toString();
    }
}
