# Egységtesztek készítése

Az Asteroid és Settler osztályt egészítettem ki Unit tesztekkel. Ezek a különböző metódusok működésének helyességét ellenőrzik.
## TestClassAsteroid
  * AsteroidDecreaseLayer() - csökken az aszteroida kérgének nagysága egyel
  * AsteroidAddCreature() - új Creature objektum ekrül az aszteroidára
  * AsteroidRemoveCreature() - egy Creature elmegy az aszteroidáról
  * AsteroidSetCloseToSunTrue() - az aszteroida napközelbe kerül
  * AsteroidSetCloseToSunFalse() - az aszteroida nincs napközelben 
  * AsteroidSolarStorm() - az aszteroida napviharba kerül, de a rajta lévők el tudnak bújni, így enm halnak meg
  * AsteroidTransport() - egy telepes utazik az aszteroidára
  * AddNeighbour() - új szomszédja lesz aszteroidának

## TestClassSettler:
  * SettlerDrill() -  a telepes lefúr az aszteroida rétegébe, az csökken
  * SettlerMine() - a telepes kbányássza aza szteroidában lévő nyersanyagot, így nála lesz egy, míg az aszteroidában nem marad semmi
  * SettlerCreateRobot() - a telepes rendelkezik a megfelelő nyersanyagokkal rendelkezik, így tud készíteni egy robotot
  * SettlerCreateGate() - a telepes rendelkezik a megfelelő nyersanyagokkal rendelkezik, így tud készíteni egy teleport kapu párt
  * SettlerPlaceGate() - a telepes két aszteroidára lehelyez egy-egy kaput
  * SettlerMove() - a telepes egy szomszédos aszteroidára mozog
  * SettlerRestoreMaterial() - a telepes egy visszahelyez egy nyersanyagot az üres aszteroidára

A tesztek, a SettlerCreateRobot kivételével lefutottak jól. Itt sem a függvény működése volt rossz, hanem NullPointerExceptiont dobott. Tehát ez a függvény olyan metódust is elér, ami már a megjelenítéshez kapcsolódik, így sokkal nehezebb a kódot tesztelni. Célszerű lenne az ezek közötti függőséget csökkenteni.
![image](https://user-images.githubusercontent.com/71429144/169164491-5448ee17-b0ae-4e40-a0ff-7c3aa7de3ea9.png)

# Kód lefedettség:
A kód lefedettségét az IntelliJ beépített CodeCoverage elemzőjével ellenőrztem. Itt leolvasható hogy a különböző osztályoknak mennyi függvény, sora van lefedve a tesztek álltal.

TestClassAsteroid:
Az Asteroid osztály függvényeit teszteli, 
![image](https://user-images.githubusercontent.com/71429144/169163996-a7df3db3-8a69-48f8-9440-256c234e95b4.png)

TestClassSettler osztály kódlefedettsége:
Ez főként az Settler osztláy metódusainak helyességét ellenőrzi (16-ból 14-et).
![image](https://user-images.githubusercontent.com/71429144/169164270-980b5109-a0a5-4994-ab54-a65c70e04e48.png)
