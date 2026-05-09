package facade.ingrediente;

public class Legume {
    private String denumire;
    private int cantitate;

    public Legume(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void preparaLegume(String denumirePreparat) {
        System.out.println("Legumele au fost preparate pentru " + denumirePreparat);
    }

}
