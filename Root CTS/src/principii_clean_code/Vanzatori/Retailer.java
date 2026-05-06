package principii_clean_code.Vanzatori;

import principii_clean_code.Dizpozitive.Telefon;

import java.util.HashMap;
import java.util.Map;

public abstract class Retailer {
    protected String denumire;
    protected Float CUI;
    protected Integer numarAngajati;
    protected Map<Telefon,Integer> catalogStocuri;

    public Retailer(String denumire, Float CUI, Integer numarAngajati) {
        this.denumire = denumire;
        this.CUI = CUI;
        this.numarAngajati = numarAngajati;
        this.catalogStocuri = new HashMap<>();
    }
}
