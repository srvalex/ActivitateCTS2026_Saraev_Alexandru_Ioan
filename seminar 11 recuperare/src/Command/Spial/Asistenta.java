package Command.Spial;

public class Asistenta implements PersonalSpital{
    private String denumireAsitenta;

    public Asistenta(String denumireAsitenta) {
        this.denumireAsitenta = denumireAsitenta;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta " + this.denumireAsitenta + " trateaza pacientul " + pacient.getNumePacient());
    }
}
