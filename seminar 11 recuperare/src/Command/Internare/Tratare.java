package Command.Internare;

import Command.Spial.Pacient;
import Command.Spial.PersonalSpital;

public class Tratare implements Comanda{

    private PersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(PersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        this.asistenta.preluarePacient(this.pacient);
    }
}
