package SimpleFactory2.fabrica;

import SimpleFactory2.clase.Notifier;

public interface BaseNotificationFactory{
    Notifier getNotificare(NOTIFICARE type);
}
