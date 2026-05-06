package Proxy.clase;

public class AutobuzCursaSpeciala implements IAutobuz{

    private IAutobuz autobuzCursaSpeciala;

    public AutobuzCursaSpeciala(IAutobuz autobuzCursaSpeciala) {
        this.autobuzCursaSpeciala = autobuzCursaSpeciala;
    }

    @Override
    public void opresteInStatie() {
        if(autobuzCursaSpeciala.getNumarLinie().toLowerCase().contains("special")) {
            System.out.println("Autobuzul nu opreste in nicio statie; Este in cursa speciala");
        }
        else {
            autobuzCursaSpeciala.opresteInStatie();
        }
    }

    @Override
    public int getNumarCalatori() {
        return this.autobuzCursaSpeciala.getNumarCalatori();
    }

    @Override
    public String getNumarLinie() {
        return this.autobuzCursaSpeciala.getNumarLinie();
    }
}
