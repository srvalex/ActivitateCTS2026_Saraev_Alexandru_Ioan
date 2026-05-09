package facade.main;

import facade.bucatarie.BucatarFacade;
import facade.ingrediente.Carne;
import facade.ingrediente.Legume;
import facade.ingrediente.Sos;

public class Main {
    public static void main(String[] args) {
        Carne carne = new Carne("Pui","piept",250);
        Legume ceapa = new Legume("Ceapa",100);
        Sos cheezy = new Sos("extraCheezy",20);
        BucatarFacade bucataruTiti = new BucatarFacade(carne,ceapa);

        String denumirePreparat = "AAAA";

        System.out.println("\n ------------------------------FARA FACADE-------------------------------------\n");

        carne.condimenteazaCarne(denumirePreparat);
        carne.gatesteCarne(denumirePreparat);
        ceapa.preparaLegume(denumirePreparat);
        carne.aplicaSosPeCarne(cheezy);

        System.out.println("\n ------------------------------CU FACADE-------------------------------------\n");

        bucataruTiti.preparaShaorma(null);
        bucataruTiti.preparaShaorma(cheezy);
    }
}
