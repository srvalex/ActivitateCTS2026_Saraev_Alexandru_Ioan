package decorator.shoarmar.layer_abstractizare;

import decorator.shoarmar.meniu.MeniuPui;

public class MeniuPuiAyran extends MeniuPuiAbstract{
    public MeniuPuiAyran(MeniuPui meniuPui) {
        super(meniuPui);
    }

    @Override
    public void comandaPromotionala() {
        super.comanda();
        System.out.println("De asemenea, la aceasta comanda mai primit un Ayran din partea casei!");
    }
}
