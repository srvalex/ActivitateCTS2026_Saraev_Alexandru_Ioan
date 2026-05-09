package flyweight.main;

import flyweight.facultate.FacultateFrecventa;
import flyweight.facultate.FlyweightFactory;
import flyweight.facultate.IFacultate;
import flyweight.facultate.Student;

public class Main {
    public static void main(String[] args) {
        Student stud = new Student(1,"Alex");
        FlyweightFactory fabrica = new FlyweightFactory();

        fabrica.adaugaFacultate("CSIE","ASE",2023,3);
        IFacultate CSIE = fabrica.getFaculate("CSIE");
        CSIE.afiseazaInformatiiStudent(stud);
    }
}
