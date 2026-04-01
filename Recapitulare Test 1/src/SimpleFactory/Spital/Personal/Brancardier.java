package SimpleFactory.Spital.Personal;

public class Brancardier extends PersonalSpital{
    private int numarTure;

    public Brancardier(String nume, int varsta, int numarTure) {
        super(nume, varsta);
        this.numarTure = numarTure;
    }

    public int getNumarTure() {
        return numarTure;
    }

    public void setNumarTure(int numarTure) {
        this.numarTure = numarTure;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier:");
        sb.append("numarTure=").append(numarTure);
        sb.append(super.toString());
        return sb.toString();
    }
}
