Strategy este folosit pentru a determina o "strategie" la run-time. Practic, exista mai multi algoritmi
si vrem ca la runtime sa alegem unul dintre ei. 
De exemplu, sa zicem ca avem o interfata cu care vrem sa ilustram diversi algoritmi de sortare
- bubble sort
- insertion sort
- quick sort
- radix sort
- heap sort


Practic la runtime, utilizatorul va alege dintr-un meniu care algoritm de sortare sa fie folosit

Observam ca pentru fiecare algoritm de sortare am putea realiza o clasa cu metoda sort() -> 
- putem avea o interfara de baza numita AlgoritmSortare ce anunta metoda sort()
- ca apoi sa o implementam in fiecare clasa individuala
- si ne mai trebuie o clasa User din care sa setam tipul de algoritm pe care dorim sa il folosim


