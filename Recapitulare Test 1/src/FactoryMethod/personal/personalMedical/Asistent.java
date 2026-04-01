package FactoryMethod.personal.personalMedical;

import FactoryMethod.personal.PersonalSpital;

public class Asistent implements PersonalSpital {
    private String nume;
    private int nrOreLucrate;
    private int salariu;
    private int nrAniStudii;

    public Asistent(String nume, int nrOreLucrate, int salariu, int nrAniStudii) {
        this.nume = nume;
        this.nrOreLucrate = nrOreLucrate;
        this.salariu = salariu;
        this.nrAniStudii = nrAniStudii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrOreLucrate=").append(nrOreLucrate);
        sb.append(", salariu=").append(salariu);
        sb.append(", nrAniStudii=").append(nrAniStudii);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisazaInformatii() {
        System.out.println(this.toString());
    }
}
