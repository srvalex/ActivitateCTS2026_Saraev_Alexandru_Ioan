package observer.MagazinWeb;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements CentruNotificari{
    private List<IAbonat> listaAbonati;
    private String denumireMagazin;

    public Newsletter(String denumireMagazin) {
        this.denumireMagazin = denumireMagazin;
        listaAbonati = new ArrayList<>();
    }

    @Override
    public void anuntaAbonati() {
        for(var abonat:listaAbonati)
        {
            abonat.anuntaAbonat();
        }
    }

    public void adaugaAbonat(IAbonat abonat) {
        listaAbonati.add(abonat);
    }

    @Override
    public void eliminaAbonat(int pozitie) {
        listaAbonati.remove(pozitie);
    }
}
