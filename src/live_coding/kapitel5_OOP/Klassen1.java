package live_coding.kapitel5_OOP;

//int[] arr1 = new int[3];
//arr1[0] = 7;
//arr1[1] = 8;
//arr1[2] = 21;
//System.out.println(arr1[2]);

//int[] arr2 = {6,5,7,8,9};
//arr2[0]

class Mensch {
    String name;
    String augenFarbe;
    char geschlecht;
    int alter;
}

class Haus{
    String adresse;
    int plz;
    String farbe;
    int anzahlZimmer;
    int preis;
}

public class Klassen1 {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; // arr erstellen: 1) deklarieren und 2) allozieren
        int[] arr2 = new int[4];
        arr1[0] = 7;  // 3) initialisieren
        arr1[1] = 8;  // 3) initialisieren
        arr1[2] = 21;  // 3) initialisieren


        // Mensch: class
        // mensch1, mensch2: Objekte bzw. instanzen bzw. ("beispiel")
        Mensch mensch1 = new Mensch(); // objekt erstellen
        Mensch mensch2 = new Mensch();

        Haus haus1 = new Haus();
        Haus haus2 = new Haus();
        Haus haus3 = new Haus();

        mensch1.name = "mohammad";
        mensch1.alter = 80;
        mensch1.geschlecht = 'M';
        mensch1.augenFarbe = "schwarz";

        System.out.println(mensch1.alter); // 80
        System.out.println(mensch2.alter); // 0

        mensch2.name = "lina";
        mensch2.alter = 8;
        mensch2.geschlecht = 'F';
        mensch2.augenFarbe = "brown";
        System.out.println(mensch2.alter); // 8


        haus1.adresse = "berliner str. 46";
        haus2.adresse =  "ber;berliner str. 33";
        haus3.adresse = "berlinerstr. 2";

        haus1.plz = 23435;
        haus2.plz = 23435;
        haus3.plz = 23435;

        haus1.farbe = "weis";
        haus2.farbe = "schwarz";
        haus3.farbe = "weis";


    }

}
