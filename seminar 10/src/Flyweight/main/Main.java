package Flyweight.main;

import Flyweight.clase.Autobuz;
import Flyweight.clase.FabricaLinii;
import Flyweight.clase.Linie;
import Flyweight.clase.LinieTransport;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("mercedes bus",45,2009);
        FabricaLinii fabricaLinii = new FabricaLinii();
        fabricaLinii.adaugaLinei(102,"CFR PROGRESUL","Complext Pantelimon");
        LinieTransport linieTransport102 = fabricaLinii.getLinie(102);
        linieTransport102.afiseazaInformatiiAutobuz(autobuz);
        linieTransport102.afiseazaNumarCalatoriTraseu(autobuz);




    }
}
