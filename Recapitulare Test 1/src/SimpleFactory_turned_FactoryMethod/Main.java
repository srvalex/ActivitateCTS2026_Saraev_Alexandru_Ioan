package SimpleFactory2;

import SimpleFactory2.clase.Notifier;
import SimpleFactory2.fabrica.*;

public class Main {
    public static void main(String[] args) {
        BaseNotificationFactory fabricaNotificari = new FabricaNotificariMobile();
        Notifier n1 = fabricaNotificari.getNotificare(NOTIFICARE_MOBILE.SMS);
        n1.send("HELLO FROM SMS");
        Notifier n2 = fabricaNotificari.getNotificare(NOTIFICARE_MOBILE.EMAIL);
        n2.send("U ARE GAY");
        Notifier n3 = fabricaNotificari.getNotificare(NOTIFICARE_MOBILE.PUSH);
        n3.send("pls end it");
        BaseNotificationFactory fabricaNotificariDesktop = new FabricaNotificariDesktop();
        Notifier n4 = fabricaNotificariDesktop.getNotificare(NOTIFICARE_DESKTOP.ALERT);
        n4.send("WINDOWS NEEDS UPDATE");
        Notifier n5 = fabricaNotificariDesktop.getNotificare(NOTIFICARE_DESKTOP.POP_UP);
        n5.send("PC done charging, please remove charger");
    }
}
