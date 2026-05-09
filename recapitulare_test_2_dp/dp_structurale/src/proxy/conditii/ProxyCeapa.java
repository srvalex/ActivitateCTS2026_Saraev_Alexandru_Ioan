package proxy.conditii;

public class ProxyCeapa implements IMeniu{

    private IMeniu shaorma;

    public ProxyCeapa(IMeniu shaorma) {
        this.shaorma = shaorma;
    }

    @Override
    public void afisareMeniu() {
        if(!this.shaorma.isAreCeapa())
        {
            this.shaorma.afisareMeniu();
        }
        else System.out.println("Aici nu se manaca shaorma cu ceapa");
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
