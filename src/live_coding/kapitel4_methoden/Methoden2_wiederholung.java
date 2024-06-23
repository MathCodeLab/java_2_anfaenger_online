package live_coding.kapitel4_methoden;
// Methoden
public class Methoden2_wiederholung {

    void printNichtStatisch(){
        System.out.println("i am not astatic methoid");
    }

    // methode definieren
    // kein rueckgabewert, keine Parameter
    static void printSomething(){
        System.out.println("i love java");
    }
    // kein rueckgabewert, mit Parameter
    static void printNameUndAlter(String name, int alter){
        System.out.println(name + " " + alter);
    }

    // mit rueckgabewert, keine Parameter
    static String returnString(){
        return "java";
    }

//     mit rueckgabewert, mit Parameter
    static double berechneFlaeche(int laenge, double breite){
    return laenge * breite;
    }

    public static void main(String[] args) {
        Methoden2_wiederholung methoden2_wiederholung_obj = new Methoden2_wiederholung();
        methoden2_wiederholung_obj.printNichtStatisch();

        // methode aufrufen
        printSomething();

        printNameUndAlter("mohamad", 60);

        String myText = returnString();
        System.out.println(myText);

        double myFlaeche = berechneFlaeche(4, 6.5);
        System.out.println(myFlaeche);
    }
}
