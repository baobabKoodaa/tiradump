
Tehtävä 1

Metodi recursion saa parametreina kansion ja hakusanan. Täydennä metodi palauttamaan, kuinka monessa tiedoston- ja kansion nimessä annettu hakusana esiintyy. Huomaa, että kansioiden alikansiot jne. pitää myös käydä läpi. Käyttämällä rekursiota tehtävä on mahdollista ratkaista muutamalla rivillä koodia. Testit kyselevät projektikansion sisällä olevan "mockfiles" kansion sisältöä. Tehtävässä voit hyödyntää esimerkiksi seuraavia File-luokan metodeja: getName(), isFile(), isDirectory(), listFiles()

Selvennyksiä:
- Olemme kiinnostuneet tiedostojen nimistä, emme tiedostojen sisällöstä
- Esimerkiksi haku "a" tiedostonimestä "aaa.txt" tulisi kasvattaa laskuria yhdellä, ei kolmella

Vinkki: Kirjoita aluksi koodi, joka toimii vain juurikansion sisällä oleviin tiedostoihin. Lisää laskuriin arvot alikansioiden osalta kutsumalla metodia laske(alikansio). Mieti sitten, kuinka voisit toteuttaa metodin laske?

Esimerkit

1 count("txt")       11

HUOM: projektin "Run tests locally" nappi on jostain syystä disabled, liittyy mahdollisesti projektin "deadlineen" (mistä sen voi määritellä?)
https://github.com/testmycode/tmc-netbeans/issues/81
