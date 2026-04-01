package FactoryMethod.fabrici;

import FactoryMethod.enums.TipPersonal;
import FactoryMethod.personal.PersonalSpital;

public interface FabricaPersonalSpital {
    PersonalSpital getPersonalSpital (TipPersonal personal,String nume, int nrOreLucrate, int salariu, int nrAniStudii);
    PersonalSpital getPersonalSpital (TipPersonal personal, String nume, int nrOreLucrate, int salariu);
}
