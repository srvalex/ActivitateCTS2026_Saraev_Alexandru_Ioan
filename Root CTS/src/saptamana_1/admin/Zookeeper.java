package saptamana_1.admin;

import saptamana_1.animals.Animal;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }



    public void feedAnimal(Animal animal,String food) {
        System.out.println(this.name + " has fed");
        animal.eat(food);

    }
}
