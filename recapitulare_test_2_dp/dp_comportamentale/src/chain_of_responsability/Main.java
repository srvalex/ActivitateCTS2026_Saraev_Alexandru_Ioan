package chain_of_responsability;

public class Main {
    public static void main(String[] args) {
        Abonat abonat1 = new Abonat("Gigea");
        abonat1.setAdresaEmail("yanni@boss.com");
        Abonat abonat2 = new Abonat("Yannis");
        abonat2.setNumarTelefon("07noi2").setPoBox("Calea Buzesti 84-92");
        Abonat abonat3 = new Abonat("p power");
        abonat3.setPoBox("S-a terminat smecheria");

        Handler email = new HandlerEmail();
        Handler sms = new HandlerSMS();
        Handler po = new HandlerPO();
        email.setSuccesor(sms);
        sms.setSuccesor(po);

        email.trimiteNotificare(abonat1);
        email.trimiteNotificare(abonat2);
        email.trimiteNotificare(abonat3);
    }
}
