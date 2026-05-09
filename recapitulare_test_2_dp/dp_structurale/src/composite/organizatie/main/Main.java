package composite.organizatie.main;

import composite.organizatie.structura.Angajat;
import composite.organizatie.structura.CSuite;
import composite.organizatie.structura.Director;
import composite.organizatie.structura.IStructura;

public class Main {
    public static void main(String[] args) {
        IStructura Marcel = new Angajat("Marcel");
        IStructura Mirel = new Angajat("Mirel");
        IStructura Mircel = new Angajat("Mircel");

        IStructura CTO = new Director("Aurel");
        CTO.adaugaNod(Marcel);
        CTO.adaugaNod(Mircel);
        IStructura CFO = new Director("Codruta");
        CFO.adaugaNod(Mirel);

        IStructura executivi = new CSuite("structura executiva");
        executivi.adaugaNod(CTO);
        executivi.adaugaNod(CFO);

        CTO.afiseazaIerarhie();
        CFO.afiseazaIerarhie();
        System.out.println("\n ------------------------------------------------ \n");
        executivi.afiseazaIerarhie();

    }
}
