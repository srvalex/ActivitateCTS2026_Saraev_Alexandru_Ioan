package SimpleFactory_turned_FactoryMethod.fabrica;

import SimpleFactory_turned_FactoryMethod.clase.Notifier;

public interface BaseNotificationFactory{
    Notifier getNotificare(NOTIFICARE type);
}
