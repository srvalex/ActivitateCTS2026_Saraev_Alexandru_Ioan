package decorator.decorator;

import decorator.nota_de_plata.NotaPlataAbstract;

public class NotaPlataAnulNou extends NotaPlataDecorator {
    private String data;

    public NotaPlataAnulNou(NotaPlataAbstract notaPlata, String data) {
        super(notaPlata);
        this.data = data;
    }

    @Override
    public void printeazaFelicitare() {
        this.printeazaNotaDePlata();
        StringBuilder sb = new StringBuilder("Va dorim un an nou fericit si plin de bucurii!");
        System.out.println(sb.toString());
    }
}
