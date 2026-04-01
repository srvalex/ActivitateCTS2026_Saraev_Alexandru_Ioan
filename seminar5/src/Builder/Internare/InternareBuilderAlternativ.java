package Builder.Internare;

public class InternareBuilderAlternativ implements InternareBuilderAbstractA{

    private Boolean patRabatabil;
    private Boolean micDejunInclus;
    private Boolean halat;
    private Boolean papuci;
    private String numePacient;


    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.halat = false;
        this.papuci = false;
    }

    public Boolean getPatRabatabil() {
        return patRabatabil;
    }

    public InternareBuilderAlternativ setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public Boolean getMicDejunInclus() {
        return micDejunInclus;
    }

    public InternareBuilderAlternativ setMicDejunInclus(Boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public Boolean getHalat() {
        return halat;
    }

    public InternareBuilderAlternativ setHalat(Boolean halat) {
        this.halat = halat;
        return this;
    }

    public Boolean getPapuci() {
        return papuci;
    }

    public InternareBuilderAlternativ setPapuci(Boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public InternareBuilderAlternativ setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }


    @Override
    public Internare build(String numePacient) {
        return new Internare(numePacient,this.patRabatabil,this.micDejunInclus,this.halat,this.papuci);
    }
}
