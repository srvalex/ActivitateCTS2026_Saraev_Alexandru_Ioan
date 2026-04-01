package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static int VALOARE_FINANTARE_ANGAJAT = 20;

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();

    }

    public static void setValoareFinantareAngajat(int valoareFinantareAngajat) {
        VALOARE_FINANTARE_ANGAJAT = valoareFinantareAngajat;
    }


    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(super.toString()).append("Angajat{");
        sb.append("ocupatie='").append(ocupatie).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    public void afisareFinantare() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Angajat.VALOARE_FINANTARE_ANGAJAT + " Euro/zi in proiect.");
    }

}
