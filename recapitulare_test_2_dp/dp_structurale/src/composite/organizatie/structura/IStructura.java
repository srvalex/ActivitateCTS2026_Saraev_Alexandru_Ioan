package composite.organizatie.structura;

public interface IStructura {
    public void afiseazaIerarhie();
    public void adaugaNod(IStructura nod);
    public IStructura getNod(int pozitie);
    public void eliminaNod(int pozitie);
}
