package proxy.main;

import proxy.conditii.IMeniu;
import proxy.conditii.ProxyCeapa;
import proxy.conditii.ProxySos;
import proxy.conditii.Shaorma;

public class Main {
    public static void main(String[] args) {
        Shaorma shaorma = new Shaorma("Shaorma mica de pui",true,false,1400,false);
        IMeniu proxySos = new ProxySos(shaorma);
        IMeniu proxyCeapa = new ProxyCeapa(proxySos);

        proxyCeapa.afisareMeniu();
    }
}
