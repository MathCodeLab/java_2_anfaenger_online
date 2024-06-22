public class Arrays_aufgabe_loesung {
    public static void main(String[] args) {
        int capacity = 10;
        String[] productNames = new String[capacity];
        int[] quantities = new int[capacity];
        double[] prices = new double[capacity];
        int count = 0;

        // Produkte hinzufügen
        if (count < capacity) {
            productNames[count] = "Apfel";
            quantities[count] = 50;
            prices[count] = 0.99;
            count++;
        }
        if (count < capacity) {
            productNames[count] = "Banane";
            quantities[count] = 30;
            prices[count] = 1.29;
            count++;
        }
        if (count < capacity) {
            productNames[count] = "Orange";
            quantities[count] = 40;
            prices[count] = 1.19;
            count++;
        }

        // Alle Produkte anzeigen
        System.out.println("All products in the warehouse:");
        for (int i = 0; i < count; i++) {
            System.out.println("Product: " + productNames[i] + ", Quantity: " + quantities[i] + ", Price: " + prices[i]);
        }

        // Produkt suchen
        String searchProductName = "Banane";
        int foundIndex = -1;
        for (int i = 0; i < count; i++) {
            if (productNames[i].equals(searchProductName)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Found product: " + productNames[foundIndex] + " (Quantity: " + quantities[foundIndex] + ", Price: " + prices[foundIndex] + ")");
        } else {
            System.out.println("Product not found.");
        }

        // Produkt entfernen
        String removeProductName = "Apfel";
        for (int i = 0; i < count; i++) {
            if (productNames[i].equals(removeProductName)) {
                productNames[i] = productNames[count - 1];
                quantities[i] = quantities[count - 1];
                prices[i] = prices[count - 1];
                count--;
                System.out.println("Product removed: " + removeProductName);
                break;
            }
        }

        // Alle Produkte erneut anzeigen
        System.out.println("All products in the warehouse after removal:");
        for (int i = 0; i < count; i++) {
            System.out.println("Product: " + productNames[i] + ", Quantity: " + quantities[i] + ", Price: " + prices[i]);
        }
    }
}
