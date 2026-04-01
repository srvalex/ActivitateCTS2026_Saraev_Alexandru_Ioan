package FactoryMethod.personal.personalNonMedical;

import FactoryMethod.personal.PersonalSpital;

public class Receptioner implements PersonalSpital {
    private String nume;
    private int nrOreLucrate;
    private int salariu;

    public Receptioner(String nume, int nrOreLucrate, int salariu) {
        this.nume = nume;
        this.nrOreLucrate = nrOreLucrate;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Receptioner{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrOreLucrate=").append(nrOreLucrate);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisazaInformatii() {
        System.out.println(this.toString());
    }
}
