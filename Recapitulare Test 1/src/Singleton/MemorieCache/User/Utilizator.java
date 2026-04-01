package Singleton.MemorieCache.User;

import java.util.ArrayList;
import java.util.List;

public class Utilizator {

    private String nume;
    private int varsta;
    private String job;
    private List<String> animaleCompanie;


    public Utilizator(String nume, int varsta, String job) {
        this.nume = nume;
        this.varsta = varsta;
        this.job = job;
        this.animaleCompanie = new ArrayList<>();
    }

    public void adaugaAnimalCompanie(String numeAnimal) {
        animaleCompanie.add(numeAnimal);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<String> getAnimaleCompanie() {
        return animaleCompanie;
    }

    public void setAnimaleCompanie(List<String> animaleCompanie) {
        this.animaleCompanie = animaleCompanie;
    }
}
