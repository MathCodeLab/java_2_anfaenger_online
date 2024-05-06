package live_coding.kapitel1_introduction;

public class Operatoren_4 {
    public static void main(String[] args) {
        // 7 / 2 = 3
        // 7.0 / 2 = 3.5
        // 7 / 2.0 = 3.5
        // 7.0 / 2.0 = 3.5

        // int summe1 = 7.0 / 2.0;
        double summe2 = 7.0 / 2.0;

        // System.out.println(summe1);
        System.out.println(summe2);


        double pi = 3.14;
        double r = 2.5;

        // umfang : zwei mal pi mal den radius
        double umfang = 2 * pi * r;

        // flaeche: pi mal quadrat von radius
        double flaeche = pi * r * r;
    }
}
