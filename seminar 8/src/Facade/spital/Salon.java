package Facade.spital;

public class Salon {

    private static Salon instanta;

    private boolean[] vectorPaturiLibere = new boolean[8];

    private Salon(boolean[] vectorPaturiLibere) {
        this.vectorPaturiLibere = vectorPaturiLibere;
    }
    private Salon() {
        this.vectorPaturiLibere[0] = true;
        this.vectorPaturiLibere[5] = true;
        this.vectorPaturiLibere[1] = true;
        this.vectorPaturiLibere[6] = true;
    }

    public int patLiber() {
        for(int i=0;i<vectorPaturiLibere.length;i++)
         if(vectorPaturiLibere[i])
             return i;

        return -1;
    }

    public void ocupaPat(int nrPat) {
        this.vectorPaturiLibere[nrPat] = false;
    }

    public static Salon getInstance() {
        if(instanta == null) {
            instanta = new Salon();
            return instanta;
        }
        return instanta;
    }

    public static Salon getInstance(boolean[] vectorPaturiLibere) {
        if(instanta == null) {
            instanta = new Salon(vectorPaturiLibere);
            return instanta;
        }
        return instanta;
    }
}
