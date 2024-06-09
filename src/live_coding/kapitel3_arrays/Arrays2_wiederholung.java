package live_coding.kapitel3_arrays;

import live_coding.kapitel4_methoden.Methoden1;

public class Arrays2_wiederholung {
    public static void main(String[] args) {
        // []: Eckige Klammer
        // {}: Geschweifte- oder Schweif- Klammer
        // (): Rundklammer

        // Arrays - Wiederholung
        // 1. Der Inhalt des Arrays ist NICHT bekannt
        // a) deklarieren, b) allozieren, c) initialisieren
        String[] namenArr; // a) deklarieren
        namenArr = new String[3];// b) allozieren

        System.out.println(namenArr[0]);
        System.out.println(namenArr[1]);
        System.out.println(namenArr[2]);
        namenArr[0] = "Khaled"; // c) initialisieren
        namenArr[1] = "Osman"; // c) initialisieren
        namenArr[2] = "Lina"; // c) initialisieren
        System.out.println(namenArr[0]);
        System.out.println(namenArr[1]);
        System.out.println(namenArr[2]);

        // a) deklarieren und b) allozieren in einer Zeile, c) initialisieren
        int[] namenArr1 = new int[3];// a) deklarieren und b) allozieren in einer Zeile

        System.out.println(namenArr1[0]);
        System.out.println(namenArr1[1]);
        System.out.println(namenArr1[2]);
        namenArr1[0] = 7; // c) initialisieren
        namenArr1[1] = 6; // c) initialisieren
        namenArr1[2] = 2; // c) initialisieren
        System.out.println(namenArr1[0]);
        System.out.println(namenArr1[1]);
        System.out.println(namenArr1[2]);
        // ---------
        // 2. Der Inhlat des Arrays ist direkt bein der Erstellung des Arrays bekannt
        // a) deklarieren UND b) allozieren UND c) initialisieren in einer Zeile.
        // boolean[] arr3 = new boolean[3]{true, true, false}; // gibt ein error aus
        boolean[] arr3 = new boolean[]{true, true, false}; // a) deklarieren UND b) allozieren UND c) initialisieren in einer Zeile.
        boolean[] arr4 = {true, true, false}; // a) deklarieren UND b) allozieren UND c) initialisieren in einer Zeile.
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

    }
}
