package factory_method.main;

import factory_method.enums.TipDesert;
import factory_method.enums.TipSupa;
import factory_method.factory.FabricaAbstracta;
import factory_method.factory.FabricaDesert;
import factory_method.factory.FabricaSupa;
import factory_method.restaurant.FelMancare;
import factory_method.restaurant.supa.Supa;
import factory_method.restaurant.supa.SupaDeCiuperci;

public class Main {
    public static void main(String[] args) {
        FabricaAbstracta fabricaDesert = new FabricaDesert();
        FabricaAbstracta fabricaSupa = new FabricaSupa();
        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.SUPA_DE_CIUPERCI,15.5f,400);
        FelMancare supaVita = fabricaSupa.getFelMancare(TipSupa.SUPA_DE_VITA,21.99f,450);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI,24.99f,250,650);
        FelMancare cheeseCake = fabricaDesert.getFelMancare(TipDesert.CHEESECAKE,28.99f,150,650);

        supaCiuperci.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        papanasi.afiseazaDescriere();
        cheeseCake.afiseazaDescriere();
    }
}
