package Prototype.v1.main;

import Prototype.v1.Prototip.ITransport;
import Prototype.v1.mijloc_de_transport.Autobuz;
import Prototype.v1.mijloc_de_transport.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz1 = new Autobuz("21",45,"Transport Ilfov","Mercedes");
        MijlocDeTransport autobuz2 = autobuz1.clone();
        System.out.println(autobuz1);
        ((Autobuz)autobuz2).setDenumireLinie("45");
        System.out.println(autobuz2);

    }
}
