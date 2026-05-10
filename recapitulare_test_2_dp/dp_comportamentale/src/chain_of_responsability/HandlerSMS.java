package chain_of_responsability;

public class HandlerSMS extends Handler{

    @Override
    void trimiteNotificare(Abonat abonat) {
        if(abonat.getNumarTelefon().isEmpty()) {
            this.getSuccesor().trimiteNotificare(abonat);
        }
        else {
            System.out.println("Notificare trimisa prin SMS!");
        }
    }
}
