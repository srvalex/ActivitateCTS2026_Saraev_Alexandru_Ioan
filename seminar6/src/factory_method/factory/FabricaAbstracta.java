package factory_method.factory;

import factory_method.enums.TipMancare;
import factory_method.restaurant.FelMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare,float pret,int gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare,float pret,int gramaj, int calorii);
}
