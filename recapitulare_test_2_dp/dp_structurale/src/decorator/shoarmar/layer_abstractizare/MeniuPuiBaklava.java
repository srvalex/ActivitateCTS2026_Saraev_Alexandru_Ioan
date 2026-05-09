package decorator.shoarmar.layer_abstractizare;

import decorator.shoarmar.meniu.MeniuPui;

public class MeniuPuiBaklava extends MeniuPuiAbstract{

    public MeniuPuiBaklava(MeniuPui meniuPui) {
        super(meniuPui);
    }

    @Override
    public void comandaPromotionala() {
        this.comanda();
        System.out.println("De asemenea, la aceasta comanda primit din partea casei o portie de bakalvale");
    }
}
