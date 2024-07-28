package live_coding.kapitel2_flusskontrolle;

public class ForEach { // jede
    public static void main(String[] args) {
        // arrys, (listen, arrylist, linkedlist, maps, queue, collection)
        int[] arr1 = {6,9,3,2,5,78}; // iterierbar
        String[] arr2 = {"khaled", "osman", "mohammad"};

        int richtigeZahl = 3;
        int gereatene_zahl = 7;
        while(true){
            System.out.println("test, test");
            if(gereatene_zahl == richtigeZahl){
                System.out.println("du hast gewonen");
                break;
            }
        }

        for (int index=0; index<arr1.length; index+=2) { // wir laufen ueber den index (position) des arrays
            System.out.println(arr1[index]);
        }

        System.out.println("----------------------");

        for (int number : arr1) { // wir laufen ueber inhalt direkt des arrays
            System.out.println(number);
        }

        for (String name : arr2) { // wir laufen ueber inhalt direkt des arrays
            System.out.println(name);
        }

    }
}
