package SimpleFactory_turned_FactoryMethod.clase.notificari_mobile;

import SimpleFactory_turned_FactoryMethod.clase.Notifier;

public class EmailNotifier implements Notifier {

        @Override
        public void send(String message) {
            System.out.println("[EMAIL] " + message);
        }
}
