package observer.MagazinWeb;

public class AbonatStandard implements IAbonat{
    private String nume;
    private float valoareTotalaComenzi;

    public AbonatStandard(String nume, float valoareTotalaComenzi) {
        this.nume = nume;
        this.valoareTotalaComenzi = valoareTotalaComenzi;
    }

    @Override
    public void anuntaAbonat() {
        System.out.println("Abercrombrie & Fitch are noi reduceri pe site! Intra si vezi daca iti place ceva.");
    }
}
