package live_coding.kapitel4_methoden;
// 8 / 2 = (4) oder (4.0)
// 8.0 / 2 = 4.0
// 8 / 2.0 = 4.0
// 8.0 / 2.0 = 4.0

// 7 / 2 = (3) oder (3.0) je nachdem
// 7.0 / 2 = 3.5
// 7 / 2.0 = 3.5
// 7.0 / 2.0 = 3.5

public class Methoden1 {

    // 1): keine Parameter, kein return
    // Definition der Methode (= "deklarieren")
    public static void printSomething(){
        System.out.println("-----------");
        System.out.println("hi there");
        System.out.println("I love java");
        System.out.println("Today is Sunday");
        System.out.println("Bye");
        System.out.println("-----------");
    }

    // 2): mit parameter, kein return
    public static void berechneMax(double x, double y){
        if (x > y){
            System.out.println("Die erste Zahl ist groesser: " + x);
        }
        else {
            System.out.println("Die zweite Zahl ist groesser: " + y);
        }
    }

    // 3): ohne parameter, mit return
    public static int returnIndex(){
        int[] fixedArr = {99, 10000, 60000, 50};
        return fixedArr[0];
    }

    // 4): mit parameter, mit return
    public static double berechneFlaeche(int hoehe, int basis) {
        double flaeche = hoehe * basis / 2;
        return flaeche;
    }

    public static void main(String[] args) {
//        // Methoden
//
//        // Aufruf oder Verwendung der Methode (="Aktivieren")
//        System.out.println("Khaled");
//        printSomething();
//        printSomething();
//        printSomething();
//        printSomething();
//        System.out.println("Lina");
//        System.out.println("=============");
//
//        berechneMax(5, 9);
//        berechneMax(15, 9);
//        berechneMax(458273475, 458273465);
//
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        double ergebnis1 = berechneFlaeche(3, 6);
//        double ergebnis2 = berechneFlaeche(5, 4);
//
//        berechneMax(ergebnis1, ergebnis2);
////        berechneFlaeche(2, 8);
////        berechneFlaeche(5, 2);
////        System.out.println(flaeche);
//
//        int myIndex = returnIndex();
//        System.out.println(myIndex);

    }

}
