package composite.organizatie.structura;

import java.util.ArrayList;
import java.util.List;

public class Director implements IStructura{
    private String denumireDirector;
    private List<IStructura> listaAngajati;

    public List<IStructura> getListaAngajati() {
        return listaAngajati;
    }

    public Director(String denumireDirector) {
        this.denumireDirector = denumireDirector;
        this.listaAngajati = new ArrayList<>();
    }

    @Override
    public void afiseazaIerarhie() {
        System.out.println(this.denumireDirector);
        for(var angajat: listaAngajati)
        {
            System.out.print("   ");
            angajat.afiseazaIerarhie();
            System.out.print("\n");
        }
    }

    @Override
    public void adaugaNod(IStructura nod) {
        this.listaAngajati.add(nod);
    }

    @Override
    public IStructura getNod(int pozitie) {
        return listaAngajati.get(pozitie);
    }

    @Override
    public void eliminaNod(int pozitie) {
        listaAngajati.remove(pozitie);
    }
}
