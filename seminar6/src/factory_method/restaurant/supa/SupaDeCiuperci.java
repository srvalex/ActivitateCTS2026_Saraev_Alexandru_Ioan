package factory_method.restaurant.supa;

import factory_method.restaurant.FelMancare;

public class SupaDeCiuperci extends Supa implements FelMancare {
    public SupaDeCiuperci(float pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de ciuperci are ").append(super.toString());
        System.out.println(sb.toString());
    }
}
