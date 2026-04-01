package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;
    private static int VALOARE_FINANTARE_STUDENT;


    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }


    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.an_studii = an_studii;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Student{");
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", an_studii=").append(an_studii);
        sb.append('}');
        return sb.toString();
    }

    public static void setValoareFinantareStudent(int valoareFinantareStudent) {
        VALOARE_FINANTARE_STUDENT = valoareFinantareStudent;
    }

    public void afisareFinantare() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + Student.VALOARE_FINANTARE_STUDENT + " Euro/zi in proiect.");
    }

}
