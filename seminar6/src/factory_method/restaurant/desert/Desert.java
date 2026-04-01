package factory_method.restaurant.desert;

public abstract class Desert {
    protected float pret;
    protected int gramaj;
    protected int calorii;

    public Desert(float pret, int gramaj, int calorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
