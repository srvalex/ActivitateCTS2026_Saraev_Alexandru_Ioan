package facade.ingrediente;

public class Carne {
    private String animal;
    private String parteAnatomica;
    private int masa;

    public Carne(String animal, String parteAnatomica, int masa) {
        this.animal = animal;
        this.parteAnatomica = parteAnatomica;
        this.masa = masa;
    }

    public String getAnimal() {
        return animal;
    }

    public int getMasa() {
        return masa;
    }
    public void condimenteazaCarne(String denumirePreparat) {
        System.out.println("Carnea de " + this.animal + " a fost condimentata pentru " +denumirePreparat);
    }

    public void gatesteCarne(String denumirePreparat) {
        System.out.println("Carnea a fost gatita pentru " +denumirePreparat);
    }
    public void aplicaSosPeCarne(Sos sos) {
        System.out.println("Peste carne s-a pus extra " +sos.getDenumireSos());
    }
}
