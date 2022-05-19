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
		- ![image](https://user-images.githubusercontent.com/79630831/169170515-290b213a-63e9-4857-ab2d-f20029a43b87.png)
- Játékosok számának megadása képernyő: Megfelelő.
- Játék: 
	- A Control panel alján lévő szövegeket nem találom eléggé kontrasztosnak a háttérrel. El lehet olvasni, de igényesebbé lehetne tenni ha félkövérré tennénk, vagy a hátteret változtatnánk meg. A képerenyőn megjelenő többi szöveget kellően kontrasztosnak ítélem.
		- ![image](https://user-images.githubusercontent.com/79630831/169168295-78385a77-c7a6-4be9-be77-4e38b8dc7317.png)
	- A játék kezdeti állapotában a játékosok ugyanazon az aszteroidán helyezkednek el, így a játékosok nevei egymásra lógnak, nem teljesen kivehetőek, csak egy név olvasható el.
		- ![image](https://user-images.githubusercontent.com/79630831/169168343-cbd7d0ff-d319-480a-b2b2-a13cc8520d6e.png)
	- Az aszteroidák adatainak a leírásai is összecsúsznak, ha az aszteroidák túl közel helyezkednek el egymáshoz. Nehéz eldönteni, hogy melyik adat melyik aszteroidához tartozik.
		- ![image](https://user-images.githubusercontent.com/79630831/169168486-d54e6f5b-2490-45e8-b8df-1d140c39397e.png)
- Vesztettél képernyő: Megfelel.
- Nyertél képernyő: Megfelel.


## 3. Teszt: Spelling

A harmadik teszt célkitűzése a helyesírási hibák észrevétele. 
- Főképernyő: Nincs helyesírási hiba.
- Játékosok számának megadása képernyő: Nincs helyesírási hiba.
- Játék : Nincs helyesírási hiba.
- Vesztettél képernyő: Nincs helyesírási hiba.
- Nyertél képernyő: Nincs helyesírási hiba.


## 4. Teszt: Visual Consistency

A negyedik tesztben a megjelenés konziszteniáját vizsgálom meg.
- A fő háttér végigkíséri az egész játék folyamatát, megjelenik mindegyik képernyőn, így én úgy ítélem meg, hogy ezzel egységes külalakot teremtettek a fejlesztők.
- A használt betűtípus egységes a játék alatt.
- A Játék képernyőn a Control panel alatt megjelenő hátteret viszont túlságosan világosnak ítélem meg a sötét fő háttérhez képest.
- A gombok külalakja megegyezik a játékban, de a megjelenésén lehetne javítani.
- Ha -1 játékossal indítjuk el a játékot (lásd a csatolt képet az 1. tesztnél), akkor inkonzisztens, hogy a játék elindul, illetve, hogy a Control panel tetején Settler1 jelenik meg. Ha viszont a Settler1 megjelenik, akkor ahhoz képest is logikálan, hogy a Control panel alján található mezők üresen jelennek meg.


## 5. Teszt: Pictures

Az ötödik teszt a képek helyes megjelenítésére fókuszál.
- Főképernyő: A fő háttér egy picit pixeles, a felbontásán lehetne javítani (ez az egész játékra vonatkozik, hiszen ez a fő háttér, de nem fejtem ki az összes képernyőnél).
- Játékosok számának megadása képernyő: Csak a főképernyő szerepel képként.
- Játék : A képeket megfelelőnek tartom. Viszont az aszteroidák véletlenszerű elhelyezésének következtében előfordul, hogy a Controlpanel kitakarja néhány aszteroida bizonyos részeit. Ez sokat elvesz a felhasználói élményből, illetve a külalak minőségéből. Az ufók illetve a telepesek kis ikonjai gyakran összecsúsznak és neház kivenni pontosan hány alak van egy aszteroidán.
![image](https://user-images.githubusercontent.com/79630831/169168426-e68d032e-73c1-4ce9-a33e-2313931f0225.png)
- Vesztettél képernyő: Csak a főképernyő szerepel képként.
- Nyertél képernyő: Csak a főképernyő szerepel képként.


## 6. Teszt: Functions

A hatodik tesztben a funkciók működésének megfelelő megjelenését elemzem.
- A játékosok mozgatása jól működik akkor is, ha van szomszédja az aszteroidának, és akkor is, ha nem. 
- A fúrás funkció helyesen működik, akkor is, ha van kérge az aszteroidának, és akkor is, ha nincs.
- A bányászás funkció helyesen működik, akár van nyersanyag az aszteroidában, akár nincs.
- A nyersanyag visszahelyezése funkció is helyesen működik, akár lehetséges a visszahelyezés (van nyersanyag a telepesnél és nincs kérge az aszteroidának), és akkor is, ha nem (minden egyéb eset).
- A robot építése funkció is helyesen működik, akár van elég nyersanyaga a telepesnek, akár nincs.
- A kapu építése funkció is helyesen működik, akár van elég nyersanyaga a telepesnek, akár nincs.
- A kapu elhelyezése funkció is helyesen működik, akár van kapuja a telepesnek, akár nincs.

