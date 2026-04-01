package prototype.clase;

public class RezervareNoua implements RezervareAbstracta{

    private String numeClient;
    private int oraRezervare;
    private int ziRezervare;
    private String numarTelefon;

    public void setZiRezervare(int ziRezervare) {
        if(ziRezervare > 0 && ziRezervare < 32) {
            this.ziRezervare = ziRezervare;
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare > 8 && oraRezervare <24) {
            this.oraRezervare = oraRezervare;
        }
    }

    public RezervareNoua(String numeClient, int oraRezervare, int ziRezervare, String numarTelefon) {
        if(numeClient.length() > 1) {
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "John";
        }

        if(oraRezervare > 9 && oraRezervare < 23) {
            this.oraRezervare = oraRezervare;
        }
        else {
            this.oraRezervare = 9;
        }

        if(ziRezervare < 32 && ziRezervare > 0) {
            this.ziRezervare = ziRezervare;
        }
        else {
            this.ziRezervare = 1;
        }
        if(numarTelefon.length() == 10) {
            this.numarTelefon = numarTelefon;
        }
        else {
            this.numarTelefon = "0799999999";
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareNoua{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziRezervare=").append(ziRezervare);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private RezervareNoua() {
    }

    @Override
    public RezervareAbstracta clone() {
        RezervareNoua rezervareNoua = new RezervareNoua();
        rezervareNoua.numarTelefon = this.numarTelefon;
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziRezervare = this.ziRezervare;
        return rezervareNoua;
    }
}
