package live_coding.kapitel2_flusskontrolle;

public class ifElse_Anweisung_1 {
    public static void main(String[] args) {

        //  Kinder unter 10 Jahren dürfen kein Handy kaufen.
        //  Kiner zwischen 10 und 12 Jahren dürfen nur bis zu 2 Stunden pro Tag mit dem Handy spielen.
        //  Kinder ab 13 Jahre koennen ein Handy haben."

        int alter = 15; // das kann irgendeine beliebige nummer sein.

        if (alter < 10) {
            System.out.println("Du darfst KEIN Handy haben");
        }
        if (alter >= 10 && alter < 13) {
            System.out.println("Du darfst NUR 2 Stunden am Tag mit dem Handy spielen");
        }
        if (alter >= 13) {
            System.out.println("Du darfst ein Handy haben");
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Eine andere schreibweise:");

        if (alter < 10) {
            System.out.println("Du darfst KEIN Handy haben");
        }
        else {
            if(alter < 13) {
                System.out.println("Du darfst NUR 2 Stunden am Tag mit dem Handy spielen");
            }
            else {
                System.out.println("Du darfst ein Handy haben");
            }
        }
    }
}
