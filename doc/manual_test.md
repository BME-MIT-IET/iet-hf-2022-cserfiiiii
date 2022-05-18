## UI Manuális tesztelése

## 1. teszt: User input

Az első manuális teszttel azt vizsgálom meg, hogy a program hogy kezeli a hibás user inputot.
A kezdőképernyőn a Start gombra kattintva a játékosok számát kell megadnia a felhasználónak.
- Ha reális számot adok meg (pl: 5), a játék sikeresen elindul.
- Ha a játékosok számához képest irreálisan nagy számot adok meg (pl: 10000), akkor a játék elindul, de nagyon lassan tölt be a GUI, sok ideig csak fehér a képernyő. A programban szerintem szükség lenne egy reális felső limitre, amennyi játékossal még elindulna a játék (pl: 100), annál többel pedig nem.
- Ha negatív számot írok be (pl:-1), akkor a játék elindul, és IndexOutOfBoundsException-t dob, de ettől még betölt a GUI, de ugye a játék használhatatlan, hiszen nincsen játékos. Ilyen input esetén a játéknak nem szabadna elindulnia, hanem jeleznie kellene a helytelen user input megadását és új értéket várnia.
![image](https://user-images.githubusercontent.com/79630831/169167558-68cefedd-4f37-4e86-8773-37dda4b69b9d.png)
![image](https://user-images.githubusercontent.com/79630831/169167938-074dc9dd-5ea2-4de2-be38-8e2bdcb34d20.png)
- Ha nullát írok be, akkor a kezdőképernyő jelenik meg újra és a játék nem indul el. Az helyes, hogy a játék nem indult el játékos nélkül, de a felhasználóbarát kezelése a problémának az lenne, ha a felhasználó kapna hibaüzenetet, hogy nem helyes értéket írt be.
- Ha szöveget írok be a mezőbe, akkor a program NumberFormatExceptiont dob, de nem áll le, van lehetőségem új értéket megadni (de nem jelzi a UI szövegesen a felhasználó felé, hogy hibás volt az input).
![image](https://user-images.githubusercontent.com/79630831/169168062-2fb5b7dc-fce4-4595-94f9-2a6e241164f1.png)


## 2. teszt: Typography

A második manuális teszt által azt vizsgálom meg, hogy a szövegek mennyire jól olvashatóak, illetve mennyire kontrasztosak a háttérrel. 
- Főképernyő: A szövegeket megfelelően kontrasztosnak találom, a gombokon lévő szövegek is tisztán olvashatóak. A Főképernyő alján található "Made by Cserfescsapat", illettve a tetején található "Menu" szövegek pixelesek bizonyos mértékben, azokon lehetne javítani. Ezek a szövegek a háttérként szolgáló png-be vannak beégetve, ehelyett a megoldás helyett nem a kép részként, hanem a programban text-ként kellene megjeleníteni.
![image](https://user-images.githubusercontent.com/79630831/169168193-ee50cdba-8a7f-49d9-9a63-5fa38fe898c2.png)
- Játékosok számának megadása képernyő: Megfelelő.
- Játék: 
	- A Control panel alján lévő szövegeket nem találom eléggé kontrasztosnak a háttérrel. El lehet olvasni, de igényesebbé lehetne tenni ha félkövérré tennénk, vagy a hátteret változtatnánk meg. A képerenyőn megjelenő többi szöveget kellően kontrasztosnak ítélem.
	- ![image](https://user-images.githubusercontent.com/79630831/169168295-78385a77-c7a6-4be9-be77-4e38b8dc7317.png)
	- A játék kezdeti állapotában a játékosok ugyanazon az aszteroidán helyezkednek el, így a játékosok nevei egymásra lógnak, nem teljesen kivehetőek, csak egy név olvasható el.
![image](https://user-images.githubusercontent.com/79630831/169168343-cbd7d0ff-d319-480a-b2b2-a13cc8520d6e.png)
	- Az aszteroidák adatainak a leírásai is összecsúsznak, ha az aszteroidák túl közel helyezkednek el egymáshoz. Nehéz eldönteni, hogy melyik adat melyik aszteroidához tartozik.
![image](https://user-images.githubusercontent.com/79630831/169168486-d54e6f5b-2490-45e8-b8df-1d140c39397e.png)
- Vesztettél képernyő: Megfelel.
- Nyertél képernyő: Megfelel.


## 3. Teszt: Spelling

A harmadik teszt célkitűzése a helyesírási hibák észrevétele. 
- Főképernyő: Nincs helyesírási hiba.
- Játékosok számának megadása képernyő: Nincs helyesírási hiba.
- Játék : Nincs helyesírási hiba.
- Vesztettél képernyő: Nincs helyesírási hiba.
- Nyertél képernyő: Nincs helyesírási hiba.










	![image](https://user-images.githubusercontent.com/79630831/169168426-e68d032e-73c1-4ce9-a33e-2313931f0225.png)

