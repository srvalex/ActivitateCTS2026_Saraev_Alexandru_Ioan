Flyweight este un DP care are ca scop principal optmizarea memoriei folosite la runtime. 
Se merge pe ideea ca in anumite cazuri, va trebui sa incarci aceleasi date in memorie de mai multe ori.
De exemplu, pentru studentii dintr-o serie.
Clasa student va avea atribute referitoare la student, prin urmare va avea si informatii despre facultatea 
la care studiaza, serie, grupa, an de inmatriculare etcc.
2 colegi de grupa pot avea acelasi infomratii despre anul de studiu si facultate, deci incarcarea acelei bucati
de informatie de mai multe ori in memorie este o utilizare ineficienta a memoriei.
Asa ca putem salva informatiile repetitive intr-o singura clasa si sa le accesam folosind un hashmap.
(Similar cu o baza de date, doar ca nu este obligatoriu sa avem o legatura logica a datelor pintr-un FK)


Din situatia de mai sus, putem sa identificam 2 clase
- Clasa Student cu informatii despre stud
- Clasa InformatiiFacultate (cu info despre fac), care se va repeta pt mai multi studenti.
- Ca sa respectam dependency inversion, ne vom face o interfata pentru flyweight pt ca mai pot aparea modificari
- Ne mai trebuie un hashmap, deci vom face o clasa FlyweightManager / FlyweightFacory.

Una dintre problemele cu flyweight este lipsa legaturii logice a datelor (lipsa unui FK). 

