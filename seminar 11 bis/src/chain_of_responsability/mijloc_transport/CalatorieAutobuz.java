package chain_of_responsability.mijloc_transport;

public class CalatorieAutobuz extends ChainHandler{


    @Override
    public String recomandareCalatorie(int distantaCalatorie) {
        if(distantaCalatorie > 5)
            return this.succesor.recomandareCalatorie(distantaCalatorie);
        return "Va recomandam sa folositi autobuzul. Distanta parcursa este de " + String.valueOf(distantaCalatorie);

    }
}
