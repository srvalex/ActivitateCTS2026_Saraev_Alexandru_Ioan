Proxy este folosit pentru a inlantui conditii in mod eficient in cod.
In loc sa facem 
```
if (a < 9) {
    if (a > 3) {
        if (a > 4 && a < 8) {
             print(cartofi prajiti)
        }
    }
    else {
        print (cartofi la cuptor)
    }
}
else {
    print (cartofi gratinati)
}
```
si sa ne pierdem in ramurile de else,
putem sa folosim proxy-uri ca sa evidentiem clar ramurile conditionale.
Astfel, vom avea ceva de genul

```
conditiaNr1(
            conditiaNr2(
                        conditiaNr3(a)
                        )
            )
```

Avand in vedere ca putem sa facem o inlantuire de genul, putem sa ne dam seama de forma clasei
proxy.

Vom avea o **interfata de baza** din care se va mosteni **clasa concreta** 
si o **clasa proxy** care va implementa interfata de baza si va avea un obiect de tipul interfetei
Se vor folosi obiecte de tipul interfetei pentru a permite chaining-ul intre conditii