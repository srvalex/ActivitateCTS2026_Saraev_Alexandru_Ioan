package strategy.main;

import strategy.examen.ExamenGrila;
import strategy.examen.ExamenScris;
import strategy.examen.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.examinare();
        student.setModSustinere(new ExamenGrila());
        student.examinare();
        student.setModSustinere(new ExamenScris());
        student.examinare();

    }
}
