package adapter.AdapterClase.main;

import adapter.AdapterClase.Limba.AdaptorEnglezaRomana;
import adapter.AdapterClase.Limba.Engleza;

public class Main {
    public static void main(String[] args) {
        Engleza eng = new Engleza(100000,1234);

        AdaptorEnglezaRomana adaptorRomanaEngleza = new AdaptorEnglezaRomana(eng);

        adaptorRomanaEngleza.spuneBuna();
        adaptorRomanaEngleza.spunePa();
        adaptorRomanaEngleza.spuneMultumesc();
    }
}
