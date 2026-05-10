package strategy.AlgoritmSortare;

import java.util.List;

public class GUI {
    private AlgoritmSortare algoritmSortare;

    public GUI() {
        this.algoritmSortare = new BubbleSort();
    }

    public void setAlgoritmSortare(AlgoritmSortare algoritmSortare) {
        this.algoritmSortare = algoritmSortare;
    }
    public void sorteazaLista(List<Integer> listaNumere) {
        algoritmSortare.sort(listaNumere);
    }
}
