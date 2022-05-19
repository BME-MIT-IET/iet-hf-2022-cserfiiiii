BDD Testing, azaz Behaviour-Driven Development tesztelés jelentése viselkedés alapú tesztelés, 
amikor is nem technikai oldalról közelítjük meg a fejlesztési feladatot, hanem viselkedési sémák
alapján ellenőrizzük a helyes működést. 
Java-ban a BDD tesztelés egyik eszköze a Cucumber, ami lehetővé teszi a tesztelő számára,
hogy az elvárt viselkedést olyan módon ellenőrizze, hogy azt bérmely felhasználó megértse.
Cucumber-ben a Gherkin nyelv segítségével lehetőség van a tesztelt viselkedést az egyszerű
beszélt nyelvben is használt mondatokkal leírni. Ezeket Scenario-knak nevezzük, és ezekre 
megfogalmazhatunk különböző feltételeket és kimeneteket.
Egy Scenario az alábbi módon néz ki:

![280230014_1460167071079548_4777907563734909978_n](https://user-images.githubusercontent.com/79679983/169374281-faec86ee-ec52-4095-8223-caa12b13855c.png)

Először megadjuk a Scenario címét, majd a Given kulcsszó után megadjuk a tesztbeli adott paramétereket,
utána a teszt feltételeit a When résznél, végezetül pedig a Then kulcsszó után az elvárt kimenetet.
Az alábbi függvényben azt teszteltük, ha a felhasználó egy érvényes inputut ad meg a játékosok
számának a játék kezdetekor.

![280716745_791047988532795_2025086339165108192_n](https://user-images.githubusercontent.com/79679983/169374336-fe5ab511-d695-4fd2-9665-7011138d8f2e.png)

A Scenariok mögötti logikát, azaz a tényleges működés tesztelését egy Step Definiton osztály 
végzi, ahol már rendesen Java kódot írunk.
Itt megadhatók az egyes kulcsszavakhoz tartozó függvényeket.
Az alábbi képen látszik, hogy milyen lépéseket futtat a program, a Given, When és Then annotációk során.

Végezetül, az utolsó képen látszik, hogy a megadott tesztek sikeresen lefutottak, a Scenariok
elvárt módon értek véget.

![280076653_1077102976565963_1467865616217336384_n](https://user-images.githubusercontent.com/79679983/169374383-04c4498a-c29b-42a9-b8c9-21e4368da948.png)
