package SimpleFactory.Spital.Main;

import SimpleFactory.Spital.Fabrica.FabricaPersonal;
import SimpleFactory.Spital.Fabrica.TIP_PERSONAL;
import SimpleFactory.Spital.Personal.Asistent;
import SimpleFactory.Spital.Personal.PersonalSpital;

public class main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        PersonalSpital a1 = fabricaPersonal.getPersonalMedical(TIP_PERSONAL.ASISTENT,"AAA",25,"ATI");
        PersonalSpital medic1 = fabricaPersonal.getPersonalMedical(TIP_PERSONAL.MEDIC,"GIGI",40,"",10,10);
        PersonalSpital brancardier1 = fabricaPersonal.getPersonalMedical(TIP_PERSONAL.BRANCARDIER,"NEA NICU",55,4);

        System.out.println(a1.toString());
        System.out.println(medic1.toString());
        System.out.println(brancardier1.toString());
    }
}
