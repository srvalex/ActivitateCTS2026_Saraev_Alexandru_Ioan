package persoane;

public class Profesor extends Persoana implements IPredabil{
    private int idAngajat;

    public Profesor(String nume, int varsta, int idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    @Override
    public void preda() {
        System.out.println("Profesorul preda");
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Profesor{").append("idAngajat=").append(idAngajat);
        sb.append('}');
        return sb.toString();
    }
}
