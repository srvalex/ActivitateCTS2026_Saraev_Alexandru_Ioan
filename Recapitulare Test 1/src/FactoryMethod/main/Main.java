package FactoryMethod.main;

import FactoryMethod.enums.PersonalMedical;
import FactoryMethod.enums.PersonalNonMedical;
import FactoryMethod.fabrici.FabricaPersonalMedical;
import FactoryMethod.fabrici.FabricaPersonalNonMedical;
import FactoryMethod.fabrici.FabricaPersonalSpital;
import FactoryMethod.personal.PersonalSpital;
import SimpleFactory.Spital.Personal.Asistent;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalSpital fabricaMedici = new FabricaPersonalMedical();
        FabricaPersonalSpital fabricaNonMedici = new FabricaPersonalNonMedical();
        PersonalSpital asistent = fabricaMedici.getPersonalSpital(PersonalMedical.ASISTENT,"Maria",40,8500,4);
        PersonalSpital brancardier = fabricaMedici.getPersonalSpital(PersonalMedical.BRANCARDIER,"Gigi",30,9000,8);
        PersonalSpital registrator = fabricaNonMedici.getPersonalSpital(PersonalNonMedical.REGISTRATOR,"Alin",40,5500);

        asistent.afisazaInformatii();
        brancardier.afisazaInformatii();
        registrator.afisazaInformatii();

    }
}
