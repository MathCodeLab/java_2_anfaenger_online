package live_coding.kapitel1_introduction;

import java.util.Scanner;

public class Exception_8 {
    public static void main(String[] args) {

        System.out.println("Hello");
        int x = 4;
        int y = 0;
        int ergebnis = 0;

        System.out.println("======  erstes check========");
        try {
            ergebnis = x / y;
            System.out.println(ergebnis);
            System.out.println("das geht");
        }

        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(ergebnis);
        }

        System.out.println("Good Bye!");


        System.out.println("======  zweites check========");


        int arr_laenge = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            arr_laenge = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        int[] arr = new int[arr_laenge];

        try{
            arr[0] = 34;
            arr[1] = 456;
            arr[2] = 6000;
            System.out.println("neuen Wert zu setzen hat geklappt.");
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("ein letazten goodbye");
    }
}
