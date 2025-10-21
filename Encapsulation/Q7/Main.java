package Encapsulation.Q7;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Book book1 = new Book( "Design Patterns" , "GoF" , "978-0201633610" );
    Book book2 = new Book( "Effective Java" , "Joshua Bloch" , "978-0134685991" );
    Book.addBook(book1);
    Book.addBook(book2);
    ArrayList < Book > bookCollection = Book.getBookCollection();
    System.out.println( "目前的書籍收藏：" );
    for (Book book: bookCollection) {
      System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getISBN());
    }
    Book.removeBook(book1);
    System.out.println( "已移除書籍：Design Patterns" + book1.getTitle() +" | " );
    System.out.println( "更新後的書籍收藏：" );
    for (Book book: bookCollection) {
      System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getISBN());
    }
  }
}