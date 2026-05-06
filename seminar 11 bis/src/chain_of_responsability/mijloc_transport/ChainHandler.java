package chain_of_responsability.mijloc_transport;

public abstract class ChainHandler {
    protected ChainHandler succesor;

    public ChainHandler() {
        this.succesor = null;
    }

    public void setSuccesor(ChainHandler succesor) {
        this.succesor = succesor;
    }
    public abstract String recomandareCalatorie(int distantaCalatorie);
}
