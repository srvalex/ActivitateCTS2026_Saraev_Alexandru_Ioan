package saptamana_1.animals;

public class Lion extends Animal{

    private float weight;

    public Lion(String name, int age, float weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Lion: "+this.getName() +" has been fed the following: "+mancare);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Lion{").append("weight=").append(weight).append('}');
        return sb.toString();
    }
}
