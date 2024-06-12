### Java Übung: Verwaltung eines Lagers in einem Supermarkt mit Methoden

Diese Übung hilft dir, die Grundlagen der Array-Verwaltung und der Implementierung von Methoden zur Manipulation von Daten in Arrays in Java zu verstehen.

#### Aufgabenstellung:

Erstelle ein Java-Programm, das die Verwaltung eines Lagers in einem Supermarkt ermöglicht. Verwende parallele Arrays, um die Informationen der Artikel zu speichern und implementiere verschiedene Funktionen zur Verwaltung des Lagers in separaten Methoden.

#### Anforderungen:
1. **Lager**: Verwende drei parallele Arrays, um die Informationen der Artikel zu speichern:
    - `String[] productNames`: Die Namen der Produkte.
    - `int[] quantities`: Die verfügbaren Mengen der Produkte.
    - `double[] prices`: Die Preise der Produkte.

2. **Methoden**: Implementiere folgende Funktionen in separaten Methoden:
    - `int addProduct(String[] productNames, int[] quantities, double[] prices, int count, String productName, int quantity, double price)`: Fügt ein neues Produkt zum Lager hinzu und gibt die neue Anzahl der Produkte zurück.
    - `int removeProduct(String[] productNames, int[] quantities, double[] prices, int count, String productName)`: Entfernt ein Produkt aus dem Lager basierend auf dem Produktnamen und gibt die neue Anzahl der Produkte zurück.
    - `int searchProduct(String[] productNames, int count, String productName)`: Sucht ein Produkt im Lager nach dem Namen und gibt den Index des Produkts zurück. Wenn das Produkt nicht gefunden wird, soll `-1` zurückgegeben werden.
    - `void displayAllProducts(String[] productNames, int[] quantities, double[] prices, int count)`: Gibt alle Produkte im Lager auf der Konsole aus.

3. **Main-Methode**: Implementiere eine `main`-Methode, die die oben genannten Funktionen testet.

#### Detaillierte Schritte:

1. **Initialisierung**:
    - Erstelle drei Arrays für Produktnamen, Mengen und Preise der Produkte mit einer Kapazität von 10.
    - Definiere eine Variable `count`, um die Anzahl der Produkte im Lager zu verfolgen.

2. **Methoden implementieren**:
    - **Hinzufügen eines Produkts**: Implementiere eine Methode `addProduct`, die ein neues Produkt zum Lager hinzufügt.
    - **Entfernen eines Produkts**: Implementiere eine Methode `removeProduct`, die ein Produkt aus dem Lager entfernt.
    - **Suchen eines Produkts**: Implementiere eine Methode `searchProduct`, die nach einem Produkt im Lager sucht.
    - **Anzeigen aller Produkte**: Implementiere eine Methode `displayAllProducts`, die alle Produkte im Lager auf der Konsole ausgibt.

3. **Main-Methode**:
    - Erstelle die Arrays und initialisiere die `count`-Variable.
    - Füge mehrere Produkte zum Lager hinzu.
    - Zeige alle Produkte im Lager an.
    - Suche nach einem bestimmten Produkt und gib die Informationen aus, wenn das Produkt gefunden wird.
    - Entferne ein Produkt und zeige das Lager erneut an.

Viel Erfolg!