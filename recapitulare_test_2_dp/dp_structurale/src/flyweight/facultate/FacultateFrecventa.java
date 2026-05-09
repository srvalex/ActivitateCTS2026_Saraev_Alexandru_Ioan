package flyweight.facultate;

public class FacultateFrecventa implements IFacultate{
    private String denumire;
    private String specializare;
    private int anInmatriculare;
    private int durataStudii;

    public FacultateFrecventa(String denumire, String specializare, int anInmatriculare, int durataStudii) {
        this.denumire = denumire;
        this.specializare = specializare;
        this.anInmatriculare = anInmatriculare;
        this.durataStudii = durataStudii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FacultateFrecventa{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", specializare='").append(specializare).append('\'');
        sb.append(", anInmatriculare=").append(anInmatriculare);
        sb.append(", durataStudii=").append(durataStudii);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaInfomratiiFacultate() {
        System.out.println(this.toString());
    }

    @Override
    public void afiseazaInformatiiStudent(Student stud) {
        System.out.println(this.toString());
        System.out.println(stud.toString());
    }
}
