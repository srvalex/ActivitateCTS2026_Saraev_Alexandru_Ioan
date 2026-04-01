package Singleton.MemorieCache.Main;

import Singleton.MemorieCache.Cache.CacheMemory;
import Singleton.MemorieCache.User.Utilizator;

public class main {
    public static void main(String[] args) {

        Utilizator u1 = new Utilizator("Alex",21,"DA");
        Utilizator u2 = new Utilizator("Aky",21,"Agent de turism");
        Utilizator u3 = new Utilizator("Philipe",21,"Project Manager");

        u1.adaugaAnimalCompanie("Ratusca de cauciuc");

        u2.adaugaAnimalCompanie("Briosa");
        u2.adaugaAnimalCompanie("Negroica");

        u3.adaugaAnimalCompanie("Perry Ornitorincul");

        CacheMemory cacheMemory = CacheMemory.getCacheMemoryIntance("Core I9 9900X",16.8f);
        CacheMemory cacheMemory1 = CacheMemory.getCacheMemoryIntance();



        cacheMemory.storeData(u1.getAnimaleCompanie());
        cacheMemory.storeData(u2.getAnimaleCompanie());
        cacheMemory.storeData(u3.getAnimaleCompanie());


        Object neededItem = cacheMemory.popDataFromCache(2);
        System.out.println(neededItem.toString());

        System.out.println(cacheMemory.toString());
        System.out.println(cacheMemory1.toString());
    }
}
