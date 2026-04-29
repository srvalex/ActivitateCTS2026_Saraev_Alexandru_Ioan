package decorator.main;

import decorator.decorator.NotaPlata1Mai;
import decorator.decorator.NotaPlataAnulNou;
import decorator.decorator.NotaPlataDecorator;
import decorator.nota_de_plata.NotaPlata;

public class Main {
    public static void main(String[] args) {
        NotaPlata notaPlata = new NotaPlata(267.29f,"10");
        notaPlata.printeazaNotaDePlata();




        System.out.println("--------------------------------------------\n");
        NotaPlataDecorator notaPlataAnulNou = new NotaPlataAnulNou(notaPlata,"2025-12-28");
        NotaPlataDecorator notaPLata1mai = new NotaPlata1Mai(notaPlata);

        int a = 1;


        if (a==1) {
            notaPLata1mai.printeazaFelicitare();
        }
        else notaPlataAnulNou.printeazaFelicitare();
    }
}
