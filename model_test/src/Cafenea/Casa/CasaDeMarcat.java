package Cafenea.Casa;

import Cafenea.bauturi.Bautura;
import Cafenea.comanda.Comanda;
import Cafenea.comanda.ComandaManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CasaDeMarcat implements ComandaManager {

    private Map<Integer, List<Bautura>> listaComenzi;
    public static CasaDeMarcat instantaCasaDeMarcat = null;


    private CasaDeMarcat() {
        this.listaComenzi = new HashMap<>();
    }

    public static CasaDeMarcat getInstantaCasaDeMarcat() {
        if (instantaCasaDeMarcat == null) {
            instantaCasaDeMarcat = new CasaDeMarcat();
            return instantaCasaDeMarcat;
        } else {
            return instantaCasaDeMarcat;
        }
    }


    @Override
    public void adaugaBauturaLaComanda(Integer idComanda, Bautura bautura) {
        listaComenzi.get(idComanda).add(bautura);
    }

    @Override
    public void afiseazaToateBauturileDinUltimaComanda() {
        int idUltimaComanda = listaComenzi.keySet().stream().sorted().toList().getLast();
        listaComenzi.get(idUltimaComanda).stream().forEach(bautura -> System.out.println(bautura.toString()));
    }

    @Override
    public float calculeazaPretTotalAlComenzii(Integer idComanda) {
        return (float) listaComenzi.get(idComanda).stream().map(bautura -> bautura.getPretBautura()).mapToDouble(pret -> pret).sum();
    }

    public void adaugaComanda(Comanda comanda) {
        this.listaComenzi.put(comanda.getId(),comanda.getListaBauturi());
    }

    public void afiseazaComanda(Integer id) {
        listaComenzi.get(id).stream().forEach(bautura -> System.out.println(bautura.toString()));
    }


}