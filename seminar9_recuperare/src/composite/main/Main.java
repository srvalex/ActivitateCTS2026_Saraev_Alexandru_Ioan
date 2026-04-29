package composite.main;

import composite.strucutra.Departament;
import composite.strucutra.SectieSpital;
import composite.strucutra.StructuraSpital;

import java.sql.Struct;

public class Main {
    public static void main(String[] args) {
        StructuraSpital departamentChirurgie = new Departament("Chirurgie");
        StructuraSpital departamentAdministrativ = new Departament("Administrativ");

        StructuraSpital secretariat = new SectieSpital("Secretariat",8);
        StructuraSpital sectieManagement = new SectieSpital("Management",9);
        StructuraSpital sectieAAAA = new SectieSpital("Chirurgie mate sange",9);


        ((Departament)departamentAdministrativ).adaugaStructura(secretariat);
        ((Departament)departamentAdministrativ).adaugaStructura(sectieManagement);
        ((Departament)departamentChirurgie).adaugaStructura(sectieAAAA);

        departamentAdministrativ.afiseazaPersonal();


        System.out.println("\n----------------------------\n");
        departamentChirurgie.afiseazaPersonal();

    }
}
