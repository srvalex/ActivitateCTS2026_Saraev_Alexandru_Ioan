package observer.MagazinWeb;

public class Main {
    public static void main(String[] args) {
        IAbonat tutzu = new AbonatStandard("Tutzu",187.5f);
        IAbonat nutzu = new AbonatStandard("Nutzu",225.67f);

        Newsletter abercrombrie = new Newsletter("Abercrombrie - Barcelona");
        abercrombrie.adaugaAbonat(tutzu);
        abercrombrie.adaugaAbonat(nutzu);

        abercrombrie.anuntaAbonati();
    }
}
