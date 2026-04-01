package factory_method.factory;

import factory_method.enums.TipMancare;
import factory_method.enums.TipSupa;
import factory_method.restaurant.FelMancare;
import factory_method.restaurant.supa.Supa;
import factory_method.restaurant.supa.SupaDeCiuperci;
import factory_method.restaurant.supa.SupaDeVita;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, int gramaj) {
        if(tipMancare == TipSupa.SUPA_DE_CIUPERCI) {
            return new SupaDeCiuperci(pret, gramaj);
        }
        else if (tipMancare == TipSupa.SUPA_DE_VITA) {
            return new SupaDeVita(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, int gramaj, int calorii) {
        return getFelMancare(tipMancare, pret, gramaj);
    }
}
