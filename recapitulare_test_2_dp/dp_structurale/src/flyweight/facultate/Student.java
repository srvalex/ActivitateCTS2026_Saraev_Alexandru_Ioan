package flyweight.facultate;

public class Student {
    private int nrMatricol;
    private String nume;

    public Student(int nrMatricol, String nume) {
        this.nrMatricol = nrMatricol;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("nrMatricol=").append(nrMatricol);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
