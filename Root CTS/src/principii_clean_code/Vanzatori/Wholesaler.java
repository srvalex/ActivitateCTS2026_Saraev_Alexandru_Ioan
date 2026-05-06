package principii_clean_code.Vanzatori;

public class Wholesaler extends Retailer{

    private Float cifraAfaceri;

    public Wholesaler(String denumire, Float CUI, Integer numarAngajati) {
        super(denumire, CUI, numarAngajati);
    }
}
