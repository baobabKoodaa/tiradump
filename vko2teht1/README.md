
Tehtävä 1

Saat syötteenä hakusanan. Ohjelmasi pitää vastata, kuinka monessa projektikansion sisällä olevan tiedoston- ja kansion nimessä kyseinen sana esiintyy? Huomaa, että kansioiden alikansiot jne. pitää myös käydä läpi. Käyttämällä rekursiota tehtävä on mahdollista ratkaista muutamalla rivillä koodia.

Tehtävässä voit hyödyntää esimerkiksi seuraavia File-luokan metodeja: getName(), isFile(), isDirectory(), listFiles()

Selvennyksiä:
- Olemme kiinnostuneet tiedostojen nimistä, emme tiedostojen sisällöstä
- Esimerkiksi haku "a" tiedostonimestä "aaa.txt" tulisi kasvattaa laskuria yhdellä, ei kolmella

Vinkki: Kirjoita aluksi koodi, joka toimii vain juurikansion sisällä oleviin tiedostoihin. Lisää laskuriin arvot alikansioiden osalta kutsumalla metodia laske(alikansio). Mieti sitten, kuinka voisit toteuttaa metodin laske?

Esimerkit

1 count("Main.java")  1

2 count("Main")       5

HUOM: projektin "Run tests locally" nappi on jostain syystä disabled, liittyy mahdollisesti projektin "deadlineen" (mistä sen voi määritellä?)
https://github.com/testmycode/tmc-netbeans/issues/81
