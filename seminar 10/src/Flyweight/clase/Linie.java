package Flyweight.clase;

public class Linie implements LinieTransport{

    private int numarLinie;
    private String statieInceput;
    private String statieFinal;

    public Linie(int numarLinie, String statieInceput, String statieFinal) {
        this.numarLinie = numarLinie;
        this.statieInceput = statieInceput;
        this.statieFinal = statieFinal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("numarLinie=").append(numarLinie);
        sb.append(", statieInceput='").append(statieInceput).append('\'');
        sb.append(", statieFinal='").append(statieFinal).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaInformatiiAutobuz(Autobuz autobuz) {
        System.out.println(autobuz.toString());
        System.out.println(this.toString());
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    @Override
    public void afiseazaNumarCalatoriTraseu(Autobuz autobuz) {
        StringBuilder sb = new StringBuilder("De la statia ").append(this.statieInceput).append(" pana la statia ").append(this.statieFinal)
                .append(" pot merge doar ").append(autobuz.getNumarCalatori()).append(" calatori");
        System.out.println(sb.toString());
    }
}
