Observer-ul este un DP comportamental ce are ca scop anunatarea unor obiecte care "asculta".
Intre subiect si observer exista o relatie de 1 : N

Atunci cand va trebui facut un "anunt", observer-ul va anunta fiecare ascultator in parte.

Exemple din viata reala: Un grup de oameni sunt abonati la newsletter-ului unui magazin de haine.
In momentul in care magazinul are o promotie, le va trimite abonatilor un mail.
Subiectul este magazinul, observerii sunt clientii

Exemplu nr 2: 

Programare multithreaded.

Mai multe functii/programe au nevoie de aceleasi resurse. In momentul in care un fir de executie 
isi termina operatia cu acea resursa, va apela metoda `notiffyAll()` pentru a anunta si restul
de thread-uri ca resursa a fost eliberata.

Diagrama / participanti.

- ICentruNotificari, care va anunta metodele anuntaAbonati(), adaugaAbonat(), eliminaAbonat()
- Newsletter, clasa care va implementa ICentruNotificari si lista de abonati
- IAbonat - interfata pentru abonat, pentru a adauga un nivel de abstractie
- AbonatConcret


