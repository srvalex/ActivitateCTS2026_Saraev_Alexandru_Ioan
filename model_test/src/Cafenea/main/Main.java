package Cafenea.main;

import Cafenea.Casa.CasaDeMarcat;
import Cafenea.bauturi.Bautura;
import Cafenea.bauturi.CiocolataCalda;
import Cafenea.comanda.Comanda;
import Cafenea.factory.FabricaBauturi;
import Cafenea.factory.TIP_BAUTURA;

public class Main {
    public static void main(String[] args) {
        FabricaBauturi fabrica = new FabricaBauturi();

        Bautura cioco = fabrica.getBautura(TIP_BAUTURA.CIOCOLATA_CALDA,"Irish hot choclate",250,17.99f);
        Bautura cafelutza = fabrica.getBautura(TIP_BAUTURA.CAFEA,"Vanilla Latte",199,12.99f);
        Bautura ceai1 = fabrica.getBautura(TIP_BAUTURA.CEAI,"Ceai verde / matcha",399,28.99f);
        Bautura ceai2 = fabrica.getBautura(TIP_BAUTURA.CEAI,"Ceai de fructe",249,12.99f);

        cioco.afiseazaPasiDePreparare();
        cafelutza.afiseazaPasiDePreparare();
        ceai1.afiseazaPasiDePreparare();
        ceai2.afiseazaPasiDePreparare();

        Comanda c1 = new Comanda();
        c1.adaugaBautura(cioco);
        c1.adaugaBautura(ceai2);

        Comanda c2 = new Comanda();
        c2.adaugaBautura(ceai1);
        c2.adaugaBautura(cafelutza);
        CasaDeMarcat casaDeMarcat = CasaDeMarcat.getInstantaCasaDeMarcat();

        casaDeMarcat.adaugaComanda(c1);
        casaDeMarcat.adaugaComanda(c2);

        CasaDeMarcat casaDeMarcat2 = CasaDeMarcat.getInstantaCasaDeMarcat();

        System.out.println("\n----------------------------");
        casaDeMarcat2.afiseazaToateBauturileDinUltimaComanda();
        System.out.println("----------------------------");
        //Afiszare tot ce se afla in C2

        casaDeMarcat2.afiseazaComanda(1);
        casaDeMarcat2.adaugaBauturaLaComanda(1, fabrica.getBautura(TIP_BAUTURA.CEAI,"Ceai de rodie",299,16.99f));
        System.out.println("----------------------------");
        casaDeMarcat2.afiseazaComanda(1);
    }
}
