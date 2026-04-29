package Cafenea.factory;

import Cafenea.bauturi.Bautura;
import Cafenea.bauturi.Cafea;
import Cafenea.bauturi.Ceai;
import Cafenea.bauturi.CiocolataCalda;

public class FabricaBauturi {


    public Bautura getBautura(TIP_BAUTURA tip, String denumire, int volum,float pret) {
        switch (tip) {
            case TIP_BAUTURA.CAFEA: return new Cafea(denumire, volum, pret);
            case TIP_BAUTURA.CEAI: return new Ceai(denumire, volum, pret);
            case TIP_BAUTURA.CIOCOLATA_CALDA: return new CiocolataCalda(denumire, volum, pret);
            default: return null;
        }
    }
}
