package Facade.spital;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean areBiletTrimitere(Pacient pacient) {
        return pacient.getGravitate() >= 6;
    }
}
