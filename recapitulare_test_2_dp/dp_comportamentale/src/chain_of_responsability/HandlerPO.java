package chain_of_responsability;

public class HandlerPO extends Handler{

    @Override
    void trimiteNotificare(Abonat abonat) {
        System.out.println("Aici se termina smecheria. Iti trimitem notificare prin posta");
    }
}
