package Seminar_4.Factory.transport.mijloaceTransport;

import Seminar_4.Factory.transport.mijloaceTransport.MijlocTransport;


public class Autobuz implements MijlocTransport{
    private String denumireProducator;
    private Integer nrLinie;

    public Autobuz(String denumireProducator, Integer nrLinie) {
        this.denumireProducator = denumireProducator;
        this.nrLinie = nrLinie;
    }

    public String getDenumireProducator() {
        return denumireProducator;
    }

    public void setDenumireProducator(String denumireProducator) {
        this.denumireProducator = denumireProducator;
    }

    public Integer getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void afiseazaTipMijlocTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul produs de ").append(this.denumireProducator)
                .append(" se deplaseaza pe linia ").append(this.nrLinie);
        System.out.println(sb.toString());
    }
}
