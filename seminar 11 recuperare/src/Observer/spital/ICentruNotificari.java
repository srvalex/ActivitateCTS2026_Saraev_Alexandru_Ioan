package Observer.spital;

public interface ICentruNotificari {
    void trimtieMesaj(String mesaj);
    void abonarePacient(Notificare notificare);
    void dezabonarePacient (int pozitie);
}
