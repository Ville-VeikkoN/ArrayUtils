# ArrayUtils
## Simple project that contains array handling and JUnit tests. Made with Java and build with Maven.

You can run program with Maven (mvn compile exec:java). Arguments is given in pom.xml file. You can give your own arguments with flag from command line. If you do so, give the numbers separated by comms, without spaces.

### Assigment (in Finnish)
Java-ohjelma yksikkötesteineen, joka selvittää pienimmän määrän numeroita mitä luonnollisessa järjestyksessä mahtuu taulukon eri numeroiden välille. Esimerkiksi taulukon [ 1, 4, 10 ] oikea vastaus olisi 2, sillä numeroiden 1 ja 4 väliin mahtuu numeron 2 ja 3 ja muiden numeroiden väliin mahtuisi suurempi kappalemäärä numeroita.
1. Funktio voi olettaa, että kaikki taulukon elementit sisältävät luonnollisen numeron
2. Funktion täytyy toimia samalla tavalla vaikka taulukon numeroiden järjestys muuttuisi
3. Funktion täytyy toimia samalla tavalla vaikka taulukossa olisi useampi sama numero
4. Funktion täytyy toimia samalla tavalla vaikka taulukossa olisi usealla numeroilla samanpituinen väli, esimerkiksi [ 1, 3, 5 ]

### Own observations about assignment (in Finnish)
Toteutin tehtävän mahdollisimman tarkasti annettuja reunaehtoja noudattaen, mutta muutama huomionarvoinen kommentti liittyen ylempänä kirjattuihin ehtoihin (1-4).
1. Ohjelmisto olettaa että numerot ovat kokonaislukuja, mutta sallii negatiiviset luvut
3. Minun ohjelma toimii niin, että mikäli annettu taulukko numeroita sisältää useamman saman luvun tai vastaavasti vierekkäiset luvut, tulkitsee se, että pienin mahdollinen määrä numeroita lukujen väliin on ei yhtään.

Lähestymistapani on hyvinkin yksinkertainen. Koska ohjelman tulee palauttaa numerot luonnollisessa järjestyksessä (kasvava, kuten....3, 4, 5....) voi annetun taulukon sisällön ensiksi uudelleenjärjestää nousevaksi, jonka jälkeen vertailla vierekkäisten lukujen väliin mahtuvien numeron määrää. Tämän olisi voinut myös toteuttaa vertailemalla vuorotellen jokaista arvoa yksitellen muihin arvoihin.

Toteutin taulukon käsittelyyn (eri arvojen paikkojen vaihtoa ja sorttausta) käyttämäni metodit itse, vaikka ne toki löytyykin jo Arrays -luokan metodeista.
