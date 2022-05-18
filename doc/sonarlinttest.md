## Manuális kód átvizsgálás elvégzése az alkalmazás egy részére + Statikus analízis eszköz futtatása és jelzett hibák átnézése

Az alkalmazás osztályait vizsgáltam meg SonarLint segítségével, a Code Smelleket detektáltam és a nagyobb hibákat a SonarLint javaslatai alapján javítottam.

Minor code smellek:
A kód egészében nem a megfelelő java által előírt szabványos szintaktikát használjuk, miszerint decreaseLayer() lenne egy függvény neve, nem DecreaseLayer()

A dokumentálás további részében a kritikus code smelleket említem és ezekre javaslok javításokat. Végig néztem az összes osztályt, de nem minden code smellt csak egyszer említenék.

# Main.java

Code Smell: A Random objektumok külön-külön függvénybe vannak létrehozva, ahelyett hogy egyszer az osztályba létre lenne hozva.
Javítás: Statikus random objektum létrehozása

Code Smell: Statikus változó értékének változtatása nem statikus függvényből
Javítás: Függvény statikussá tétele

Code Smell: Generikus HashMap létrehozásnál adjuk meg a típust is az értékadásnál is
Javítás: private static HashMap<String, Object> hash = new HashMap<String,Object>();

# Asteroid.java

Code Smell: Hiánzyik az if statement után a zárójel, így nem mindenki számára egyértelmű, hogy pontosan mire vonatkozik az if
Javítás: {} használata

# ControlPanel.java

Code Smell: Nem használt tagváltozók benne maradtak a kódban.
Javítás: Kitörölni ezeket

Code Smell: Nem mentjük el változóba egy objektumon meghívottt függvény értékét.
Javítás: Mentsük el új változóba.

# GAsteroid.java

Code Smell: Két ugyanolyan nevű változó van, az egyik az osztály tagváltozója, a másik egy tagfüggvényben van létrehozva feleslegesen.
Javítás: Egyik változó törlése




