package command.autobaza;

public class Autobuz {
    private String numarInmatriculare;
    private String producator;

    public Autobuz(String numarInmatriculare, String producator) {
        this.numarInmatriculare = numarInmatriculare;
        this.producator = producator;
    }


    public void pleacaInCursa(int numarLinie) {
    StringBuilder sb= new StringBuilder("Autobuzul cu nr de inmatriculare ").append(this.numarInmatriculare).append(" a plect pe linia ").append(numarLinie);
        System.out.println(sb.toString());
    }
}
