package FactoryMethod.fabrici;

import FactoryMethod.enums.PersonalNonMedical;
import FactoryMethod.enums.TipPersonal;
import FactoryMethod.personal.PersonalSpital;
import FactoryMethod.personal.personalNonMedical.Receptioner;
import FactoryMethod.personal.personalNonMedical.Registrator;

public class FabricaPersonalNonMedical implements FabricaPersonalSpital{
    @Override
    public PersonalSpital getPersonalSpital(TipPersonal personal, String nume, int nrOreLucrate, int salariu, int nrAniStudii) {
        return this.getPersonalSpital(personal,nume,nrOreLucrate,salariu);
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonal personal, String nume, int nrOreLucrate, int salariu) {
        switch (personal) {
            case PersonalNonMedical.RECEPTIONER: return new Receptioner(nume,nrOreLucrate,salariu);
            case PersonalNonMedical.REGISTRATOR: return new Registrator(nume,nrOreLucrate,salariu);
            default:return null;
        }
    }
}
