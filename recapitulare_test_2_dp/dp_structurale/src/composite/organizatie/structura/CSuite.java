package composite.organizatie.structura;

import java.util.ArrayList;
import java.util.List;

public class CSuite implements IStructura {
    private String denumire;
    private List<IStructura> listaDirectori;

    public CSuite(String denumire) {
        this.denumire = denumire;
        this.listaDirectori = new ArrayList<>();
    }

    @Override
    public void afiseazaIerarhie() {
        System.out.println(this.denumire);
        for(var dir:listaDirectori){
            System.out.print("   ");
            dir.afiseazaIerarhie();
            System.out.print("\n");
        }
    }

    @Override
    public void adaugaNod(IStructura nod) {
        listaDirectori.add(nod);
    }

    @Override
    public IStructura getNod(int pozitie) {
        return listaDirectori.get(pozitie);
    }

    @Override
    public void eliminaNod(int pozitie) {
        Director director = (Director) listaDirectori.get(pozitie);
        director.getListaAngajati().clear();
        listaDirectori.remove(pozitie);
    }
}
