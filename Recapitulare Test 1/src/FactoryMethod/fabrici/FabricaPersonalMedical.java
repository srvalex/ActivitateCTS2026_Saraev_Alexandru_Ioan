package FactoryMethod.fabrici;

import FactoryMethod.enums.PersonalMedical;
import FactoryMethod.enums.TipPersonal;
import FactoryMethod.personal.PersonalSpital;
import FactoryMethod.personal.personalMedical.Asistent;
import FactoryMethod.personal.personalMedical.Brancardier;
import FactoryMethod.personal.personalMedical.Medic;

public class FabricaPersonalMedical implements FabricaPersonalSpital {


    @Override
    public PersonalSpital getPersonalSpital(TipPersonal personal, String nume, int nrOreLucrate, int salariu, int nrAniStudii) {
        switch (personal) {
            case PersonalMedical.MEDIC: return new Medic(nume, nrOreLucrate, salariu, nrAniStudii);
            case PersonalMedical.ASISTENT: return new Asistent(nume, nrOreLucrate, salariu, nrAniStudii);
            case PersonalMedical.BRANCARDIER: return new Brancardier(nume, nrOreLucrate, salariu, nrAniStudii);
            default:
                return null;
        }

    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal personal, String nume, int nrOreLucrate, int salariu) {
        switch (personal) {
            case PersonalMedical.MEDIC: getPersonalSpital(personal,nume,nrOreLucrate,salariu,12);
            case PersonalMedical.ASISTENT: getPersonalSpital(personal,nume,nrOreLucrate,salariu,4);
            case PersonalMedical.BRANCARDIER: getPersonalSpital(personal,nume,nrOreLucrate,salariu,6);
            default:
                return null;
        }
    }
}
