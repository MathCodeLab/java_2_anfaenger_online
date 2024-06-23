package live_coding.kapitel5_OOP;

// class erstellen
class Tier{
    static String rasse;
    static String farbe;

    String name;
    int alter;

}

class Human{
    static String rasse;
    static int age;
    String name;

    void printSomething(){
        System.out.println("Das ist eine Methode, die zu der (((Human-objekte))) gehoert");
    }

    static void printSomethingStatic(){
        System.out.println("Das ist eine Methode, die zu der (((Human-class))) gehoert");
    }

    public static void myMain(){
        Human human_obj1 = new Human();
        Human human_obj2 = new Human();

        human_obj1.printSomething();
        Human.printSomethingStatic();
        printSomethingStatic();

        Human.rasse = "ka";
        human_obj1.name = "ahmad";

        System.out.println(Human.rasse);
        System.out.println(rasse);
        System.out.println(human_obj1.name);

        System.out.println(Klassen2_static.rasse);
        System.out.println(Klassen2_static.age);

        Klassen2_static klassen2_static_obj = new Klassen2_static();
        klassen2_static_obj.name = "khaled";
        System.out.println(klassen2_static_obj.name);
    }

}

public class Klassen2_static {
    static String rasse;
    static int age;
    String name;

    void printSomehting(){
        System.out.println("Das ist eine Methode, die zu der ((((Klassen2_static-objekte)))) gehoert");
    }

    static void printSomehtingStatic(){
        System.out.println("Das ist eine Methode, die zu der ((((Klassen2_static-class)))) gehoert");
    }

    public static void main(String[] args) {

        Tier.farbe = "brown";

        // instanz erstelen, objekt ersetllen, oder beispielobjekt erstellen
        Tier tier_obj1 = new Tier();
        Tier tier_obj2 = new Tier();

        Human human_obj1 = new Human();
        Human human_obj2 = new Human();

        // ------------------------------
        System.out.println(tier_obj1.rasse); // null
        // System.out.println(human_obj1.rasse);

        // tier1 ausfuellen
        tier_obj1.name = "sweetie";
        tier_obj1.alter = 6;

        tier_obj1.rasse = "kurze haare";
        System.out.println(tier_obj1.rasse); // "kurze haare"

        // tier 2
        System.out.println(tier_obj2.rasse); // "kurze haare"

        tier_obj2.rasse = "lange haare";
        System.out.println(tier_obj2.rasse); // "lange haare"
        System.out.println(tier_obj1.rasse); // "lange haare"
        System.out.println(Tier.rasse); // "lange haare"


        System.out.println(human_obj1.rasse); // null
        System.out.println(human_obj2.rasse); // null

        Human.age = 1;
        System.out.println(Human.age); // 1
        System.out.println(human_obj1.age); // 1
        System.out.println(human_obj2.age); // 1

        System.out.println("***************************");
        human_obj1.printSomething();
        Human.printSomethingStatic();

        printSomehtingStatic();
        Klassen2_static.printSomehtingStatic();

        Klassen2_static klassen2_static_obj = new Klassen2_static();
        klassen2_static_obj.name = "Mohammad";
        System.out.println(klassen2_static_obj.name);
        klassen2_static_obj.printSomehting();

        System.out.println(Klassen2_static.rasse);
        System.out.println(rasse);
        System.out.println(human_obj2.name);

    }
}
