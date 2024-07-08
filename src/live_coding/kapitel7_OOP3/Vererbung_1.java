package live_coding.kapitel7_OOP3;

// super class
class Tier{
    String name = "TUTU";
    String farbe;
}

// sub class
class Katze extends Tier{
    String farbe;
    boolean schurrbart;
    String augenFarge = "blau";
}

class Hund{
    int alter = 2;
}

public class Vererbung_1 {
    public static void main(String[] args) {

        Hund hund = new Hund();
        System.out.println(hund.alter); // 2

        Tier tier1 = new Tier();
        Tier tier2 = new Tier();

        System.out.println(tier1.name); // TUTU
        System.out.println(tier2.name); // TUTU
        tier1.name = "tutu1";
        tier2.name = "tutu2";
        System.out.println(tier1.name);  // tutu1
        System.out.println(tier2.name); // tutu2

        System.out.println(tier2.farbe); // null

        Katze katze1 = new Katze();
        Katze katze2 = new Katze();

        System.out.println(katze1.name);  // TUTU

        katze1.name = "kuku1";
        System.out.println(katze1.name); // kuku1
        System.out.println(katze1.farbe); // null

        System.out.println(katze2.name); // TUTU

        System.out.println(katze1.schurrbart); // false
        System.out.println(katze1.augenFarge); // blau

        System.out.println(katze2.schurrbart); // false
        System.out.println(katze2.augenFarge); // blau
    }
}
