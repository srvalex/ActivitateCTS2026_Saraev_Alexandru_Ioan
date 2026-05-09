Facade are ca scop simplificarea lucrului cu  "framework"-uri / aplicatii / clase 
multiple, realizand o singura clasa wrapper 

Exemplu:
Un restaurant ofera numeroase feluri de mancare, printre care si shaorma.
Sharoma este unul dintre cele mai comandate preparate, asa ca ar fi o idee buna sa implementam
un modul care sa simplifice prepararea unei shaorme.
Ca sa iti faci shaorma, trebuie sa iti prepari carnea, sa o gatesti si sa o tai. Trebuie sa tai 
legumele si sa faci sosurile. 
Sa spunem ca exista urmatoarele clase: 
CarnePui
Legume
Sos
Lipie

Ar trebui sa apelezi in main 
- CarnePui.condimenteazaCarne()
- CarnePui.gatesteCarne()
- CarnePui.taieCarne()
- Legume.pregatesteLegume()
- Sos.alegeSos()
- Sos.aplicaSos()
- Lipie.imbinaIngrediente()

Pentru a simplifica intreg procesul, se va realiza o fatada care sa asunda toate functionalitatile
din clasele folosite si va apela doar functiile necesare realizarii de shaorma.

Va exista clasa FacadeShaorma care va avea obiecte de tip CarnePui,Legume,Sos,Lipie
si va avea o functie de tipul
FacadeShaorma.preparaShaorma() care simplifica intreg fluxul.



