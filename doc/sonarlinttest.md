## Manuális kód átvizsgálás elvégzése az alkalmazás egy részére + Statikus analízis eszköz futtatása és jelzett hibák átnézése
<<<<<<< Updated upstream
=======

Az alkalmazás osztályait vizsgáltam meg SonarLint segítségével, a Code Smelleket detektáltam és a nagyobb hibákat a SonarLint javaslatai alapján javítottam.

#Main.java

Code Smell: A Random objektumok külön-külön függvénybe vannak létrehozva, ahelyett hogy egyszer az osztályba létre lenne hozva.
Javítás: Statikus random objektum létrehozása

Code Smell: Statikus változó értékének változtatása nem statikus függvényből
Javítás: Függvény statikussá tétele

Code Smell: Generikus HashMap létrehozásnál adjuk meg a típust is az értékadásnál is
Javítás: private static HashMap<String, Object> hash = new HashMap<String,Object>();

>>>>>>> Stashed changes

Az alkalmazás osztályait vizsgáltam meg SonarLint segítségével, a Code Smelleket detektáltam és a nagyobb hibákat a SonarLint javaslatai alapján javítottam.

#Main.java

Code Smell: A Random objektumok külön-külön függvénybe vannak létrehozva, ahelyett hogy egyszer az osztályba létre lenne hozva.
Javítás
