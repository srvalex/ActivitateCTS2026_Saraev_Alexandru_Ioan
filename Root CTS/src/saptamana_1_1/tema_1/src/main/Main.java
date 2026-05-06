package main;

import Curs.Curs;
import persoane.Persoana;
import persoane.Profesor;
import persoane.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args) {
        System.out.println("Main ruleaza");
        Profesor profesorPrincipal = new Profesor("Sorinel",59,4);
        Curs cursPrincipal = new Curs("CTS",5,profesorPrincipal);
        cursPrincipal.adaugaStudent(new Student("Marinel",19,1));
        cursPrincipal.adaugaStudent(new Student("Bobinel",21,2));
        cursPrincipal.adaugaStudent(new Student("Alinush",22,3));
        System.out.println(cursPrincipal.toString());
        }
}
