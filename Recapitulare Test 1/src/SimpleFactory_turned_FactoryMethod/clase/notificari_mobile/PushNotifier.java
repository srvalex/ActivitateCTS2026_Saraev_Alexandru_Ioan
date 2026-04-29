package SimpleFactory_turned_FactoryMethod.clase.notificari_mobile;

import SimpleFactory_turned_FactoryMethod.clase.Notifier;

// PushNotifier.java
public class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}
