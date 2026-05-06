package Observer.spital;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ICentruNotificari{
    private String denumireSpital;
    private List<Notificare> listaPacienti;

    public Spital(String denumireSpital) {
        this.denumireSpital = denumireSpital;
        listaPacienti = new ArrayList<>();
    }

    @Override
    public void trimtieMesaj(String mesaj) {
    for (var pacient: listaPacienti){
        pacient.primesteNotificare(mesaj);
    }
    }

    @Override
    public void abonarePacient(Notificare notificare) {
        listaPacienti.add(notificare);
    }

    @Override
    public void dezabonarePacient(int pozitie) {
        listaPacienti.remove(pozitie);
    }

    public void notificaVirus() {
        trimtieMesaj("Exista un virus in oras. Adapostiti-va");
    }

    public void notificaEpidemie() {
        trimtieMesaj("ATENTIE! EXISTA O EPIDEMIE");
    }
}
