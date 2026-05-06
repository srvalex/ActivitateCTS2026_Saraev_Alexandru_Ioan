package saptamana_1.admin;

import saptamana_1.animals.Animal;
import saptamana_1.animals.Lion;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String zooName;
    private Zookeeper zooKeeper;
    private List<Animal> listaAnimale;

    public Zoo(String zooName, Zookeeper zooKeeper) {
        this.zooName = zooName;
        this.zooKeeper = zooKeeper;
        listaAnimale = new ArrayList<>();
    }

    public void feedAnimals(List<String> foodList) {
        for(int i=0; i< foodList.size();i++)
            zooKeeper.feedAnimal(listaAnimale.get(i), foodList.get(i));
    }

    public void adaugaAnimal(Animal animal) {
        this.listaAnimale.add(animal);
    }
}
