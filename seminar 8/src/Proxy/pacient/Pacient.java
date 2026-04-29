package Proxy.pacient;

public class Pacient {
    private String numePacient;
    private boolean areAsigurareSanatate;

    public Pacient(String numePacient, boolean areAsigurareSanatate) {
        this.numePacient = numePacient;
        this.areAsigurareSanatate = areAsigurareSanatate;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public boolean isAreAsigurareSanatate() {
        return areAsigurareSanatate;
    }

    public void setAreAsigurareSanatate(boolean areAsigurareSanatate) {
        this.areAsigurareSanatate = areAsigurareSanatate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", areAsigurareSanatate=").append(areAsigurareSanatate);
        sb.append('}');
        return sb.toString();
    }
}
