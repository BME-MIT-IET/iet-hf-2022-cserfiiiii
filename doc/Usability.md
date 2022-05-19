Easy to understand: könnyű megérteni a kódot, érthető a UI felület bármely felhasználó számára, minden sajátossága a programnak látható a végfelhasználók számára.

Az alábbi képen az alkalmazás kezdőképernyője látható:
![image](https://user-images.githubusercontent.com/79679983/169164390-7c16e7a6-9b47-4d5f-ad83-ad9c3793b7d0.png)

A kezdőképernyő háttere design szempontájól megfelelően nézi ki, viszont a gombokon látszik, hogy egyszerű, előre beépített Java Swing-es gombok, nincsenek átalakítva a szép GUI érdekében. Az, hogy a két gomb mire való, könnyen megérthető: az első gommbal a játékot lehet elindítani, a másodikkal pedig ki lehet lépni az alkalmazásból.
A gombokhoz jól vannak bekötve a funkciók, mivel az Exit gomb hatására valóban leáll az alkalmazás, a Start gomb hatására pedig egy új képernyő jelenik meg.

![image](https://user-images.githubusercontent.com/79679983/169165576-dd9f37fb-d16b-4f56-ba1f-73f1f1b5b5fd.png)
Az játéktér a fenti módon néz ki. Az oldalpanelen található gombok a játékosok lehetséges lépeseit jelölik, viszont nem egyértelmű, hogy melyik gomb mit csinál és hogyan működik. Illetve a Restore és Place Gate gombok mellett találhatóak legördülő listák, ezeknek viszont nincs értékük, ami összezavaró tud lenni a felhasználó számára. A gombok alatt található háromsoros kiírás sem egyértelmű, hogy mit jelent, illetve a szavak nehezen olvashatóak a beállított háttérkép miatt.
Maga 

A képernyőket nem lehet átméretezni, van egy fix méret, amekkoraként megjelenik, és ezen a felhasználó nem változtathat. 

Easy to Access: egy felhasználóbarát alklamzás könnyen elérhető kell legyen minden felhasználó számára, a külalak megnyerő és szemrevaló kell legyen, hogy a felhasználók érdeklődését felkeltse, mivel ha a GUI nem szép, akkor a felhasználó kevesebb valószínűséggel fogja hosszú távon használni az alkalmazást.

Az alábbi képen látszik, hogy az egyes karakterek egymásra vannak csúszva, nem szépen kivehető az hogy hány van belőlük, mit ír fölöttük, ez zavaró lehet a felhasználó számára, mivel nem láthatja pontosan, hogy mi történik a játékban.

![image](https://user-images.githubusercontent.com/79679983/169163365-ee25a2be-98cf-4f05-a8e3-79bacc321b41.png)

Az alábbi képen látszik, hogy egymásra vannak csúszva az egyes kiírások, ez is megnehezíti a felhasználónak az alkalmazás helyes használatát.
![image](https://user-images.githubusercontent.com/79679983/169166297-8f1f6083-b1be-4ce1-b529-658ed679d6d9.png)

Faster to Access: a szoftver elérése gyorsan kell történjen, azaz az alkalmazás válaszideje rövid kell hogy legyen, mivel ha a válaszidő nagy, akkor a felhasználók könnyen idegesek lehetnek, érdeklődésüket veszthetik az alkalmazás iárnt. Ezért biztosítani kell, hogy az alkalmazásunk képes legyen nagyjából 3 és 6 perc közötti válaszidőt produkálni.

Effective Navigation: a helyesen működő és effektív navigáció az egyik legfontosabb eleme egy szoftvernek. Ez megnyilvánulhat például a gombok helyes műkődésében, jó belső összekötés alkalmazásában, az informatív menü elemek vagy a jól működő kereső funkciók használatában.

Good Error Handling: a hibák kód szinten való kezelése biztosítja azt hogy az alkalmazás robosztus és működőképes marad bármely helyzetben. A megfelelő hiba üzenetek használata segít a felhasználónak abban hogy megértse, hol és mi volt a gond az alkalmazás futtatásakor, ezzel javítva a felhasználói élmenyt és a használhatóságot.
