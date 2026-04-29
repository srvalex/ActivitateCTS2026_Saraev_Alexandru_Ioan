package Proxy.internare;

import Proxy.pacient.Pacient;

public class Spital implements ISpital{

    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public void internarePacient(Pacient pacient) {
        System.out.println("Pacientul " + pacient.toString() + " a fost internat");
    }
}
