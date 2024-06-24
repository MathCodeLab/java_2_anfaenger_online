package live_coding.kapitel5_OOP;

/* Aufgaben
 * 1. Erstelle eine Klasse
 * 2. Erstelle eine variable (attribute)
 * 3. Erstelle eine statische variable (attribute)
 * 4. erstelle eine Methode
 * 5. Erstelle eine statische Methode
 * */


// Osman
class Student{

  // Variablen oder Attribute
    String name;
    int alter;
    static int ort;

  // Methoden oder Felder/Field
    void ort_reset(){
        System.out.println(name +" "+ ort);
        ort = 00000;
        System.out.println(name +" "+ ort);
    }
    static void ortAenderen(int newOrt){
        System.out.println(ort);
        ort = newOrt;
        System.out.println(ort);
    }
    void attributeAender(String newName, int newAlter, int newOrt){
        name = newName;
        alter = newAlter;
        ort = newOrt;
    }
    
}






class Auto{
    String model;
    int preis;
    char farbe;
//
//    // Konstruktor
    Auto(String newModel, int newPreis, char newFarbe){
        model = newModel;
        preis = newPreis;
        farbe = newFarbe;
    }

    Auto(String newModel){
        model = newModel;
    }

    Auto(String newModel , int newPreis){
        model = newModel;
        preis = newPreis;
    }

    Auto(){
    }
    
}

public class Klassen4_konstruktor2 {
    public static void main(String[] args) {
//        Auto auto1 = new Auto("Volvo", 23, 'R');
//        Auto auto2 = new Auto("bmw", 230, 'B');
//        Auto auto3 = new Auto("tersla", 230, 'W');
//        Auto auto4 = new Auto("merced3es", 230, 'B');
//        Auto auto5 = new Auto("bmw", 260, 'B');
//        Auto auto6 = new Auto("bmw");

        Auto auto7 = new Auto();
        


        // auto1.model = "bmw";
        // auto2.model = "audi";

        // auto1.preis = 123;
        // auto2.preis = 432;

        // auto1.farbe = 'W';
        // auto2.farbe = 'B';





        Student student1 =  new Student();
    Student student2 =  new Student();

    System.out.println("Objekt1: " + student1.name + ", " + student1.ort);
    System.out.println("Objekt2: " + student2.name + ", " + student2.ort);

    student1.name = "khaled";
    student2.name = "Osman";
    //Student.ort = 47000;
    student1.ort = 55555;

    System.out.println("Objekt1: " + student1.name + ", " + student1.ort);
    System.out.println("Objekt2: " + student2.name + ", " + student2.ort);

    student1.ort_reset();

    System.out.println("Objekt1: " + student1.name + ", " + student1.ort);
    System.out.println("Objekt2: " + student2.name + ", " + student2.ort);

    Student.ortAenderen(12345);

    System.out.println("Objekt1: " + student1.name + ", " + student1.ort);
    System.out.println("Objekt2: " + student2.name + ", " + student2.ort);

    student1.attributeAender("Torin", 2, 12347);
    student1.attributeAender("Lina", 4, 99999);

    System.out.println("Objekt1: " + student1.name + ", " + student1.ort);
    System.out.println("Objekt2: " + student2.name + ", " + student2.ort);
    }



}
