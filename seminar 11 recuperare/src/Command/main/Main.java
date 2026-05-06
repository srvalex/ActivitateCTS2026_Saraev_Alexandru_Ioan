package Command.main;

import Command.Internare.Comanda;
import Command.Internare.Internare;
import Command.Internare.Tratare;
import Command.Spial.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Dr. Nastasescu");
        PersonalSpital asistenta = new Asistenta("Madam Mioara");
        Pacient pacient1 = new Pacient("Eu");
        Pacient pacient2 = new Pacient("Eu din nou");

        Comanda internare = new Internare(medic,pacient1);
        Comanda tratare = new Tratare(asistenta,pacient2);

        Operator operator = new Operator();
        operator.inregistreazaComanda(internare);operator.inregistreazaComanda(tratare);
        operator.executaCoada();
        operator.executaCoada();
    }
}
