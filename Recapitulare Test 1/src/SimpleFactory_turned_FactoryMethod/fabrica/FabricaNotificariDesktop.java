package SimpleFactory2.fabrica;

import SimpleFactory2.clase.Notifier;
import SimpleFactory2.clase.notificari_desktop.AlertNotification;
import SimpleFactory2.clase.notificari_desktop.PopUpNotifier;

public class FabricaNotificariDesktop implements BaseNotificationFactory{

    @Override
    public Notifier getNotificare(NOTIFICARE type) {
        switch (type) {
            case NOTIFICARE_DESKTOP.ALERT: return new AlertNotification();
            case NOTIFICARE_DESKTOP.POP_UP: return new PopUpNotifier();
            default: return null;
        }
    }
}
