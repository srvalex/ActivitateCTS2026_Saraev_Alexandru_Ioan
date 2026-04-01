package Builder.Restaurant.Rezervare;

import Builder.Restaurant.Builder_DRY.AbstractRezervareBuilder_DRY;

public class Rezervare {
    protected String eveniment;
    protected boolean privelisteGeam = false;
    protected boolean scaunErgonomic = false;
    protected boolean deocorareMasa = false;
    protected String genMuzicalPreferat = "";
    protected boolean muzicaPersonalizata = false;

    public Rezervare () {

    }
    public Rezervare(String eveniment, boolean privelisteGeam, boolean scaunErgonomic, boolean deocorareMasa, String genMuzicalPreferat, boolean muzicaPersonalizata) {
        this.eveniment = eveniment;
        this.privelisteGeam = privelisteGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.deocorareMasa = deocorareMasa;
        this.genMuzicalPreferat = genMuzicalPreferat;
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("eveniment='").append(eveniment).append('\'');
        sb.append(", privelisteGeam=").append(privelisteGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", deocorareMasa=").append(deocorareMasa);
        sb.append(", genMuzicalPreferat='").append(genMuzicalPreferat).append('\'');
        sb.append(", muzicaPersonalizata=").append(muzicaPersonalizata);
        sb.append('}');
        return sb.toString();
    }

    public String getEveniment() {
        return eveniment;
    }

    public void setEveniment(String eveniment) {
        this.eveniment = eveniment;
    }

    public boolean isPrivelisteGeam() {
        return privelisteGeam;
    }

    public void setPrivelisteGeam(boolean privelisteGeam) {
        this.privelisteGeam = privelisteGeam;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isDeocorareMasa() {
        return deocorareMasa;
    }

    public void setDeocorareMasa(boolean deocorareMasa) {
        this.deocorareMasa = deocorareMasa;
    }

    public String getGenMuzicalPreferat() {
        return genMuzicalPreferat;
    }

    public void setGenMuzicalPreferat(String genMuzicalPreferat) {
        this.genMuzicalPreferat = genMuzicalPreferat;
    }

    public boolean isMuzicaPersonalizata() {
        return muzicaPersonalizata;
    }

    public void setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    public class InnerBuilder implements AbstractRezervareBuilder_DRY {

        @Override
        public Rezervare build(String denumireEveniment) {
            return null;
        }
    }
}
