package Proxy.proxies;

import Proxy.internare.ISpital;
import Proxy.internare.Spital;
import Proxy.pacient.Pacient;

public class ProxyAsigurare implements ISpital {
    private ISpital spital;

    public ProxyAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void internarePacient(Pacient pacient) {
        if(pacient.isAreAsigurareSanatate()) spital.internarePacient(pacient);
        else System.out.println("Pacientul nu are asigurare, nu poate fi internat");
    }
}
