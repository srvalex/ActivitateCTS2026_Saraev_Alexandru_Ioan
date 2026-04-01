package Seminar_4.Singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instanta = null;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    private Logger(String sender, String categorie) {
        this.cod = 1;
        this.sender = sender;
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Logger{");
        sb.append("cod=").append(cod);
        sb.append(", sender='").append(sender).append('\'');
        sb.append(", categorie='").append(categorie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void afiseazaLog(String mesaj,String categorie) {
        StringBuilder sb = new StringBuilder();
        sb.append("Log cu ID: ").append(this.cod)
                .append("; categorie: ").append(categorie)
                .append(" efectuat de utilizatorul ").append(sender)
                .append(" si a trimis mesajul: ").append(mesaj);
        this.cod++;
        System.out.println(sb.toString());
    }

    public static synchronized Logger getInstanta(String sender,String categorie) {
        if (instanta == null) {
            instanta = new Logger(sender,categorie);
        }
        return instanta;
    }
}
