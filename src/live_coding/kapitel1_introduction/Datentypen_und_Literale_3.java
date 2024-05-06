package live_coding.kapitel1_introduction;

public class Datentypen_und_Literale_3 {

    public static void main(String[] args) {

        // x ist ein integer zahl -> Ganzzahl -> Ohne komma & +-
        int x = 30;

        // y ist ein integer zahl -> Ganzzahl -> Ohne komma & +-
        int y = 7;

        // egebnis
        int ergebnis = x + y;

        System.out.println(ergebnis);


        int mein_privat_telefon_nummer1 = 6;
        int mein_privat_telefon_nummer2 = 6;

        // es ist verboten einen leerzeichen zu trennen:
        // int mein zahl = 7;

        // ---------------------
        // 1. leiber mit kleinen buchstaben anfangen
        int alter = 6;
        int Alter = 7;
        System.out.println(Alter);

        // 2. nicht mit _ trennen und lieber mit grossbuchstaben
        int meinPrivatTelefonNummer1 = 6;
        int PLZ = 10990;

        float preis = 999.89f;
        int menschenZahlInDeutschland = 85000000;

        int goldkette = 120;
        // String goldkette = "120g";

        short menschGeswicht = 50;

        String passwort = "32546yuthgfvc3u56___--";

        boolean schalter = false;
        boolean schranke = true;

        // ---------------------

        byte x2 = 127; // ganzzahl ohne komma

        double y2 = 5.6; // gleitkommazahl (mit komma)

        char z2 = 'A';

        String m2 = "java";

    }
}
