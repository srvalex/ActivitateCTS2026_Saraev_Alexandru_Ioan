package command.Restaurant;

public class MasaRezervata implements IComanda{
    private Masa masaOcupata;
    private boolean privelisteGradina;

    public MasaRezervata(Masa masaOcupata, boolean privelisteGradina) {
        this.masaOcupata = masaOcupata;
        this.privelisteGradina = privelisteGradina;
    }

    @Override
    public void pregatesteMasa() {
        masaOcupata.ocupaMasa(this.privelisteGradina);
    }
}
