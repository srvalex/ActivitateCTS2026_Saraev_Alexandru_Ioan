package Flyweight.clase;

public class Autobuz {
    private String model;
    private int numarCalatori;
    private int anFacbricatie;


    public Autobuz(String model, int numarCalatori, int anFacbricatie) {
        this.model = model;
        this.numarCalatori = numarCalatori;
        this.anFacbricatie = anFacbricatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numarCalatori=").append(numarCalatori);
        sb.append(", anFacbricatie=").append(anFacbricatie);
        sb.append('}');
        return sb.toString();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumarCalatori() {
        return numarCalatori;
    }

    public void setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
    }

    public int getAnFacbricatie() {
        return anFacbricatie;
    }

    public void setAnFacbricatie(int anFacbricatie) {
        this.anFacbricatie = anFacbricatie;
    }
}
