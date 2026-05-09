package decorator.shoarmar.meniu;

public class MeniuPui implements IMeniu{

    private String dimensiuneMeniu;
    private int pret;

    public MeniuPui(String dimensiuneMeniu, int pret) {
        this.dimensiuneMeniu = dimensiuneMeniu;
        this.pret = pret;
    }

    @Override
    public void comanda() {
        System.out.println("Ati comandat meniu de pui " + this.dimensiuneMeniu +"; Costa "+pret);
    }
}
