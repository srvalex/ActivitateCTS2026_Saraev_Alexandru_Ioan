package command.Restaurant;

public class MasaOcupata implements IComanda{

    private Masa masaOcupata;
    private boolean privelisteLac;

    public MasaOcupata(Masa masaOcupata, boolean privelisteLac) {
        this.masaOcupata = masaOcupata;
        this.privelisteLac = privelisteLac;
    }

    @Override
    public void pregatesteMasa() {
        masaOcupata.ocupaMasa(privelisteLac);
    }
}
