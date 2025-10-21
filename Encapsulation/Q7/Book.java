package Encapsulation.Q7;
import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> books = new ArrayList<>();

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    public static void addBook(Book book){
        books.add(book);
    }

    public static void removeBook(Book book){
        books.remove(book);
    }

    public static ArrayList<Book> getBookCollection(){
        return new ArrayList<>(books);
    }
}
