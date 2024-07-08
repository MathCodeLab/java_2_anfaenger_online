package live_coding.kapitel5_OOP1;

class Sprache{
    String name;
    int version;
    String level;

    void printSomething(int x){
        System.out.println(x);
    }

    Sprache(String myName, int myVersion, String myLevel){
        name = myName;
        version = myVersion;
        level = myLevel;
    }

}

public class Klassen3_konstruktor {
    public static void main(String[] args) {
        Sprache sprache1 = new Sprache("java", 9, "medium");
        System.out.println(sprache1.name);
        System.out.println(sprache1.version);
        System.out.println(sprache1.level);

        System.out.println("------------");
        Sprache sprache2 = new Sprache("python", 7, "low");
        System.out.println(sprache2.name);
        System.out.println(sprache2.version);
        System.out.println(sprache2.level);


//        Sprache sprache2 = new Sprache();

//        sprache1.name = "java";
//        sprache1.version = 9;
//        sprache1.level = "medium";

//        sprache2.name = "python";
//        sprache2.version = 3;
//        sprache2.level = "hoch";
    }
}
