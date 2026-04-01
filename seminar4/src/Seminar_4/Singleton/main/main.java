package Seminar_4.Singleton.main;

import Singleton.clase.Logger;

public class main {
    public static void main (String []args) {
        Logger instanta = Logger.getInstanta("Interfata","afisare");
        instanta.afiseazaLog("Afisare mesaj de succes","i");
        instanta.afiseazaLog("Afisare mesaj de avertizare","warning");

        Logger instanta2 = Logger.getInstanta("Aplicatie","warning");
        instanta2.afiseazaLog("Warning runtime la linia ...","warning");
        instanta2.setSender("Aplicatie");
        instanta2.afiseazaLog("Warning runtime la linia ...","warning");





    }
}
