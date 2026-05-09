package facade.ingrediente;

public class Sos {
    private String denumireSos;
    private int cantitate;

    public Sos(String denumireSos, int cantitate) {
        this.denumireSos = denumireSos;
        this.cantitate = cantitate;
    }

    public String getDenumireSos() {
        return denumireSos;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void aplicaSos() {
        System.out.println(this.denumireSos + " a fost aplicat");
    }
}
