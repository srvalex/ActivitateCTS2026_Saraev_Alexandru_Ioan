package strategy.AlgoritmSortare;

import java.util.List;

public class BubbleSort implements AlgoritmSortare{
    @Override
    public void sort(List<Integer> listaNumere) {
        System.out.println("Bubble Sort!");
        listaNumere.stream().sorted((a,b) -> a > b ? 1 : -1).forEach(a -> System.out.print(a + " "));
        System.out.println();
    }
}
