package chain_of_responsability;

public class HandlerEmail extends Handler{

    public HandlerEmail() {
        super();
    }

    @Override
    void trimiteNotificare(Abonat abonat) {
        if(abonat.getAdresaEmail().isEmpty()) {
            this.getSuccesor().trimiteNotificare(abonat);
        }
        else {
            System.out.println("Notificare de vanzari trimisa prin email");
        }
    }
}
