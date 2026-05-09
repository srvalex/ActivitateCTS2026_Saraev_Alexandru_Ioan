Composite este un DP folosit pentru a crea si gestiona eficient structuri arborescente
Se lucreaza cu 3 clase.
- Clasa Nod Abstract. Unitatea de baza
- Clasa NodConcret. Poate avea copii din alte noduri.
- Clasa NodFrunza. Nu mai poate avea copii.

Principiu de baza, un obiect de tip NodConcret mosteneste NodAbstract si are la randul lui o lista de NodConcret

exemplu 

```
class NodConcret extends NodAbstract { 

List<NodAbstract> listaNoduri;

void AdaugaNod();
void EliminaNod();
void getNoduriCopii();
}
```

Acest DP, indiferent de implementare, va incalca un principiu de Clean Code.

- Fie alegem sa implementam metodele AdaugaNod si getNoduriCopil() in clasa abstracta, 
si atunci in clasa NodFrunza nu vom folosi acele metoda sau le tratam prin exceptii => 
incalcam YAGNI (You Ain't Gonna Need It)

- Fie alegem sa le implementam manual in NodConcret si in NodFrunza, si atunci incalcam DRY
(Don't Repeat Yourself)

The choice is yours :)

