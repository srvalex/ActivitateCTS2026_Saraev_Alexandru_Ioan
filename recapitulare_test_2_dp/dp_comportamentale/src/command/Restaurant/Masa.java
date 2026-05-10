package command.Restaurant;

public class Masa{
    private int numarLocuri;

    public Masa(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public void ocupaMasa (boolean privelisteLac) {
        System.out.println("Masa cu "+ this.numarLocuri + "locuri se ocupa; Clientul" +
                (privelisteLac ? " " : " nu ") + "a ales privelistea inspre lac"
        );
    }
    public void rezervaMasa (boolean privelisteGradina) {
        System.out.println("Masa cu "+ this.numarLocuri + "locuri se ocupa; Clientul" +
                (privelisteGradina ? " " : " nu ") + "a ales privelistea inspre lac"
        );
    }
}
