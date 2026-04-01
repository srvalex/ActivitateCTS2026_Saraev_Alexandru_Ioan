package Builder.Restaurant.main;

import Builder.Restaurant.Builder_DRY.BuilderDry;
import Builder.Restaurant.Builder_NO_DRY.Builder_No_Dry;
import Builder.Restaurant.Rezervare.Rezervare;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Builder_No_Dry builder_no_dry = new Builder_No_Dry();
        Rezervare rezervare1 = builder_no_dry.setDenumireEveniment("Club One").setDecoratiuneMasa(true).setDecoratiuneMasa(false).build();
        Rezervare rezervare4 = builder_no_dry.setScaunErgonomic(true).build();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare4.toString());
        BuilderDry builderDry = BuilderDry.getInstantaBuilderDry();
        Rezervare rezervare2 = builderDry.setDecoratiuneMasa(true).setDecoratiuneMasa(false).build("Terra Events");
        System.out.println(rezervare2.toString());
        Rezervare rezervare3 = builderDry.setScaunErgonomic(true).build("Party Night By Hard Rock Cafe");
        System.out.println(rezervare3.toString());

    }
}
