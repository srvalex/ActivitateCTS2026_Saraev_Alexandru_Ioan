package Prototype.v2.main;

import Prototype.v1.mijloc_de_transport.Autobuz;
import Prototype.v2.mijloc_de_transport.Autobuz_v2;
import Prototype.v2.mijloc_de_transport.MijlocDeTransport_v2;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport_v2 autobuz1 = new Autobuz_v2("21",45,"Transport Ilfov","Mercedes");
        MijlocDeTransport_v2 autobuz2 = autobuz1.clone();
        System.out.println(autobuz1);
        ((Autobuz_v2)autobuz2).setDenumireLinie("45");
        System.out.println(autobuz2);
    }
}
