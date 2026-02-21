package saptamana_1.main;

import saptamana_1.admin.Zoo;
import saptamana_1.admin.Zookeeper;
import saptamana_1.animals.Lion;
import saptamana_1.animals.Zebra;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String []args) {
        Zookeeper zookeeper = new Zookeeper("Mărgelatu");
        Zoo zoo = new Zoo("Madagascar Cast",zookeeper);
        Lion firstLion = new Lion("Alex",4,175.5f);
        Zebra fisrtZebra = new Zebra("Marty",4,19);
        zoo.adaugaAnimal(firstLion);
        zoo.adaugaAnimal(fisrtZebra);
        List<String> foodList = new ArrayList<>();
        foodList.add("Carne de zebra");
        foodList.add("Fân");
        zoo.feedAnimals(foodList);
    }
}
