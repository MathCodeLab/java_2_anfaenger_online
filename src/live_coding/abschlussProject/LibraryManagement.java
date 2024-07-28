package live_coding.abschlussProject;

public class LibraryManagement {
    public static void trennr(){
        System.out.println("==========================================");
        System.out.println("==========================================");
        System.out.println("==========================================");
    }


    public static void main(String[] args) {
        Book book1 = new Book("java1", "Khaled");
        System.out.println(book1);
        System.out.println("--> Total books: " + book1.getTotalBooks()); // 1

        trennr();

        Book book2 = new Book("java2", "Mohammad");
        System.out.println(book2);
        System.out.println("--> Total books: " + book2.getTotalBooks()); // 2

        trennr();

        Book book3 = new Book("java3", "Osman");
        System.out.println(book3);
        System.out.println("--> Total books: " + book3.getTotalBooks()); // 1

        trennr();

        Book book4 = new Book();
        System.out.println(book4);
        System.out.println("--> Total books: " + book4.getTotalBooks()); // 1
        book4.setAuthor("Jean");
        book4.setTitle("C++");
        System.out.println(book4);
        System.out.println("--> Total books: " + book4.getTotalBooks()); // 1

        trennr();
        trennr();

        EBook ebook1 = new EBook();
        System.out.println(ebook1);
        System.out.println(ebook1.getTotalBooks());
        ebook1.setAuthor("alaa");
        ebook1.setTitle("C#");

        trennr();

        EBook ebook2 = new EBook("PHP", "Lina", "pdf");
        System.out.println(ebook2);
        System.out.println(ebook2.getTotalBooks());


    }
}
