package facade.bucatarie;

import facade.ingrediente.Carne;
import facade.ingrediente.Legume;
import facade.ingrediente.Sos;

//Asta ar fi practic clasa Facade. Bucatarul va primi toate ingredientele si va realiza diverse feluri de mancare
public class BucatarFacade {
    private Carne carne;
    private Legume legume;

    public BucatarFacade(Carne carne, Legume legume) {
        this.carne = carne;
        this.legume = legume;
    }

    public void preparaShaorma(Sos sos) {
        this.carne.condimenteazaCarne("Shaorma");
        this.carne.gatesteCarne("Shaorma");
        this.legume.preparaLegume("Shaorma");
        if(sos != null) {
            this.carne.aplicaSosPeCarne(sos);
            sos.aplicaSos();
        }
        else {
            System.out.println("Shaorma fara sos. Esti ciudat");
        }
    }
}
