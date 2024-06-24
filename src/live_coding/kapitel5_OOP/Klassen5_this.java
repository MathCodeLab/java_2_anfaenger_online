package live_coding.kapitel5_OOP;

class Car{
    String model;
    int preis;
    char farbe;

    // Konstruktor 1
    Car(String model, int preis, char farbe){
        System.out.println(model); // bmw
        System.out.println(this.model); // null

        this.model = model;
        this.preis = preis;
        this.farbe = farbe;
    }
}


public class Klassen5_this {
    public static void main(String[] args) {
        Car car1 = new Car("bmw", 100, 'W');
        Car car2 = new Car("bmw", 100, 'W');
        car1.model = "audi";
        car2.model = "tesla";
    }
}
