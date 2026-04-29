package Cafenea.comanda;

import Cafenea.bauturi.Bautura;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private static int contor = 1;

    private int id;
    private List<Bautura> listaBauturi;

    public int getId() {
        return id;
    }

    public List<Bautura> getListaBauturi() {
        return listaBauturi;
    }

    public Comanda() {
        this.id = contor;
        this.listaBauturi = new ArrayList<>();
        contor++;
    }

    public void adaugaBautura(Bautura bautura){
        this.listaBauturi.add(bautura);
    }

}
