package command.autobaza;

public class Plecare implements Comanda{

    private Autobuz autobuz;
    private int numarLinie;

    public Plecare(Autobuz autobuz, int numarLinie) {
        this.autobuz = autobuz;
        this.numarLinie = numarLinie;
    }

    @Override
    public void trimiteInCursa() {
        autobuz.pleacaInCursa(numarLinie);
    }
}
