package principii_clean_code.Dizpozitive;

import principii_clean_code.Dizpozitive.Functionalitati.FunctiiAudio;

public abstract class Telefon implements FunctiiAudio {
    protected Float diagonalaEcran;
    protected Integer pretVanzare;
    protected Integer dimensiuneBaterie;
    protected String culoare;
    protected Integer volum;
    protected boolean isOnDND;
    protected Float nivelLuminozitate;


    public Telefon(Float diagonalaEcran, Integer pretVanzare, Integer dimensiuneBaterie, String culoare) {
        this.diagonalaEcran = diagonalaEcran;
        this.pretVanzare = pretVanzare;
        this.dimensiuneBaterie = dimensiuneBaterie;
        this.culoare = culoare;
        this.volum = 5;
        this.isOnDND = false;
        this.nivelLuminozitate = 50f;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefon{");
        sb.append("diagonalaEcran=").append(diagonalaEcran);
        sb.append(", pretVanzare=").append(pretVanzare);
        sb.append(", dimensiuneBaterie=").append(dimensiuneBaterie);
        sb.append(", culoare=").append(culoare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void modificaVolum(Integer unitati) {
        this.volum += unitati;
        this.volum = this.volum > 10 ? 10 : this.volum;
        this.volum = this.volum < 0 ? 0 : this.volum;

    }

    @Override
    public void modificaDND() {
        this.isOnDND = !this.isOnDND;
    }
}
