package live_coding.kapitel6_OOP2;

class Mensch{
    int alter;
    String name;

    public String toString(){
        return  name + " " + alter;
    }
}

public class OOP_toString_wiederholung_2 {
    public static void main(String[] args) {
        Mensch mensch = new Mensch();
        mensch.alter = 10;
        mensch.name = "Ahmad";

        System.out.println(mensch);
    }
}
