package Facade.spital;

public class Pacient {
    private String numePacient;
    private int gravitate;

    public Pacient(String numePacient, int gravitate) {
        this.numePacient = numePacient;
        this.gravitate = gravitate;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public int getGravitate() {
        return gravitate;
    }

    public void setGravitate(int gravitate) {
        this.gravitate = gravitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", gravitate=").append(gravitate);
        sb.append('}');
        return sb.toString();
    }
}
