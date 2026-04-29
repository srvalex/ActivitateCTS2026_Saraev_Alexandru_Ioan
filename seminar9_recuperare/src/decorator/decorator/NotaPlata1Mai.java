package decorator.decorator;

import decorator.nota_de_plata.NotaPlataAbstract;

public class NotaPlata1Mai extends NotaPlataDecorator{

    public NotaPlata1Mai(NotaPlataAbstract notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelicitare() {
        this.printeazaNotaDePlata();
        System.out.println("Sper sa ai 1 mai smecher!");
    }
}
