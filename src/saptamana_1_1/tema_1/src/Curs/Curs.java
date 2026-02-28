package Curs;

import persoane.Profesor;
import persoane.Student;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int nrCredite;
    private Profesor profesor;
    private List<Student> listaStudenti;

    public Curs(String numeCurs, int nrCredite, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.nrCredite = nrCredite;
        this.profesor = profesor;
        this.listaStudenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getNrCredite() {
        return nrCredite;
    }
    public void adaugaStudent(Student student) {
        listaStudenti.add(student);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curs{");
        sb.append("numeCurs='").append(numeCurs).append('\'');
        sb.append(", nrCredite=").append(nrCredite);
        sb.append(", profesor=").append(profesor);
        sb.append(", listaStudenti=").append(listaStudenti);
        sb.append('}');
        return sb.toString();
    }
}
