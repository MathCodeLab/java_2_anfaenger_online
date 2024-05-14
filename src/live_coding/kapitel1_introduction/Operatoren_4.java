package live_coding.kapitel1_introduction;

public class Operatoren_4 {
    public static void main(String[] args) {

        int summe1 = 7 / 2; // 3
        double summe2 = 7 / 2; // 3.0

        double summe3 = 7 / 2.0; // 3.5

        double summe4 = 7.0 / 2; // 3.5

        double summe5 = 7.0 / 2.0; // 3.5


        double pi = 3.14;
        double r = 2.5;

        // umfang : zwei mal pi mal den radius
        double umfang = 2 * pi * r;
        System.out.println(umfang);

        // flaeche: pi mal quadrat von radius
        double flaeche = pi * r * r;
        System.out.println(flaeche);

        // declare variables
        int a = 6;
        int b = 5;

        a += 2; // das gleiche wie a = a + 2  (also wird jetzt a=8)
        a++; // das gleiche wie a = a + 1 (also wird a=9)
        a += b; // das gleiche wie a = a + b (also wird a=14)
        System.out.println(a);
        System.out.println(b);

        // Vergleichsoperatoren
        // Antwort der Vergleich hat den Typ "boolean".
        // man kann zahlen direkt in der "print" vergleichen
        System.out.println(5 < 10); // true
        System.out.println(10 < 10); // false
        System.out.println(10 <= 10); // true, weil 10 ist kleiner oder GLEICH 10 ist.

        // Am besten man speichert die Zahlen in Variablen speichern.
        int zahl1 = 1;
        int zahl2 = 2;
        System.out.println(zahl1 < zahl2);

        // Man kann auch den Vergleichsergebnis in einer Variable speichern. Diese Variable muss boolean sein:
        boolean ergebnis = zahl1 < zahl2;
        System.out.println(ergebnis); // true

        // Logische Opratoren
        // AND operatoren
        System.out.println(false && false);  // false
        System.out.println(false && true);  // false
        System.out.println(true && false);  // false
        System.out.println(true && true);  // true

        System.out.println(false || false);  // false
        System.out.println(false || true);  // true
        System.out.println(true || false);  // true
        System.out.println(true || true);  // true

        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println(true && (8 > 5));  // true
        System.out.println(false && (8 < 5) || true);  // true
        System.out.println(false || (8 < 5) && true);  // false

        System.out.println(false == false); // true
        System.out.println(false == true); // false
        System.out.println(true == false); // false
        System.out.println(true == true); // true

        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println(5 == 3); // false, da 5 ist nicht gleich 3
        System.out.println(!(5 == 3)); // true, weil 5 ist nicht gleich 3, aber das ganze wird negiert.
        System.out.println(5 == 5); // true
        System.out.println(!(5 == 5)); // false

    }
}
