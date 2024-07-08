package live_coding.kapitel6_OOP2;

class Kurs{
    String name;
    int teilnehmer;
    private int id;

    //konstruktoren
    Kurs(){
    }

    Kurs(String name, int teilnehmer, int id){
        this.name = name;
        this.teilnehmer = teilnehmer;
        this.id = id;
    }

    // **getter** methode: gibt den privaten Variable zuerueck
    // nuetzlich, wenn man den Wert von der  privaten Variable printen moechte
    public int getId() {
        return id;
    }

    // **setter** methode: aednert den Wert der privaten Variable.
    public void setId(int id) {
        this.id = id;
    }
}

public class Kapselung_4 {
    public static void main(String[] args) {
        Kurs kurs1 = new Kurs();
        kurs1.name = "Python";
        kurs1.teilnehmer = 10;
        kurs1.setId(123);
        System.out.println(kurs1.getId());

        Kurs kurs2 = new Kurs("java", 5, 1000);
        System.out.println(kurs2.getId());
        kurs2.name = "C++";
        kurs2.setId(420);
        System.out.println(kurs2.getId());

        Kurs kurs3 = new Kurs("java", 5, 321);
    }
}
