package factory_method.restaurant.desert;

import factory_method.restaurant.FelMancare;

public class Papanasi extends Desert implements FelMancare {

    private String tipDulceata;

    public Papanasi(float pret, int gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    public void setTipDulceata(String tipDulceata) {
        this.tipDulceata = tipDulceata;
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Papanasii au smantana si dulceata de ").append(tipDulceata).append(" si are ").append(super.toString());
        System.out.println(sb.toString());
    }
}
