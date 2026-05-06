package Proxy.clase;

public class AutobuzDeNoapte implements IAutobuz{

    private IAutobuz proxyAutobuz;

    public AutobuzDeNoapte(IAutobuz proxyAutobuz) {
        this.proxyAutobuz = proxyAutobuz;
    }

    public void setProxyAutobuz(IAutobuz proxyAutobuz) {
        this.proxyAutobuz = proxyAutobuz;
    }

    @Override
    public void opresteInStatie() {
        System.out.println(
                this.proxyAutobuz.getNumarCalatori() == 0 ? "Autobuzul este gol. Se retrage la autobaza" : "Autobuzul isi continua calatoria"
        );

    }

    @Override
    public int getNumarCalatori() {
        return proxyAutobuz.getNumarCalatori();
    }

    @Override
    public String getNumarLinie() {
        return proxyAutobuz.getNumarLinie();
    }
}
