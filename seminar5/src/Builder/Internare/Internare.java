package Builder.Internare;

public class Internare {
    protected Boolean patRabatabil;
    protected Boolean micDejunInclus;
    protected Boolean halat;
    protected Boolean papuci;
    protected String numePacient;

    public Internare(String numePacient,Boolean patRabatabil, Boolean micDejunInclus, Boolean halat, Boolean papuci) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.halat = halat;
        this.papuci = papuci;
        this.numePacient = numePacient;
    }

    public Boolean getPatRabatabil() {
        return patRabatabil;
    }

    public void setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public Boolean getMicDejunInclus() {
        return micDejunInclus;
    }

    public void setMicDejunInclus(Boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public Boolean getHalat() {
        return halat;
    }

    public void setHalat(Boolean halat) {
        this.halat = halat;
    }

    public Boolean getPapuci() {
        return papuci;
    }

    public void setPapuci(Boolean papuci) {
        this.papuci = papuci;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", halat=").append(halat);
        sb.append(", papuci=").append(papuci);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
