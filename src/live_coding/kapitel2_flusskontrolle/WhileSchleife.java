package live_coding.kapitel2_flusskontrolle;


// alternative:
//      1). if-else ausdruecke
//      2). switch

// Schleifen (loop):
//      1). while-schleife (HEUTE): FERTIG!!!!!!
//      2). for-schleife (Hoffentlich auch heute)
//      3). for each
//      4). do-while

public class WhileSchleife {
    public static void main(String[] args) {
        // Hausaufgabe: print "i love java" 1000 mal;

        // 1. Erstelle ein zaehler. Der zaehler soll am anfang 0 sein
        // 2. Dann printe "i love java".
        // 3. Dann erhoehe (inkrementiere) den zaehler um 1.
        // 4. ist zaehler < 999? wenn ja dann stopp.
        // 5. Wiederhole schritte 2 bis 3

        int x = 7;
        System.out.println(1 + 1); // 2
        System.out.println("1 + 1"); // 1 + 1
        System.out.println("1" + "1"); // 11
        System.out.println(1 + 1 + "1"); // 21
        System.out.println("1" + 1 + 1 + "1"); // 1111
        System.out.println("1" + 1 + 1); // 111

        System.out.println("Der Wert von x ist: " + "x" + "wow"); // Der Wert von x ist: x wow
        System.out.println("Der Wert von x ist: " + x + " wow"); // Der Wert von x ist: 7 wow






        System.out.println("=====while-schleife besodners unten=====");

        int schritt = 0;

        while (true){

            if(x < 13){
                break;
            }

            else {
                System.out.println("Du darfst ins Kino");
            }
        }









        System.out.println("=====while-schleife unten=====");

        int zaehler = 0;

        while (zaehler < 5){
            System.out.println(zaehler + ". I love Java");
            zaehler++; // zahler += 1  oder zaehler = zaehler + 1
        }





        System.out.println("======for-schleife unten======");

        for(int counter = 0; counter < 5; counter++){
            System.out.println(counter + ". I love Java");
        }


    }
}

