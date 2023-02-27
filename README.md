# ArrayUtils
## Simple project that contains array handling and JUnit tests. Made with Java and build with Maven.

You can run program with Maven (```mvn compile exec:java```). Arguments is given in pom.xml file. You can give your own arguments with flag from command line. If you do so, give the numbers separated by commas, without spaces (example: ```mvn compile exec:java -Dexec.args="1,4,8,16"```).

Tests can be run with ```mvn test```

### Assigment (in Finnish)
Java-ohjelma yksikkötesteineen, joka selvittää pienimmän määrän numeroita mitä luonnollisessa järjestyksessä mahtuu taulukon eri numeroiden välille. Esimerkiksi taulukon [ 1, 4, 10 ] oikea vastaus olisi 2, sillä numeroiden 1 ja 4 väliin mahtuu numeron 2 ja 3 ja muiden numeroiden väliin mahtuisi suurempi kappalemäärä numeroita.
1. Funktio voi olettaa, että kaikki taulukon elementit sisältävät luonnollisen numeron
2. Funktion täytyy toimia samalla tavalla vaikka taulukon numeroiden järjestys muuttuisi
3. Funktion täytyy toimia samalla tavalla vaikka taulukossa olisi useampi sama numero
4. Funktion täytyy toimia samalla tavalla vaikka taulukossa olisi usealla numeroilla samanpituinen väli, esimerkiksi [ 1, 3, 5 ]

### Own observations about assignment (in Finnish)
Toteutin tehtävän mahdollisimman tarkasti annettuja reunaehtoja noudattaen, mutta muutama huomionarvoinen kommentti liittyen ylempänä kirjattuihin ehtoihin (1-4).
* Kohdat 1-2: Funktio olettaa numeroiden olevan kokonaislukuja, mutta negatiiviset arvot sallitaan. Funktio järjestää saamansa taulukon/numerot luonnolliseen järjestykseen, jolloin järjestyksellä ei ole merkitystä.
* Kohta 3: Tulkitsin kohdan niin, että mikäli annettu taulukko numeroita sisältää useamman saman luvun tai vastaavasti vierekkäiset luvut, pienin mahdollinen määrä numeroita lukujen väliin on ei yhtään.
