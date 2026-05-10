package command.main;

import command.Restaurant.*;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator("Robin");
        Masa masa2Locuri = new Masa(2);
        Masa masa4Locuri = new Masa(4);


        operator.adaugaComandaInCoada(new MasaOcupata(masa2Locuri,true));
        operator.adaugaComandaInCoada(new MasaOcupata(masa4Locuri,false));
        operator.adaugaComandaInCoada(new MasaRezervata(new Masa(4),true));
//        operator.adaugaComandaInCoada(new MasaOcupata(2,true));
//        operator.adaugaComandaInCoada(new MasaRezervata(4,false));
//        operator.adaugaComandaInCoada(new MasaOcupata(4,true));
//
//
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
