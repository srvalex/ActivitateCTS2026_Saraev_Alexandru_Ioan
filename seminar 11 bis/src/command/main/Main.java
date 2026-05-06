package command.main;

import command.autobaza.Autobuz;
import command.autobaza.Operator;
import command.autobaza.Plecare;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("B 102 GKK","Mercedes");
        Autobuz a2 = new Autobuz("B 55 STB","MAN");
        Autobuz a3 = new Autobuz("B 100 PMB","Iveco");

        Plecare p1 = new Plecare(a1,102);
        Plecare p2 = new Plecare(a2,381);
        Plecare p3 = new Plecare(a3,135);
        Operator operator = new Operator();

        operator.adaugaComanda(p1);
        operator.adaugaComanda(p3);
        operator.adaugaComanda(p2);

       operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
