package factory_method.restaurant.desert;

import factory_method.restaurant.FelMancare;

public class CheeseCake extends Desert implements FelMancare {

    private String topping;

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public CheeseCake(float pret, int gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cheesecake-ul este cu ").append(topping).append(" si are ").append(super.toString());
        System.out.println(sb.toString());
    }
}
