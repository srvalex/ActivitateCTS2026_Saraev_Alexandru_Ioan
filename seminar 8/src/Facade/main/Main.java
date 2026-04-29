package Facade.main;

import Facade.spital.Medic;
import Facade.spital.Pacient;
import Facade.spital.Salon;
import Facade.spital.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Eu", 10);
        Medic medic = new Medic("Dumnezeu");
        Salon salonATI = Salon.getInstance();


        if (pacient.getGravitate() >= 4) {
            if (medic.areBiletTrimitere(pacient)) {
                int numarPat = salonATI.patLiber();
                if (numarPat != -1) {
                    System.out.println(pacient.toString() + " a fost internat");
                    salonATI.ocupaPat(numarPat);
                }
            }
        }

        Pacient pacient2 = new Pacient("Eul 2",4);
        Pacient pacient3 = new Pacient("Eul 3",8);
        SpitalFacade facade = new SpitalFacade(medic,Salon.getInstance());
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient3);


    }


}

