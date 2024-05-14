package live_coding.kapitel1_introduction;

public class DatenTypenUndLiterale_6 {
    public static void main(String[] args) {
        // man kann so schreiben
        int x; // Eine Variable deklerieren (also definieren: Speicherplatz mit Name und Typ reservierne)
        x = 5; // Mit einem Wert initialisieren (also das erste mal einen Wert zuweisen)
        x = 8; // Einen neuen Wert zuweisen (also ueberschreiben)

        // man kann auch so direkt schreiben:
        int y = 7; // Deklarieren und initisalisieren auf einmal

        boolean schalter = false; // boolische Variable
        boolean Strom = true; // boolische Variable


        String vorname1 = "Muhammad";
        String vorname2 = "Ali";
        String nachname = "Klay";
        String seperator = " ";

        String vorUndNachname = vorname1 + seperator + vorname2 + seperator + nachname;

        System.out.println(vorUndNachname);
        System.out.println(vorname1 + seperator + vorname2 + seperator + nachname);
        System.out.println("Muhammad" + " " + "Ali" + " " + "Klay");
    }
}
