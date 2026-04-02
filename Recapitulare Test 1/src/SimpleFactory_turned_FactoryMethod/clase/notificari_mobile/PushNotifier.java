package SimpleFactory2.clase.notificari_mobile;

import SimpleFactory2.clase.Notifier;

// PushNotifier.java
public class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}
