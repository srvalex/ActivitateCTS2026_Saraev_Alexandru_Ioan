package drone_autonome.prototype.clase;

public class ModulAI extends AutonomousDriving implements IPrototype, Cloneable{
    private Integer viteza;
    private float costDezvoltare;

    public ModulAI(String version, Integer viteza, float costDezvoltare) throws InterruptedException {
        super(version);
        this.viteza = viteza;
        this.costDezvoltare = costDezvoltare;
    }

    public ModulAI(String version) throws InterruptedException {
        super(version);
    }



    @Override
    public void applyRule(int index, String context) {
        System.out.println("S-a trimis indexul "+index +" si are contextul: "+context);
    }

    public Integer getViteza() {
        return viteza;
    }

    public void setViteza(Integer viteza) {
        this.viteza = viteza;
    }

    public float getCostDezvoltare() {
        return costDezvoltare;
    }

    public void setCostDezvoltare(float costDezvoltare) {
        this.costDezvoltare = costDezvoltare;
    }

    @Override
    public IPrototype clone(int viteza,float costDezvoltare) throws InterruptedException, CloneNotSupportedException {
        ModulAI versiuneNoua = null;
        versiuneNoua = (ModulAI) super.clone();
        versiuneNoua.costDezvoltare = costDezvoltare;
        versiuneNoua.viteza = viteza;
        return versiuneNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModulAI{");
        sb.append("viteza=").append(viteza);
        sb.append(", costDezvoltare=").append(costDezvoltare);
        sb.append('}');
        return sb.toString();
    }

}
