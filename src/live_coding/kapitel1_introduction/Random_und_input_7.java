package live_coding.kapitel1_introduction;

import java.util.Random;
import java.util.Scanner;

public class Random_und_input_7 {
    public static void main(String[] args) {
        // Rate eine Zahl zwischen 0 und 10.
        // Aufgabe 1): Du hast 3 Versuche!
        // Aufgabe 2).Du hast unendliche verusche
        // -----------------------------------------
        // int randomNumber = 8;
        // int userGuess = 7;

        Scanner myInput = new Scanner(System.in); // ich erstelle ein Objekt namens "myInput". Das macht man nur einmal.
        Random myRandom = new Random(); // ich erstelle ein Objekt namens "myRandom". Das macht man nur einmal.
        // myInput.nextLine();
        // myInput.nextBoolean();
        // boolean randomBoolean = myRandom.nextBoolean();
        // System.out.println(randomBoolean);

        int randomNumber = myRandom.nextInt(0,11);
        // System.out.println(randomNumber);

        int userGuess = 0;
        int counter = 1;

        // while(userGuess != randomNumber){
        while(true){

            System.out.print("Rate eine Zahl: ");
            userGuess = myInput.nextInt();

            if(randomNumber == userGuess){
                System.out.println(counter + "). Versuch. Richtige Antwort. Du hast gewonnen!!!!!");
                break;
            }

            System.out.println(counter + "). Versuch. Falsche Antwort. Versuche's nochmal");

            counter++;

//            if(counter == 3){
//                System.out.println("Du hast deine Versuche ausgenutzt. Die richtige Antwort waere: " + randomNumber);
//            }

        }

        if (randomNumber != userGuess) {
            System.out.println("Du hast deine Versuche ausgenutzt. Die richtige Antwort waere: " + randomNumber);
        }

//        for(int zaehler = 0; zaehler < 3; zaehler++){
//
//            System.out.print("Rate eine Zahl: ");
//            userGuess = myInput.nextInt();
//
//            if(randomNumber == userGuess){
//                System.out.println(counter + "). Versuch. Richtige Antwort. Du hast gewonnen!!!!!");
//                break;
//            }
//
//            System.out.println(counter + "). Versuch. Falsche Antwort. Versuche's nochmal");
//        }




    }
}
