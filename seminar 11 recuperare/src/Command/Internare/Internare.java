package Command.Internare;

import Command.Spial.Pacient;
import Command.Spial.PersonalSpital;

public class Internare implements Comanda{

    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(this.pacient);
    }
}
