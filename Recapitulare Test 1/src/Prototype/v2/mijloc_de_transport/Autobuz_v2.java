package Prototype.v2.mijloc_de_transport;

import Prototype.v1.mijloc_de_transport.Autobuz;

public class Autobuz_v2 implements MijlocDeTransport_v2{
    private String denumireLinie;
    private int capacitatePersoane;
    private String firmaTransport;
    private String brandAutobuz;

    public Autobuz_v2() {
        this.denumireLinie = "N/A";
        this.capacitatePersoane = 2;
        this.firmaTransport = "STB";
        this.brandAutobuz = "MAN";
    }

    public Autobuz_v2(String denumireLinie, int capacitatePersoane, String firmaTransport, String brandAutobuz) {

        if(!denumireLinie.equalsIgnoreCase("")) {
            this.denumireLinie = denumireLinie;
        }
        else {
            this.denumireLinie = "N/A";
        }

        if (capacitatePersoane > 2) {
            this.capacitatePersoane = capacitatePersoane;
        }
        else {
            this.capacitatePersoane = 2;
        }

        if (!firmaTransport.equalsIgnoreCase("")) {
            this.firmaTransport = firmaTransport;
        }
        else {
            this.firmaTransport = "STB";
        }
        if(!firmaTransport.equalsIgnoreCase("")) {
            this.brandAutobuz = brandAutobuz;
        }
        else this.brandAutobuz = "MAN";
    }

    public String getFirmaTransport() {
        return firmaTransport;
    }

    public void setFirmaTransport(String firmaTransport) {
        if (!firmaTransport.equalsIgnoreCase("")) {
            this.firmaTransport = firmaTransport;
        }
    }

    public String getBrandAutobuz() {
        return brandAutobuz;
    }

    public void setBrandAutobuz(String brandAutobuz) {
        if(!firmaTransport.equalsIgnoreCase("")) {
            this.brandAutobuz = brandAutobuz;
        }
    }

    public String getDenumireLinie() {
        return denumireLinie;
    }

    public void setDenumireLinie(String denumireLinie) {
        if(!denumireLinie.equalsIgnoreCase("")) {
            this.denumireLinie = denumireLinie;
        }
    }

    public int getCapacitatePersoane() {
        return capacitatePersoane;
    }

    public void setCapacitatePersoane(int capacitatePersoane) {
        if(capacitatePersoane > 2) {
            this.capacitatePersoane = capacitatePersoane;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz_v2{");
        sb.append("denumireLinie='").append(denumireLinie).append('\'');
        sb.append(", capacitatePersoane=").append(capacitatePersoane);
        sb.append(", firmaTransport='").append(firmaTransport).append('\'');
        sb.append(", brandAutobuz='").append(brandAutobuz).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocDeTransport_v2 clone() {
        Autobuz_v2 bus = new Autobuz_v2();
        bus.denumireLinie = this.denumireLinie;          //DEEP COPY
        bus.capacitatePersoane = this.capacitatePersoane;//DEEP COPY
        bus.firmaTransport = this.firmaTransport;        //DEEP COPY
        bus.brandAutobuz = this.brandAutobuz;            //DEEP COPY
//        Autobuz bus = this;                            //Shallow copy
        return bus;
    }
}
