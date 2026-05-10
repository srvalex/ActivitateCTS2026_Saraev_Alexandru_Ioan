package chain_of_responsability;

public class Abonat {
    private String nume;
    private String adresaEmail;
    private String numarTelefon;
    private String poBox;

    public Abonat(String nume) {
        this.nume = nume;
        this.adresaEmail = "";
        this.numarTelefon = "";
        this.poBox = "";
    }

    public Abonat setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
        return this;
    }

    public Abonat setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
        return this;
    }

    public Abonat setPoBox(String poBox) {
        this.poBox = poBox;
        return this;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getPoBox() {
        return poBox;
    }
}
