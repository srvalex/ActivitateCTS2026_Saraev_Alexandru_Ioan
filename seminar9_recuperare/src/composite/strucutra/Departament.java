package composite.strucutra;

import java.util.ArrayList;
import java.util.List;

public class Departament implements StructuraSpital{

    private String denumireDepartament;
    private List<StructuraSpital> subStructuri;

    public Departament(String denumireDepartament) {
        this.denumireDepartament = denumireDepartament;
        this.subStructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaPersonal() {
        System.out.println("Denumire departament: " + this.denumireDepartament);
        for(StructuraSpital struct: subStructuri){
            struct.afiseazaPersonal();
        }
    }

    public void adaugaStructura(StructuraSpital structuraSpital) {
        subStructuri.add(structuraSpital);
    }

    public void stergeStructura(int pozitieDeSters) {
        subStructuri.remove(pozitieDeSters);
    }

    public StructuraSpital getStructura(int pozitie) {
        return subStructuri.get(pozitie);
    }
}
