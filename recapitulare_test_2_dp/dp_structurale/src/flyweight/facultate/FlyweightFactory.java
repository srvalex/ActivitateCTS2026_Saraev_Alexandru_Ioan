package flyweight.facultate;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,IFacultate> registruFacultati;

    public FlyweightFactory() {
        this.registruFacultati = new HashMap<>();
    }

    public void adaugaFacultate(String denumire,String facultate, int anInmatriculare, int nrAniStudii) {
        this.registruFacultati.put(denumire, new FacultateFrecventa(facultate,denumire,anInmatriculare,nrAniStudii));
    }

    public IFacultate getFaculate(String denumire) {
        if(this.registruFacultati.containsKey(denumire))
            return this.registruFacultati.get(denumire);
        else return null;
    }

    public void afiseazaInfomratiiStudent(String denumireFacultate,Student stud) {
        System.out.println(stud.toString());
        this.registruFacultati.get(denumireFacultate).afiseazaInfomratiiFacultate();
    }
}
