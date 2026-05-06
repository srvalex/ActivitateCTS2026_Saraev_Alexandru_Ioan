package Observer.spital;

public class Pacient implements Notificare{
    private String nume;
    private String denumireSectie;
    private String denumireAfectiune;
    private int durataInternare;


    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + this.nume + " a primit mesajul: " +mesaj);
    }

    public Pacient(String nume, String denumireSectie, String denumireAfectiune, int durataInternare) {
        this.nume = nume;
        this.denumireSectie = denumireSectie;
        this.denumireAfectiune = denumireAfectiune;
        this.durataInternare = durataInternare;
    }
}
