class Product {
    public String productName;
    public int quantity;
    public double price;

    public Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void addStock(int quantityToAdd) {
        if (quantityToAdd > 0) {
            quantity += quantityToAdd;
            System.out.println(quantityToAdd + " units of " + productName + " added to stock.");
        } else {
            System.out.println("Quantity to add must be greater than zero.");
        }
    }

    public void removeStock(int quantityToRemove) {
        if (quantityToRemove > 0 && quantity >= quantityToRemove) {
            quantity -= quantityToRemove;
            System.out.println(quantityToRemove + " units of " + productName + " removed from stock.");
        } else {
            System.out.println("Not enough stock available to remove " + quantityToRemove + " units of " + productName);
        }
    }

    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity Available: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
}

public class Klassen_aufgabe_loesung {
    public static void main(String[] args) {
        // Erstelle Produkte
        Product apple = new Product("Apple", 50, 0.99);
        Product banana = new Product("Banana", 30, 1.29);
        Product orange = new Product("Orange", 40, 1.19);

        // Teste Methoden der Product-Klasse
        apple.displayProduct();
        banana.displayProduct();
        orange.displayProduct();

        apple.addStock(20);
        banana.removeStock(10);
        orange.addStock(15);

        // Aktualisierte Informationen anzeigen
        apple.displayProduct();
        banana.displayProduct();
        orange.displayProduct();
    }
}
