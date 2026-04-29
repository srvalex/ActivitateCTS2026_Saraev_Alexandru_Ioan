package Cafenea.comanda;

import Cafenea.bauturi.Bautura;

public interface ComandaManager {
    void adaugaBauturaLaComanda(Integer idComanda, Bautura bautura);
    void afiseazaToateBauturileDinUltimaComanda();
    float calculeazaPretTotalAlComenzii(Integer idComanda);

}
