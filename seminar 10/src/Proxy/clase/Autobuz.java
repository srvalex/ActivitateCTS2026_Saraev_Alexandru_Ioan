package Proxy.clase;

public class Autobuz implements IAutobuz{

    private String numarLinie;
    private int numarCalatori;

    public Autobuz(String numarLinie, int numarCalatori) {
        this.numarLinie = numarLinie;
        this.numarCalatori = numarCalatori;
    }

    public String getNumarLinie() {
        return numarLinie;
    }

    public void setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
    }

    public int getNumarCalatori() {
        return numarCalatori;
    }

    public void setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul de pe linia "+ getNumarCalatori() + " a oprit in statie. Calatorii pot coborî");
    }
}
