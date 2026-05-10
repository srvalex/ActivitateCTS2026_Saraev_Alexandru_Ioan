package strategy.AlgoritmSortare;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GUI interfataUser = new GUI();
        List<Integer> listaNumere =  new ArrayList<>();
        listaNumere.add(1);
        listaNumere.add(4);
        listaNumere.add(-5);
        listaNumere.add(0);
        listaNumere.add(29);
        listaNumere.add(-45);
        listaNumere.add(2);
        interfataUser.sorteazaLista(listaNumere);
        interfataUser.setAlgoritmSortare(new RadixSort());
        interfataUser.sorteazaLista(listaNumere);


    }
}
