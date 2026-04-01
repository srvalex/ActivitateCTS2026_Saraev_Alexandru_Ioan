package Builder.Restaurant.Builder_DRY;

import Builder.Restaurant.Builder_NO_DRY.Builder_No_Dry;
import Builder.Restaurant.Rezervare.Rezervare;

public class BuilderDry implements AbstractRezervareBuilder_DRY {

    public static BuilderDry instantaBuilderDry = null;
    Rezervare rezervare;

    private BuilderDry() {
        this.rezervare = new Rezervare();
    }


    public BuilderDry setPriveliste(boolean priveliste) {
        rezervare.setPrivelisteGeam(priveliste);
        return this;
    }

    public BuilderDry setScaunErgonomic(boolean scaunErgonomic) {
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public BuilderDry setDecoratiuneMasa(boolean decoratiuneMasa) {
        rezervare.setDeocorareMasa(decoratiuneMasa);
        return this;
    }
    public BuilderDry setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        rezervare.setMuzicaPersonalizata(muzicaPersonalizata);
        return this;
    }

    public BuilderDry setGenMuzicalPreferat (String genMuzicalPreferat) {
        rezervare.setGenMuzicalPreferat(genMuzicalPreferat);
        return this;
    }

    public static synchronized BuilderDry getInstantaBuilderDry() {
        if(instantaBuilderDry == null) {
            instantaBuilderDry = new BuilderDry();
            return instantaBuilderDry;
        }
        else {
            return instantaBuilderDry;
        }
    }

    @Override
    public Rezervare build(String denumireEveniment) {
        this.rezervare.setEveniment(denumireEveniment);
        return this.rezervare;
    }
}
