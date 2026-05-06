package Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaLinii {
    private Map<Integer, LinieTransport> registruLinii;

    public FabricaLinii() {
        this.registruLinii = new HashMap<>();
    }

    public LinieTransport getLinie(int numarLinie) {
        return registruLinii.get(numarLinie);
    }

    public void adaugaLinei (int numarLinie, String statieStart,String statieFinal) {
        if(registruLinii.containsKey(numarLinie))
            System.out.println("Linia deja exista");
        else {
            registruLinii.put(numarLinie,new Linie(numarLinie,statieStart,statieFinal));
        }
    }


}
