## UI Manuális tesztelése

## 1. teszt: User input

Az első manuális teszttel azt vizsgálom meg, hogy a program hogy kezeli a hibás user inputot.
A kezdőképernyőn a Start gombra kattintva a játékosok számát kell megadnia a felhasználónak.
- Ha reális számot adok meg (pl: 5), a játék sikeresen elindul.
- Ha a játékosok számához képest irreálisan nagy számot adok meg (pl: 10000), akkor a játék elindul, de nagyon lassan tölt be a GUI, sok ideig csak fehér a képernyő. A programban szerintem szükség lenne egy reális felső limitre, amennyi játékossal még elindulna a játék (pl: 100), annál többel pedig nem.
- Ha negatív számot írok be (pl:-1), akkor a játék elindul, és IndexOutOfBoundsException-t dob, de ettől még betölt a GUI, de ugye a játék használhatatlan, hiszen nincsen játékos. Ilyen input esetén a játéknak nem szabadna elindulnia, hanem jeleznie kellene a helytelen user input megadását és új értéket várnia.
- Ha nullát írok be, akkor a kezdőképernyő jelenik meg újra és a játék nem indul el. Az helyes, hogy a játék nem indult el játékos nélkül, de a felhasználóbarát kezelése a problémának az lenne, ha a felhasználó kapna hibaüzenetet, hogy nem helyes értéket írt be.
- Ha szöveget írok be a mezőbe, akkor a program NumberFormatExceptiont dob, de nem áll le, van lehetőségem új értéket megadni (de nem jelzi a UI szövegesen a felhasználó felé, hogy hibás volt az input).

