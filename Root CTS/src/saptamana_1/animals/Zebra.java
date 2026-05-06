package saptamana_1.animals;

public class Zebra extends Animal{

    private int lungimeCoada;

    public Zebra(String name, int age,int lungimeCoada) {
        super(name, age);
        this.lungimeCoada = lungimeCoada;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra: "+this.getName() +" has been fed the following: "+mancare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Zebra{").append("lungimeCoada=").append(lungimeCoada).append('}');
        return sb.toString();
    }
}
