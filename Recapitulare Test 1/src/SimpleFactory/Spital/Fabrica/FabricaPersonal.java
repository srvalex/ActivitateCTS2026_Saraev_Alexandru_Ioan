package SimpleFactory.Spital.Fabrica;

import SimpleFactory.Spital.Personal.Asistent;
import SimpleFactory.Spital.Personal.Brancardier;
import SimpleFactory.Spital.Personal.Medic;
import SimpleFactory.Spital.Personal.PersonalSpital;

public class FabricaPersonal {

    public PersonalSpital getPersonalMedical (TIP_PERSONAL tipPersonal, String nume, int varsta, Object freeField) {
        switch (tipPersonal) {
            case ASISTENT: return new Asistent(nume,varsta,(String)freeField);
            case MEDIC: return new Medic(nume,varsta, (Integer) freeField);
            case BRANCARDIER: return new Brancardier(nume,varsta,(int)freeField);
            default: return null;
        }
    }

    public PersonalSpital getPersonalMedical (TIP_PERSONAL tipPersonal, String nume, int varsta,
                                              String denumireDepartament,
                                              int aniExperienta,
                                              int numarTure) {
        switch (tipPersonal) {
            case ASISTENT: return new Asistent(nume,varsta,denumireDepartament);
            case MEDIC: return new Medic(nume,varsta, aniExperienta);
            case BRANCARDIER: return new Brancardier(nume,varsta,numarTure);
            default: return null;
        }
    }

    public PersonalSpital getAsistent (String nume, int varsta, String denumireDepartament) {
        return getPersonalMedical(TIP_PERSONAL.ASISTENT,nume,varsta,denumireDepartament,0,0);
    }

}
