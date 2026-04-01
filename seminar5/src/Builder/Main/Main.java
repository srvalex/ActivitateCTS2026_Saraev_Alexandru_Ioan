package Builder.Main;

import Builder.Internare.Internare;
import Builder.Internare.InternareBuilder;
import Builder.Internare.InternareBuilderAbstract;
import Builder.Internare.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare("Gigel Frone",true,true,true,true);
        Internare internare2 = new Internare("Mihai Morar",false,false,false,false);
        InternareBuilder builder = new InternareBuilder("Harcea Parcea");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setNumePacient("denzel curry").setHalat(true).setPapuci(true).build();
        System.out.println(internare1.toString());
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());
        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejunInclus(true);
        Internare internare6 = builderAlternativ.build("Travis Scott");
        Internare internare5 = builderAlternativ.setHalat(true).setMicDejunInclus(false).build("Kanye West");
        System.out.println(internare6);
        System.out.println(internare5);
    }
}
