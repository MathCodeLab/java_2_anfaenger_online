package live_coding.kapitel6_OOP2;

// toString Methode

// 1. erstelle eine klasse namesn xyz
class Wohnung {
    // 2. die klasse soll 2 variablen haben
    int quadrat;
    int zimmer;

    // 3. erstelle 3 konstruktoren
    Wohnung(){
    }

    Wohnung(int quadrat){
        this.quadrat = quadrat;
    }

    Wohnung(int quadrat, int zimmer){
        // 4. nutze `this` keyword in 1 konstruktor
        this.quadrat = quadrat;
        this.zimmer = zimmer;
    }

    String printInfo(){
        String text1 = "Quadrat: " + quadrat + ", ";
        String text2 = "Anzahl Zimmer: " + zimmer;
        return text1 + text2;
    }

    public String toString(){
        return "Quadrat: " + quadrat + ", " + "Anzahl Zimmer: " + zimmer;
    }

}

public class OOP_toString_1 {
    public static void main(String[] args) {
        // 5. erstelle 3 objekte fuer jeden kunstruktor
        Wohnung wohnung1 = new Wohnung();
        Wohnung wohnung2 = new Wohnung(50);
        Wohnung wohnung3 = new Wohnung(33,2);

        System.out.println(wohnung1.printInfo());
        System.out.println(wohnung2.printInfo());
        System.out.println(wohnung3.printInfo());

        System.out.println("------------");

        System.out.println(wohnung1.toString());
        System.out.println(wohnung2);
        System.out.println(wohnung3);
    }
}
