package SimpleFactory_turned_FactoryMethod.clase.notificari_mobile;

import SimpleFactory_turned_FactoryMethod.clase.Notifier;

public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
