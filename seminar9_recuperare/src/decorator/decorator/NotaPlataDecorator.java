package decorator.decorator;

import decorator.nota_de_plata.NotaPlata;
import decorator.nota_de_plata.NotaPlataAbstract;

public abstract class NotaPlataDecorator implements NotaPlataAbstract {

    private NotaPlataAbstract notaPlata;

    public NotaPlataDecorator(NotaPlataAbstract notaPlata) {
        this.notaPlata = notaPlata;
    }
    @Override
    public void printeazaNotaDePlata() {
        notaPlata.printeazaNotaDePlata();
    }

    public abstract void printeazaFelicitare();
}
