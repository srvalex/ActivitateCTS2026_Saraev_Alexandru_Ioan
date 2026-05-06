package Command.Spial;

import Command.Internare.Comanda;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> listaComenzi = new ArrayList<>();


    public void inregistreazaComanda(Comanda comanda) {
        listaComenzi.add(comanda);
    }

    public void executaCoada() {
        if(listaComenzi.size() > 0) {
            listaComenzi.getFirst().executa();
            listaComenzi.removeFirst();
        }
    }

}
