package adapter.AdapterClase.Limba;

public class Engleza {
    private int numarCuvinte;
    private int varstaLimba;

    public Engleza(int numarCuvinte, int varstaLimba) {
        this.numarCuvinte = numarCuvinte;
        this.varstaLimba = varstaLimba;
    }

    public Engleza(Engleza eng) {
        this.numarCuvinte = eng.getNumarCuvinte();
        this.varstaLimba = eng.varstaLimba;
    }

    public int getNumarCuvinte() {
        return numarCuvinte;
    }

    public int getVarstaLimba() {
        return varstaLimba;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
    public void sayThankYou() {
        System.out.println("Thank you!");
    }
}
