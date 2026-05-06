package command.autobaza;

import java.util.ArrayList;
import java.util.List;

public class Operator {


    private List<Comanda> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(Comanda comanda) {
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(listaComenzi.size() > 0) {
            listaComenzi.getFirst().trimiteInCursa();
            listaComenzi.removeFirst();
        }
    }

        //stragey observer chain si command

}
