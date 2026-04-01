package Builder.Restaurant.Builder_NO_DRY;

import Builder.Restaurant.Rezervare.Rezervare;

public class Builder_No_Dry implements AbstractRezervareBuilder_No_Dry {

    private String denumireEveniment;
    private boolean privelisteGeam = false;
    private boolean scaunErgonomic = false;
    private boolean deocorareMasa = false;
    private String genMuzicalPreferat = "Fara";
    private boolean muzicaPersonalizata = false;

    public Builder_No_Dry setDenumireEveniment(String denumireEveniment) {
        this.denumireEveniment = denumireEveniment;
        return this;
    }

    public Builder_No_Dry setPriveliste(boolean priveliste) {
        this.privelisteGeam = priveliste;
        return this;
    }

    public Builder_No_Dry setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public Builder_No_Dry setDecoratiuneMasa(boolean decoratiuneMasa) {
        this.deocorareMasa = decoratiuneMasa;
        return this;
    }
    public Builder_No_Dry setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
        return this;
    }

    public Builder_No_Dry setGenMuzicalPreferat (String genMuzicalPreferat) {
        this.genMuzicalPreferat = genMuzicalPreferat;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(
                this.denumireEveniment,
                this.privelisteGeam,
                this.scaunErgonomic,
                this.deocorareMasa,
                this.genMuzicalPreferat,
                this.muzicaPersonalizata
        );
    }
}
