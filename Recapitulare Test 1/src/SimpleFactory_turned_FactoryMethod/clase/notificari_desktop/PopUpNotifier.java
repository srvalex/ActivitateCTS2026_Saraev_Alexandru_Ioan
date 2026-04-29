package SimpleFactory_turned_FactoryMethod.clase.notificari_desktop;

import SimpleFactory_turned_FactoryMethod.clase.Notifier;

public class PopUpNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("DESKTOP PopUp Notification: "+message);
    }
}
