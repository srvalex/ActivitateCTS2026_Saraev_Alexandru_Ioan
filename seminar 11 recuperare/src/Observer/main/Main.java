package Observer.main;

import Observer.spital.ICentruNotificari;
import Observer.spital.Pacient;
import Observer.spital.Spital;

public class Main {
    public static void main(String[] args) {
        ICentruNotificari spital = new Spital("Alexandru Obregia");

        Pacient p1 = new Pacient("A","ATI","Pneumonie",10);
        Pacient p2 = new Pacient("B","Oftlamologie","Cataracta",2);
        Pacient p3 = new Pacient("C","Cardiologie","Tensiune ridicata",1);
        Pacient p4 = new Pacient("D","Pediatrie","Pneumonie",10);

        spital.abonarePacient(p1);
        spital.abonarePacient(p2);
        spital.abonarePacient(p3);
        spital.abonarePacient(p4);

        ((Spital)spital).notificaEpidemie();
    }
}
