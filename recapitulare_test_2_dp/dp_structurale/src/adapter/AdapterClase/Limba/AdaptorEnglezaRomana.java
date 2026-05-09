package adapter.AdapterClase.Limba;

public class AdaptorEnglezaRomana extends Engleza implements Romana{

    public AdaptorEnglezaRomana(Engleza eng) {
        super(eng);
    }

    @Override
    public void spuneBuna() {
        super.sayHello();
    }

    @Override
    public void spunePa() {
        super.sayGoodbye();
    }

    @Override
    public void spuneMultumesc() {
        super.sayThankYou();
    }


}
