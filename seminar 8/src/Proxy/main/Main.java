package Proxy.main;

import Proxy.internare.ISpital;
import Proxy.internare.Spital;
import Proxy.pacient.Pacient;
import Proxy.proxies.ProxyAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Pacientul X",true);
        ISpital spital = new Spital("Spitalul Marius Nasta");
        spital.internarePacient(pacient);

        Pacient pacient1 = new Pacient("Pacientul Y",false);
        ProxyAsigurare proxyAsigurare = new ProxyAsigurare(spital);
        proxyAsigurare.internarePacient(pacient);
        proxyAsigurare.internarePacient(pacient1);
    }
}
