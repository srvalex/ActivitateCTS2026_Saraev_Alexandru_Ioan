package chain_of_responsability.mijloc_transport;

public class CalatorieTroleibuz extends ChainHandler{


    @Override
    public String recomandareCalatorie(int distantaCalatorie) {
        if(distantaCalatorie > 3)
            return this.succesor.recomandareCalatorie(distantaCalatorie);
        StringBuilder sb = new StringBuilder("Va recomandam sa folositi troleibuzul. Distanta parcursa este de ");
        sb.append(distantaCalatorie).append(" km");
        return sb.toString();
    }
}
