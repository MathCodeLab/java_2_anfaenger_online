public class Methoden_aufgabe_loesung {

    public static int addProduct(String[] productNames, int[] quantities, double[] prices, int count, String productName, int quantity, double price) {
        if (count < productNames.length) {
            productNames[count] = productName;
            quantities[count] = quantity;
            prices[count] = price;
            count++;
            System.out.println("Product added: " + productName);
        } else {
            System.out.println("Warehouse is full, cannot add more products.");
        }
        return count;
    }

    public static int removeProduct(String[] productNames, int[] quantities, double[] prices, int count, String productName) {
        for (int i = 0; i < count; i++) {
            if (productNames[i].equals(productName)) {
                productNames[i] = productNames[count - 1];
                quantities[i] = quantities[count - 1];
                prices[i] = prices[count - 1];
                count--;
                System.out.println("Product removed: " + productName);
                return count;
            }
        }
        System.out.println("Product not found: " + productName);
        return count;
    }

    public static int searchProduct(String[] productNames, int count, String productName) {
        for (int i = 0; i < count; i++) {
            if (productNames[i].equals(productName)) {
                return i;
            }
        }
        return -1;
    }

    public static void displayAllProducts(String[] productNames, int[] quantities, double[] prices, int count) {
        if (count == 0) {
            System.out.println("No products in the warehouse.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Product: " + productNames[i] + ", Quantity: " + quantities[i] + ", Price: " + prices[i]);
            }
        }
    }
    public static void main(String[] args) {
        int capacity = 10;
        String[] productNames = new String[capacity];
        int[] quantities = new int[capacity];
        double[] prices = new double[capacity];
        int count = 0;

        // Produkte hinzufügen
        count = addProduct(productNames, quantities, prices, count, "Apfel", 50, 0.99);
        count = addProduct(productNames, quantities, prices, count, "Banane", 30, 1.29);
        count = addProduct(productNames, quantities, prices, count, "Orange", 40, 1.19);

        // Alle Produkte anzeigen
        System.out.println("All products in the warehouse:");
        displayAllProducts(productNames, quantities, prices, count);

        // Produkt suchen
        System.out.println("Search for 'Banane':");
        int foundIndex = searchProduct(productNames, count, "Banane");
        if (foundIndex != -1) {
            System.out.println("Found product: " + productNames[foundIndex] + " (Quantity: " + quantities[foundIndex] + ", Price: " + prices[foundIndex] + ")");
        } else {
            System.out.println("Product not found.");
        }

        // Produkt entfernen
        count = removeProduct(productNames, quantities, prices, count, "Apfel");

        // Alle Produkte erneut anzeigen
        System.out.println("All products in the warehouse after removal:");
        displayAllProducts(productNames, quantities, prices, count);
    }

}
