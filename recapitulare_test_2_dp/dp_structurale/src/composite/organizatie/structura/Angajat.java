package composite.organizatie.structura;

public class Angajat implements IStructura{
    private String denumireAngajat;

    public Angajat(String denumireAngajat) {
        this.denumireAngajat = denumireAngajat;
    }

    @Override
    public void afiseazaIerarhie() {
        System.out.print(this.denumireAngajat);
    }

    @Override
    public void adaugaNod(IStructura nod) {
        System.out.println("Nu poti folosi metoda asta");
    }

    @Override
    public IStructura getNod(int pozitie) {
        return this;
    }

    @Override
    public void eliminaNod(int pozitie) {
        System.out.println("Nu poti folosi metoda asta");
    }
}
