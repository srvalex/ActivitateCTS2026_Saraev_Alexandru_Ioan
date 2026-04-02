package SimpleFactory2.clase.notificari_desktop;

import SimpleFactory2.clase.Notifier;

public class AlertNotification implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Desktop Alert! :"+message);
    }
}
