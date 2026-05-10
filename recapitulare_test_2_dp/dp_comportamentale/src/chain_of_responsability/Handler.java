package chain_of_responsability;

public abstract class Handler {
    private Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public Handler getSuccesor() {
        return succesor;
    }

    abstract void trimiteNotificare(Abonat abonat);
}
