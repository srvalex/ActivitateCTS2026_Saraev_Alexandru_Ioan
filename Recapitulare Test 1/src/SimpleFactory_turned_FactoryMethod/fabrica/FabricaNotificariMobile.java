package SimpleFactory2.fabrica;

import SimpleFactory2.clase.notificari_mobile.EmailNotifier;
import SimpleFactory2.clase.Notifier;
import SimpleFactory2.clase.notificari_mobile.PushNotifier;
import SimpleFactory2.clase.notificari_mobile.SMSNotifier;

public class FabricaNotificariMobile implements BaseNotificationFactory {

    @Override
    public Notifier getNotificare(NOTIFICARE type) {
        switch (type){
            case NOTIFICARE_MOBILE.SMS: return new SMSNotifier();
            case NOTIFICARE_MOBILE.EMAIL: return new EmailNotifier();
            case NOTIFICARE_MOBILE.PUSH: return new PushNotifier();
            default: return null;
        }
    }

}
