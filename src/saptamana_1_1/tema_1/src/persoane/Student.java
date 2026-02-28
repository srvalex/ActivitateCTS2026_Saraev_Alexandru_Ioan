package persoane;

public class Student extends Persoana{

    private int idStudent;

    public Student(String nume, int varsta, int idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Student{").append("idStudent=").append(idStudent);
        sb.append('}');
        return sb.toString();
    }
}
