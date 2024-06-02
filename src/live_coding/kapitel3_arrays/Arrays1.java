package live_coding.kapitel3_arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // english  |  deutsch
        // zero     |  Null
        // null     |  Nichts
//        ====================
        // Arrays / Zeichenketten
        // Motivation
        int zahl1 = 5;
        int zahl2 = 10;
        int[] zahlenArray = {3, 6, 8, 9};

        String name1 = "java";
        String name2 = "python";
        String[] namenArray = {"java", "C++"};

        // Arrays richtig verwenden
        int x; // 1. deklarieren (=definieren)
        x = 6; // 2. initialisieren (= einen Wert zuweisen)
        System.out.println(x);
        System.out.println("-----------------");

        int[] numberArr; // 1. deklarieren (=definieren)
        numberArr = new int[3]; // 2. Speicher allozieren (=reserviere platz)

        System.out.println(numberArr[0]);
        System.out.println(numberArr[1]);
        System.out.println(numberArr[2]);

        // ten years later
        numberArr[0] = 7; // 3. initialisieren (= einen Wert zuweisen)
        numberArr[1] = 54; // 3. initialisieren (= einen Wert zuweisen)
        numberArr[2] = 50; // 3. initialisieren (= einen Wert zuweisen)

        System.out.println(numberArr[0]);
        System.out.println(numberArr[1]);
        System.out.println(numberArr[2]);

        System.out.println("====== kompaktere Schreibweise=======");
        int y; // 1. deklarieren (=definieren)
        y = 6; // 2. initialisieren (= einen Wert zuweisen)
        int z = 7; // 1. deklarieren UND 2. initialisieren

        int[] numberArr1; // 1. deklarieren (=definieren)
        numberArr1 = new int[3]; // 2. Speicher allozieren (=reserviere platz)

        // das ist die neue kompakte Schreibweise
        int[] numberArr2 = new int[3]; //  1. deklarieren UND 2. Speicher allozieren (=reserviere platz)
        numberArr2[0] = 7; // 3. initialisieren (= einen Wert zuweisen)
        numberArr2[1] = 54; // 3. initialisieren (= einen Wert zuweisen)
        numberArr2[2] = 50; // 3. initialisieren (= einen Wert zuweisen)

        for (int i = 0; i < 3; i++){
            System.out.println(numberArr2[i]);
        }

        System.out.println("====== kompaktere Schreibweise, je nach Situation=======");
        System.out.println("====== neue Situation: Die Werte sind schon bekannt=======");

        // Ich soll die groesse des arrays NICHT angeben (ich darf nicht, sonst bekomme ich ein Error)!!!!!!!!!
        // Die Groesse wird automatisch erkannt

        int[] produkteArr1; // 1. deklarieren (=definieren)
        produkteArr1 = new int[]{20, 30, 40, 60, 10}; // 2. Speicher allozieren (=reserviere platz) UND 3. initialisieren

        int[] produkteArr2 = new int[]{20, 30, 40, 60, 10}; //  1. deklarieren UND 2. allozieren UND 3. initialisieren

        System.out.println("====== OPTIONAL - kompaktere Schreibweise, (kuerzer)=======");

        // int[] produkteArr3; // 1. deklarieren (=definieren)
        // produkteArr3 = new int[]{20, 30, 40, 60, 10};; // 2. Speicher allozieren (=reserviere platz) UND 3. initialisieren

        int[] produkteArr4 = {20, 30, 40, 60, 10}; //  1. deklarieren UND 2. allozieren UND 3. initialisieren
        System.out.println("_________________________________");
        System.out.println("-------------Beispiel------------");
        System.out.println("_________________________________");

        double durchschnitt = 0;
        double summe = 0;
        //double[] temp = new double[]{15.5, 14, 20.1, 10.5, 11.1, 12, 13.5};
        double[] temp = {15.5, 14, 20.1, 10.5, 11.1, 12, 13.5};

        for (int i = 0; i < temp.length; i++){
            summe = summe + temp[i];

            //System.out.println(temp[i]);
            System.out.println(summe);
            System.out.println("_________________________________");
        }
        durchschnitt = summe / temp.length;

        System.out.println("_________________________________");
        System.out.println("durchschnitt= " + durchschnitt);

    }
}
