package live_coding.abschlussProject;

public class Book{
    private static int nextId = 1000;
    private int id;
    private String title;
    private String author;
    private static int totalBooks = 0;

    public Book(){
        this("No title", "No Author");
        //this.id = nextId++;
        //totalBooks++ ;
        // i++ // i+=1 // i=i+1
    }

    public Book(String title, String author){
        this.id = nextId++;
        this.title = title;
        this.author = author;
        totalBooks++; // this.totalBooks = this.totalBooks + 1
        // this.totalBooks++; // this.totalBooks = this.totalBooks + 1
    }

    @Override
    public String toString(){
        return "class-Book: ID: " + id + ", Title: " + title + ", Author: " + author;
    }

    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getTotalBooks(){
        // return this.totalBooks;
        // return Book.totalBooks;
        return totalBooks;
    }
//    public int getNextId(){
//        return nextId;
//    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    
//    public void setId(int id){
//        this.id = id;
//    }
    
//    public void increaseNextId(){
//        nextId++;
//    }
    
//    public void increaseTotalBooks(){
//        totalBooks++;
//    }
    

}



