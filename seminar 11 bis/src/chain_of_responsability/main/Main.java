package chain_of_responsability.main;

import chain_of_responsability.mijloc_transport.CalatorieAutobuz;
import chain_of_responsability.mijloc_transport.CalatorieMetrou;
import chain_of_responsability.mijloc_transport.CalatorieTroleibuz;
import chain_of_responsability.mijloc_transport.ChainHandler;

public class Main {
    public static void main(String[] args) {
        ChainHandler troleu = new CalatorieTroleibuz();
        ChainHandler busu = new CalatorieAutobuz();
        ChainHandler metrou = new CalatorieMetrou();

        troleu.setSuccesor(busu);
        busu.setSuccesor(metrou);

        System.out.println(troleu.recomandareCalatorie(4));
        System.out.println(troleu.recomandareCalatorie(1));
        System.out.println(troleu.recomandareCalatorie(6));
    }
}
