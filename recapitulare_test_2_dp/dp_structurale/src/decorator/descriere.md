Decorator este folosit pentru a aduga functionalitati sau pentru a modifica functionalitati deja existente 
la runtime.

Pe scurt se comporta ca o derivare cu pasi in plus.

Exemplu. Avem clasa shoarma de pui. Shoarmeria isi doreste ca pentru urmatoarele 3 luni
sa vanda un meniu promotional cu shaorma de pui + ayran / baklava
, ca apoi sa se intoarca la meniul simplu.

- Clasa de baza: MeniuAbstract / InterfataMeniu
- MeniuPui mosteneste/implementeaza una dintre cele 2. Asta va fi clasa concreta.
- DecoratorMeniu -> inca un nivel de abstractizare care implementeaza/mostenste clasa de baza si care va deriva la randul ei clasele decorate.
- MeniuPuiPromoAyran - clasa decorata cu o noua functionalitate

vezi pachet shaormar pt implementare
