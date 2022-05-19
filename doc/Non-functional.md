Easy to understand: könnyű megérteni a kódot, érthető a UI felület bármely felhasználó számára, minden sajátossága a programnak látható a végfelhasználók számára.

Az alábbi képen az alkalmazás kezdőképernyője látható:
![image](https://user-images.githubusercontent.com/79679983/169164390-7c16e7a6-9b47-4d5f-ad83-ad9c3793b7d0.png)

A kezdőképernyő háttere design szempontájól megfelelően nézi ki, viszont a gombokon látszik, hogy egyszerű, előre beépített Java Swing-es gombok, nincsenek átalakítva a szép GUI érdekében. Az, hogy a két gomb mire való, könnyen megérthető: az első gommbal a játékot lehet elindítani, a másodikkal pedig ki lehet lépni az alkalmazásból.
A gombokhoz jól vannak bekötve a funkciók, mivel az Exit gomb hatására valóban leáll az alkalmazás, a Start gomb hatására pedig egy új képernyő jelenik meg.

![image](https://user-images.githubusercontent.com/79679983/169165576-dd9f37fb-d16b-4f56-ba1f-73f1f1b5b5fd.png)
Az játéktér a fenti módon néz ki. Az oldalpanelen található gombok a játékosok lehetséges lépeseit jelölik, viszont nem egyértelmű, hogy melyik gomb mit csinál és hogyan működik. Illetve a Restore és Place Gate gombok mellett találhatóak legördülő listák, ezeknek viszont nincs értékük, ami összezavaró tud lenni a felhasználó számára. Ha nem ismeri a játékot, akkor nem egyértelmű, mi a célja vagy mi pontosan mi történik, csak vakon kattintgatja a gombokat. A gombok alatt található háromsoros kiírás sem egyértelmű, hogy mit jelent, illetve a szavak nehezen olvashatóak a beállított háttérkép miatt.
Maga a játéktér, illetve annak komponensei sem feltétlenül érthetőek a felhasználó számára. Az ikonok jól néznek ki, viszont a fehér vonalak miatt a UI veszít az esztétikailag zépségéből. Az ikonok felett található kiírások esetében sem egyértelmű a jelentésük, és sok esetben még egymásra is csúsznak.

Az alábbi képen látszik, hogy az egyes karakterek egymásra vannak csúszva, nem szépen kivehető az hogy hány van belőlük, mit ír fölöttük, ez zavaró lehet a felhasználó számára, mivel nem láthatja pontosan, hogy mi történik a játékban.

![image](https://user-images.githubusercontent.com/79679983/169163365-ee25a2be-98cf-4f05-a8e3-79bacc321b41.png)

Az alábbi képen látszik, hogy egymásra vannak csúszva az egyes kiírások, ez is megnehezíti a felhasználónak az alkalmazás helyes használatát.
![image](https://user-images.githubusercontent.com/79679983/169166297-8f1f6083-b1be-4ce1-b529-658ed679d6d9.png)

Ha a játék veszteséggel ért véget, az alábbi képernyő jelenik meg, amin ugyan az Ok gomb az elvárásoknak megfelelően visszavisz a kezdőképernyőre, viszont a "You have lost! :(" kiírás nem informatív azzal kapcsolatban, hogy miért vesztett a felhasznaló, sem arról, hogy van-e más nyertes.
![image](https://user-images.githubusercontent.com/79679983/169170892-760fc655-95b8-4f59-8fd0-7bed8e07c77a.png)

Easy to Access: egy felhasználóbarát alklamzás könnyen elérhető kell legyen minden felhasználó számára, a külalak megnyerő és szemrevaló kell legyen, hogy a felhasználók érdeklődését felkeltse, mivel ha a GUI nem szép, akkor a felhasználó kevesebb valószínűséggel fogja hosszú távon használni az alkalmazást.

Amint a lenti képen is látszik, létezik olyan játéktér felépítés, hogy a felhasználó nem tudja kiválasztani, hogy hova mozogjon, ami ellehetetleníti a játék megnyerését.
![image](https://user-images.githubusercontent.com/79679983/169171619-b072c6ba-7afe-4105-8466-da60656e4a4e.png)

Az egyes gomboknak, például Create Robot, Create Gate, Place Gate csak bizonyos feltételek mellett van érdemi funkciójuk, ennek ellenére a felhasználó megnyomhatja őket olyan esetben is ha a feltételek nem teljesülnek.

Faster to Access: a szoftver elérése gyorsan kell történjen, azaz az alkalmazás válaszideje rövid kell hogy legyen, mivel ha a válaszidő nagy, akkor a felhasználók könnyen idegesek lehetnek, érdeklődésüket veszthetik az alkalmazás iárnt. Ezért biztosítani kell, hogy az alkalmazásunk képes legyen nagyjából 3 és 6 perc közötti válaszidőt produkálni.
Az alkalmazás a UI elemeket alavetően gyorsan jeleníti meg, az egyes interakciókra történő változtatások is gyorsan megjelennek a képernyőn, viszont ha például egy nagyobb számot írunk be a játék kezdetekor, akkor egy időre befagy az alkalmazás, egy fehér képernyő jelenik meg, amire csak hosszú várakozás után tötödik be a játéktér. Illetve, ha felhasználó gyorsan kattingat a gombok között, nem mindig frissülnek gyorsan a UI elemek.

Effective Navigation: a helyesen működő és effektív navigáció az egyik legfontosabb eleme egy szoftvernek. Ez megnyilvánulhat például a gombok helyes műkődésében, jó belső összekötés alkalmazásában, az informatív menü elemek vagy a jól működő kereső funkciók használatában.
A képernyőket nem lehet átméretezni, van egy fix méret, amekkoraként megjelenik, és ezen a felhasználó nem változtathat. 
A játékból a játék menete közben nem lehet kilépni, kizárólag az ablakot bezárva, ezzel alkalmazást teljesen leállítva, lehetséges abbahagyni a játékot. Ez felhasználói élmény szempontjánból negatív, mivel így a felhasználó úgy érezheti, hogy nem kontrolálja teljesen az alkalmazást.


Good Error Handling: a hibák kód szinten való kezelése biztosítja azt hogy az alkalmazás robosztus és működőképes marad bármely helyzetben. A megfelelő hiba üzenetek használata segít a felhasználónak abban hogy megértse, hol és mi volt a gond az alkalmazás futtatásakor, ezzel javítva a felhasználói élmenyt és a használhatóságot.
Az alkalmazásban több helyen nincsenek megfelelően jelezve és kezelve a hibák, hibás bemenetek, például a Start gomb után a játékosok számának beírásakor nem csak pozítiv egész számot lehet megadni. Hibás inpu esetén nem indul el az alkalmazás, viszont nem is ad visszajelzést a felhasználónak a megtörtént hibákról.
Illetve a játék menete során, ha a felhasználó a Create Gate vagy Create Robot gombokat nyomja meg a felhasználó, akkor a programban Exception-ök keleztkeznek, viszont erről az alkalmazás nem értesíti a felhasználót, aki így csak annyit érzékel, hogy a művelet nem hajtódik végre, nem történik a UI felületen változás.

Stress testing and load testing

Stress testing: ez a tesztelési módszer arra való, hogy megtaláljuk a rendszer törési pontját. Az a célunk vele, hogy megtudjuk, a rendszer a vártnak megfelelően viselkedik-e, ha a normál limiteken kívül eső értékekkel használjuk. Ez a teszt az esteleges biztonsági réseket és memóriaszivárgást is ellenőrzi. Lényege a rendszer stabilitásának ellenőrzése.

Load testing: ez a tesztelési módszer arra való, hogy a rendszer teljesítményét ellenőrizze az elvárt adatmennyiséggel. Az a célunk vele, hogy ellenőrizzük a válaszidőt az adott adatmennyiségre. A rendszer megbízhatóságát ellenőrzi.

10000 settler megadása is lehetséges a játék elindítása után, viszont nem csak összefolynak a grafikus felületen a telepesek, hanem magát a programot is túlterheli és rendkívül lelassítja az óriási input. A játékprogram egyértelműen kevesebb settlerre van tervezve, viszont a settlerek számának megadásakor nincs felső limit beállítva. Így a felhasználó könnyen belefuthat abba, hogy a nagy input miatt játék közben többször lefagyjon a program.

Manuálisan végzett tesztelés során 10000 telepest megadva, majd utána gyorsan kattintgatva az egyik választható gombot, a felületen csak a kattintások befejezése után jelenik meg az aktuális állapot, közben több állapot nem jelenik meg.Ez a probléma már olyan kicsi, mint 10 klikkelés hatására is megjelent, például settler1-től elindulva 10-szer gyorsan a "Move" gombra kattintva nem jelenik meg, hogy épp settler2, settler3 stb. lépését hajtottuk végre, csak miután abbahagyjuk a kattintgatást, akkor írja ki, hogy settler11. Ez megtévesztő lehet a felhasználó számára, hiszen ha akár csak egy settlert nem jelenít meg a program, hiheti azt, hogy a meg nem jelenő telepes nem is létezik már.

Már a manuális tesztelés során se működött megfelelően a játék, így valószínűsíthető, hogy ha gépi vezérléssel lenne tesztelve (tehát olyan gyakori kattintások lennének lehetségesek, amiket átlagos emberi reflexekkel nem feltétlen tudunk produkálni) és beállítanánk, hogy  kattintson folyamatosan a gombokra, akkor hamar elérhetnénk, hogy ne válaszoljon a program.

Stesszteszteléssel megállapítható lenne, mekkora az a maximális input, amivel a program még működni képes, illetve load tesztelés során az adott bemenetek esetén a válaszidőt tesztelhetnénk. A tesztek eredményei alapján lenne a legcélszerűbb a játékprogram optimalizálása. A breaking point alapján például limitet kéne beállítani az inputra. Emellett a  load testing válaszidejei alapján el lehetne dönteni, mi az a válaszidő, ami még nem túl hosszú a felhasználó számára és így finomítani lehetne a beállított limitet.
