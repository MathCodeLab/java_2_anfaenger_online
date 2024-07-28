### Aufgabe: Erstellung einer Bibliotheksverwaltungsanwendung in Java

In dieser Aufgabe erstellen Sie eine Bibliotheksverwaltungsanwendung, die verschiedene Java-Konzepte wie Variablen, Literale, Operatoren, Kontrollstrukturen, Arrays, Methoden, Objektorientierte Programmierung (OOP), statische Methoden, Konstruktoren, `toString()`, Zugriffsmethoden, Kapselung, Fehlerbehandlung und Vererbung umfasst. Diese Anwendung soll es ermöglichen, Bücher in der Bibliothek zu verwalten und grundlegende Operationen wie das Hinzufügen und Entfernen von Büchern sowie das Anzeigen von Buchinformationen durchzuführen.

### Klassen und ihre Attribute

#### Klasse `Library`
Die Klasse `Library` verwaltet eine Sammlung von Büchern. Die Attribute und Methoden sind wie folgt:

- **Attribute**:
  - `name`: Der Name der Bibliothek.
  - `address`: Die Adresse der Bibliothek.
  - `numberOfBooks`: Die Anzahl der Bücher in der Bibliothek.
  - `books`: Ein Array von `Book`-Objekten, das die Bücher in der Bibliothek speichert.
  - `capacity`: Die maximale Kapazität der Bibliothek.

- **Methoden**:
  - `Library(String name, String address, int capacity)`: Konstruktor, der den Namen, die Adresse und die Kapazität der Bibliothek initialisiert.
  - `addBook(Book book)`: Methode zum Hinzufügen eines Buches zur Bibliothek.
  - `removeBook(int bookId)`: Methode zum Entfernen eines Buches aus der Bibliothek.
  - `displayInfo()`: Methode zum Anzeigen der Bibliotheksinformationen und der in der Bibliothek gespeicherten Bücher.
  - `Getter` und `Setter` Methoden für die Attribute `name`, `address`, `numberOfBooks`, und `capacity`.

#### Klasse `Book`
Die Klasse `Book` repräsentiert ein Buch in der Bibliothek. Die Attribute und Methoden sind wie folgt:

- **Attribute**:
  - `nextId`: Statische Variable, die zur Generierung einer eindeutigen ID für jedes Buch verwendet wird.
  - `id`: Die eindeutige ID des Buches.
  - `title`: Der Titel des Buches.
  - `author`: Der Autor des Buches.
  - `totalBooks`: Statische Variable, die die Gesamtzahl der Bücher verfolgt.

- **Methoden**:
  - `Book(String title, String author)`: Konstruktor, der den Titel und den Autor des Buches initialisiert und eine eindeutige ID generiert.
  - `toString()`: Methode zum Zurückgeben der Buchinformationen als String.
  - `Getter` und `Setter` Methoden für die Attribute `title` und `author`.
  - `static int getTotalBooks()`: Statische Methode zum Abrufen der Gesamtzahl der Bücher.

#### Klasse `EBook`
Die Klasse `EBook` erweitert die Klasse `Book` und fügt ein zusätzliches Attribut für das Format hinzu.

- **Attribute**:
  - `format`: Das Format des E-Books (z.B. PDF, EPUB).

- **Methoden**:
  - `EBook(String title, String author, String format)`: Konstruktor, der den Titel, den Autor und das Format des E-Books initialisiert.
  - `toString()`: Methode zum Zurückgeben der E-Book-Informationen als String.
  - `Getter` und `Setter` Methoden für das Attribut `format`.

#### Klasse `LibraryManagement`
Die Klasse `LibraryManagement` enthält die `main` Methode und ermöglicht die Interaktion mit dem Benutzer über die Konsole. Hier werden Bücher zur Bibliothek hinzugefügt und die Bibliotheksinformationen angezeigt.

### Implementierung

Hier ist die vollständige Implementierung der oben beschriebenen Klassen:

```java
public class Library {
    private String name;
    private String address;
    private int numberOfBooks;
    private Book[] books;
    private int capacity;

    public Library(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.numberOfBooks = 0;
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (numberOfBooks < capacity) {
            books[numberOfBooks++] = book;
        } else {
            System.out.println("Bibliothek ist voll, Buch konnte nicht hinzugefügt werden.");
        }
    }

    public void removeBook(int bookId) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getId() == bookId) {
                books[i] = books[numberOfBooks - 1];
                books[numberOfBooks - 1] = null;
                numberOfBooks--;
                return;
            }
        }
        System.out.println("Buch mit ID " + bookId + " nicht gefunden.");
    }

    public void displayInfo() {
        System.out.println("Bibliothek: " + name);
        System.out.println("Adresse: " + address);
        System.out.println("Anzahl der Bücher: " + numberOfBooks);
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public int getCapacity() {
        return capacity;
    }
}
```

```java
public class Book {
    private static int nextId = 1;
    private int id;
    private String title;
    private String author;
    private static int totalBooks = 0;

    public Book(String title, String author) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public String toString() {
        return "Buch [ID=" + id + ", Titel=" + title + ", Autor=" + author + "]";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
```

```java
public class EBook extends Book {
    private String format;

    public EBook(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Format=" + format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
```

```java
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library("Stadtbibliothek", "Musterstraße 123, 12345 Musterstadt", 50);
        library.displayInfo();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Geben Sie die Anzahl der Bücher ein: ");
            int numberOfBooks = scanner.nextInt();
            scanner.nextLine(); // Den Zeilenumbruch konsumieren

            for (int i = 0; i < numberOfBooks; i++) {
                System.out.print("Geben Sie den Titel des Buches ein: ");
                String title = scanner.nextLine();
                System.out.print("Geben Sie den Autor des Buches ein: ");
                String author = scanner.nextLine();
                System.out.print("Ist es ein E-Book (ja/nein)? ");
                String isEbook = scanner.nextLine();

                if (isEbook.equalsIgnoreCase("ja")) {
                    System.out.print("Geben Sie das Format des E-Books ein: ");
                    String format = scanner.nextLine();
                    EBook ebook = new EBook(title, author, format);
                    library.addBook(ebook);
                } else {
                    Book book = new Book(title, author);
                    library.addBook(book);
                }
            }
        } catch (Exception e) {
            System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
        }

        library.displayInfo();
    }
}
```

### Beschreibung der Aufgabe und der Klassen

- **Library-Klasse**: Verwalten Sie eine Sammlung von Büchern, die in der Bibliothek gespeichert sind. Die `addBook()`-Methode fügt ein Buch zur Bibliothek hinzu, solange die Kapazität nicht überschritten wird. Die `removeBook()`-Methode entfernt ein Buch anhand seiner ID. Die `displayInfo()`-Methode zeigt die Informationen der Bibliothek und die Details der gespeicherten Bücher an.

- **Book-Klasse**: Repräsentiert ein Buch in der Bibliothek. Jedes Buch hat eine eindeutige ID, einen Titel und einen Autor. Die ID wird automatisch generiert und die Gesamtzahl der Bücher wird mithilfe einer statischen Variablen verfolgt. Die `toString()`-Methode gibt die Buchinformationen als String zurück.

- **EBook-Klasse**: Erweitert die `Book`-Klasse und fügt ein zusätzliches Attribut `format` hinzu, um das Format des E-Books zu speichern