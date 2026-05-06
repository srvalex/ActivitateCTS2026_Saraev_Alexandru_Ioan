package Proxy.main;

import Proxy.clase.Autobuz;
import Proxy.clase.AutobuzCursaSpeciala;
import Proxy.clase.AutobuzDeNoapte;
import Proxy.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz("102",25);
        autobuz.opresteInStatie();

        IAutobuz proxyAutobuzNoapte = new AutobuzDeNoapte(autobuz);
        proxyAutobuzNoapte.opresteInStatie();

        IAutobuz autobuzGol = new Autobuz("N110",0);
        IAutobuz proxyAutobuzNoapteGol = new AutobuzDeNoapte(autobuzGol);
        proxyAutobuzNoapteGol.opresteInStatie();

        IAutobuz autobuzCursaSpeciala = new Autobuz("Cursa speciala copii liceu Sincai",35);
        IAutobuz proxyCursaSpeciala = new AutobuzCursaSpeciala(autobuzCursaSpeciala);
        proxyCursaSpeciala.opresteInStatie();


    }
}
