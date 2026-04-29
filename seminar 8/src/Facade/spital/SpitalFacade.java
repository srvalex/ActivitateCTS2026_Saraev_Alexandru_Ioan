package Facade.spital;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if(pacient.getGravitate() >=6) {
            if(medic.areBiletTrimitere(pacient)){
                int numarPat = salon.patLiber();
                if(numarPat != -1)
                {
                    System.out.println("Pacientul " + pacient.toString() +" a fost internat");
                    salon.ocupaPat(numarPat);
                }
                else System.out.println("Spitalul nu are locuri libere :(");
            }
            else System.out.println("Medicul nu ii ofera bilet de trimitere");
        }
        else System.out.println("N-ai nimic, stai acasa");
    }
}
