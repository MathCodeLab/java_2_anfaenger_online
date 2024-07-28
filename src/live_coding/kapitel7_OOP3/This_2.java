package live_coding.kapitel7_OOP3;

class Person{
    String name;
    int gewicht;

    Person(){
//        this("new name", 1); // standard Werte
        this("new name", 800);
    }

    Person(int gewicht){
        this.gewicht = gewicht;
    }

    Person(String name,  int gewicht){

        System.out.println(name); // osman
        System.out.println(this.name); // null

        this.name = name;
        this.gewicht = gewicht;
    }
}

public class This_2 {
    public static void main(String[] args) {

        Person p1 = new Person();

        System.out.println(p1.name + " " + p1.gewicht);

//        Person p2 = new Person("Jean");
//        Person p3 = new Person(5);
//        Person p4 = new Person("osman", 7);
//
//        System.out.println(p4.name + " " + p4.alter);
    }
}
