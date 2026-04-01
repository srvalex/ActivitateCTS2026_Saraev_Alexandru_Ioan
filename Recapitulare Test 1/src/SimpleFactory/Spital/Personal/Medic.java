package SimpleFactory.Spital.Personal;

public class Medic extends PersonalSpital{
    private int nrAniExperienta;

    public Medic(String nume, int varsta, int nrAniExperienta) {
        super(nume, varsta);
        this.nrAniExperienta = nrAniExperienta;
    }
    public Medic(String nume, int varsta) {
        super(nume, varsta);
    }

    public int getNrAniExperienta() {
        return nrAniExperienta;
    }

    public void setNrAniExperienta(int nrAniExperienta) {
        this.nrAniExperienta = nrAniExperienta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic:");
        sb.append("nrAniExperienta=").append(nrAniExperienta);
        sb.append(super.toString());
        return sb.toString();
    }
}
