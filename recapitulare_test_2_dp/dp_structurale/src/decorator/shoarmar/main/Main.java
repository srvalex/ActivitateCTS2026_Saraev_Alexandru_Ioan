package decorator.shoarmar.main;

import decorator.shoarmar.layer_abstractizare.MeniuPuiAbstract;
import decorator.shoarmar.layer_abstractizare.MeniuPuiAyran;
import decorator.shoarmar.layer_abstractizare.MeniuPuiBaklava;
import decorator.shoarmar.meniu.MeniuPui;

public class Main {
    public static void main(String[] args) {
        MeniuPui meniuPui = new MeniuPui("Mare",36);
        meniuPui.comanda();
        System.out.println("\n-------------------------\n");
        MeniuPuiAbstract meniuPuiPromo = new MeniuPuiAyran(meniuPui);
        meniuPuiPromo.comandaPromotionala();
        System.out.println("\n-------------------------\n");
        MeniuPuiAbstract meniuPuiBaklava = new MeniuPuiBaklava(meniuPui);
        meniuPuiBaklava.comandaPromotionala();
    }
}
