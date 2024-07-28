package live_coding.kapitel7_OOP3;

// super keyword:
// - mit variablen (attribute): super.variable
// - mit methoden: super.methodenName()
// - mit konstruktor.

// elternklasse - super class
class Fahrzeug{
    String marke;
    int anzahlRaeder;
    int ps;

    Fahrzeug(){
        System.out.println("leeres Fahrzeug konstruklor");
    }

    Fahrzeug(String marke, int anzahlRaeder, int ps){
        System.out.println("nicht leeres Fahrzeug Konstruktor!!!!!!!!");
        this.marke = marke;
        this.anzahlRaeder = anzahlRaeder;
        this.ps = ps;
    }

    void makeSound(){
        System.out.println("(((((Fahrzeug))))) macht biep");
    }

    void bremsen(){
        System.out.println("(((((Fahrzeug))))) bremst");
    }

}

// child class - sub class
class Pkw extends Fahrzeug{
    String typ;
    int anzahlRaeder = 2;

    Pkw(){
    }
    Pkw(String typ, int anzahlRaeder){
//        super();
        System.out.println("nicht leeres Pkw Konstruktor!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        this.typ = typ;
        this.anzahlRaeder = anzahlRaeder;
    }

    Pkw(String typ, int anzahlRaeder, String marke, int ps){
        super(marke, anzahlRaeder, ps);
        System.out.println("nicht leeres Pkw Konstruktor!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        this.typ = typ;
        this.anzahlRaeder = anzahlRaeder;
    }

    Pkw(int anzahlRaeder, String marke, int ps){
        super(marke, anzahlRaeder, ps);
        System.out.println("nicht leeres Pkw Konstruktor!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    Pkw(String marke, int anzahlRaeder, int ps){
        this.marke = marke;
        this.anzahlRaeder = anzahlRaeder;
        this.ps = ps;
    }

    void makeSound(){
        System.out.println("(((((Pkw))))) macht biep");
    }

    void gasGeben(){
        System.out.println("Fz gibt gas!!!!");
    }

    void printGemeinamkeiten(){
        // 1. super mit variablen
        System.out.println(typ);
        System.out.println(this.typ);
        System.out.println(anzahlRaeder);
        System.out.println(this.anzahlRaeder);

        System.out.println(marke);
        System.out.println(this.marke); // abraten
        System.out.println(super.marke);
        System.out.println(super.anzahlRaeder);
        System.out.println(ps);
        System.out.println(this.ps); // abraten
        System.out.println(super.ps);


        // 2. super mit methoden
        bremsen();
        this.bremsen();

        bremsen();
        super.bremsen();

        makeSound();
        this.makeSound();
        super.makeSound();
    }
}

public class Super_3 {
    public static void main(String[] args) {
        Fahrzeug fz1 = new Fahrzeug();
        // fz1.anzahlRaeder = 4;
        fz1.ps = 100;
        fz1.marke = "rang rover";
//        fz.typ = "";

        Fahrzeug fz2 = new Fahrzeug();
        // fz2.anzahlRaeder = 4;
        fz2.ps = 5;
        fz2.marke = "company DE";
//        fz.typ = "";


        Pkw pkw1 = new Pkw();
        System.out.println(pkw1.marke); // null
        System.out.println(pkw1.anzahlRaeder); // 4
        System.out.println(pkw1.ps); // 0

        pkw1.typ = "Limo";
        System.out.println(pkw1.typ); // Limo


        fz1.makeSound();
        fz2.makeSound();
        pkw1.makeSound();

        pkw1.printGemeinamkeiten();

//        Pkw pkw2 = new Pkw("kombi", 5, "bmw", 1000);
        Pkw pkw = new Pkw("kombi", 4,  "bmw", 1000);
//        pkw.ps = 1;
//        pkw.marke = "bmw";


        Pkw pkw_khaled = new Pkw(1, "skoda", 2000);
        Fahrzeug fahrzeug_khaled = new Fahrzeug("skoda", 1, 2000);

        pkw_khaled.typ = "khaled pkw";
//        fahrzeug_khaled.typ = "kahled fahrzeug";
    }
}
