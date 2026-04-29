package decorator.nota_de_plata;

public class NotaPlata implements NotaPlataAbstract{
    private float valoareNota;
    private String numarMasa;

    public NotaPlata(float valoareNota, String numarMasa) {
        this.valoareNota = valoareNota;
        this.numarMasa = numarMasa;
    }

    public float getValoareNota() {
        return valoareNota;
    }

    public void setValoareNota(float valoareNota) {
        this.valoareNota = valoareNota;
    }

    public String getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(String numarMasa) {
        this.numarMasa = numarMasa;
    }

    @Override
    public void printeazaNotaDePlata() {
        StringBuilder sb = new StringBuilder("Multumim mult pentru incredere! Total comanda masa nr. ").append(this.numarMasa)
                        .append(" = ").append(this.valoareNota);
        System.out.println(sb.toString());
    }
}
