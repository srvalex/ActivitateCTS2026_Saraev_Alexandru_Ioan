package Prototype.v1.mijloc_de_transport;

import Prototype.v1.Prototip.ITransport;

public class Autobuz extends MijlocDeTransport{

    private String firmaTransport;
    private String brandAutobuz;

    public Autobuz(String denumireLinie, int capacitatePersoane, String firmaTransport, String brandAutobuz) {
        super(denumireLinie, capacitatePersoane);
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

    public Autobuz() {
        super();
        this.firmaTransport = "STB";
        this.brandAutobuz = "MAN";
    }

    @Override
    public MijlocDeTransport clone() {
        Autobuz bus = new Autobuz();
        bus.denumireLinie = this.denumireLinie;          //DEEP COPY
        bus.capacitatePersoane = this.capacitatePersoane;//DEEP COPY
        bus.firmaTransport = this.firmaTransport;        //DEEP COPY
        bus.brandAutobuz = this.brandAutobuz;            //DEEP COPY

//        Autobuz bus = this;                            //Shallow copy
        return bus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Autobuz{");
        sb.append("firmaTransport='").append(firmaTransport).append('\'');
        sb.append(", brandAutobuz='").append(brandAutobuz).append('\'');
        sb.append('}');
        return sb.toString();
    }


//    @Override
//    public ITransport clone() {
//        Autobuz bus = new Autobuz();
//        bus.denumireLinie = this.denumireLinie;          //DEEP COPY
//        bus.capacitatePersoane = this.capacitatePersoane;//DEEP COPY
//        bus.firmaTransport = this.firmaTransport;        //DEEP COPY
//        bus.brandAutobuz = this.brandAutobuz;            //DEEP COPY
//
////        Autobuz bus = this;                            //Shallow copy
//        return bus;
//    }
}
