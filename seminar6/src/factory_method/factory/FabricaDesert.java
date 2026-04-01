package factory_method.factory;

import factory_method.enums.TipDesert;
import factory_method.enums.TipMancare;
import factory_method.restaurant.FelMancare;
import factory_method.restaurant.desert.CheeseCake;
import factory_method.restaurant.desert.Papanasi;

public class FabricaDesert implements FabricaAbstracta{

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, int gramaj) {
        return this.getFelMancare(tipMancare,pret,gramaj,500);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, int gramaj, int calorii) {
        if(tipMancare == TipDesert.CHEESECAKE){
            return new CheeseCake(pret,gramaj,calorii);
        }
        else if (tipMancare == TipDesert.PAPANASI) {
            return new Papanasi(pret, gramaj, calorii);
        }
        else return null;
    }
}
