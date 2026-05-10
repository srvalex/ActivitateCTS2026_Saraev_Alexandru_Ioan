package observer.MagazinWeb;

public interface CentruNotificari {
    void anuntaAbonati();
    void adaugaAbonat(IAbonat abonat);
    void eliminaAbonat(int pozitie);
}
