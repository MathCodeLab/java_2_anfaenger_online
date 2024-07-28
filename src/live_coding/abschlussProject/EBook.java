package live_coding.abschlussProject;

public class EBook extends Book{
    private String format;


    public EBook(){
//        super(); // no title, no author, id=nextId++, totalbooks++
//        this.format = "no format";
        this("No title", "No Author", "No Format");
    }

    public EBook(String title, String author, String format){
        super(title, author); // title=title, author=author, id=nextId++, totalbooks++
        this.format = format;
//        System.out.println(super.getNextId());
//        super.setTitle(title); // super.title = title;
//        super.setAuthor(author); // super.author = author;
//        this.format = format;
//        super.setId(super.getNextId()); // super.id = super.nextId++;
//        super.increaseNextId();
//        super.increaseTotalBooks();
    }

    public String getFormat() {
        return format;
    }

    public String toString(){
        return super.toString() + ", Format: " + format;
    }

}
