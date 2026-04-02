package SimpleFactory2.clase.notificari_desktop;

import SimpleFactory2.clase.Notifier;

public class PopUpNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("DESKTOP PopUp Notification: "+message);
    }
}
