package decorator.shoarmar.layer_abstractizare;

import decorator.shoarmar.meniu.IMeniu;
import decorator.shoarmar.meniu.MeniuPui;

public abstract class MeniuPuiAbstract implements IMeniu {
    private MeniuPui meniuPui;

    public MeniuPuiAbstract(MeniuPui meniuPui) {
        this.meniuPui = meniuPui;
    }

    @Override
    public void comanda() {
        meniuPui.comanda();
    }

    public abstract void comandaPromotionala();
}
