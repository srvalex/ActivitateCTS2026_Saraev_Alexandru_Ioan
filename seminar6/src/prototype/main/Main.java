package prototype.main;

import prototype.clase.RezervareAbstracta;
import prototype.clase.RezervareNoua;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rezervare = new RezervareNoua("Nea Nicu",19,14,"0770358124");
        RezervareAbstracta rezervareRecurenta = rezervare.clone();
        System.out.println(rezervare.toString());
        ((RezervareNoua)rezervareRecurenta).setZiRezervare(21);
        ((RezervareNoua)rezervareRecurenta).setOraRezervare(20);
        System.out.println(rezervareRecurenta.toString());
    }
}
