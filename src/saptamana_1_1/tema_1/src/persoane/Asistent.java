package persoane;

public class Asistent extends Persoana implements IPredabil{
    private int idAsistent;

    public Asistent(String nume, int varsta, int idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("Asistentul preda");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Asistent{").append("idAsistent=").append(idAsistent);
        sb.append('}');
        return sb.toString();
    }
}
