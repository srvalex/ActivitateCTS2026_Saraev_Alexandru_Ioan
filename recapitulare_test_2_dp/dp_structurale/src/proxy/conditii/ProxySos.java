package proxy.conditii;

public class ProxySos implements IMeniu{

    private IMeniu shaorma;

    public ProxySos(IMeniu shaorma) {
        this.shaorma = shaorma;
    }

    @Override
    public void afisareMeniu() {
        if(this.shaorma.isAreSos())
            shaorma.afisareMeniu();
        else System.out.println("Aici se mananca doar shaorme cu sos");
    }

    @Override
    public boolean isAreSos() {
        return this.shaorma.isAreSos();
    }

    @Override
    public boolean isAreCeapa() {
        return this.shaorma.isAreCeapa();
    }
}
