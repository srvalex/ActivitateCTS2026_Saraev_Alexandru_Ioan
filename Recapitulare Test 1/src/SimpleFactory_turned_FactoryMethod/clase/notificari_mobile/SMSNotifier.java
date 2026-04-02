package SimpleFactory2.clase.notificari_mobile;

import SimpleFactory2.clase.Notifier;

public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
