package command.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<IComanda> listaComenzi;
    String denmireReceptioner;

    public Operator(String denmireReceptioner) {
        this.denmireReceptioner = denmireReceptioner;
        listaComenzi = new ArrayList<>();
    }

    public void executaComanda() {
        if(listaComenzi.size() > 0) {
            listaComenzi.getFirst().pregatesteMasa();
            listaComenzi.removeFirst();
        }
    }
    public void adaugaComandaInCoada(IComanda comanda) {
        this.listaComenzi.add(comanda);
    }
}
