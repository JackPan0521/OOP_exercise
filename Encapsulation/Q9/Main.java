package Encapsulation.Q9;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("Design Patterns", "Gamma");
    Book book2 = new Book("Effective Java", "Joshua Bloch");
    Book book3 = new Book("Clean Code", "Robert C. Martin");
    Book book4 = new Book("Refactoring", "Martin Fowler");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);

    System.out.println("圖書館目前的藏書：");
    for (Book book : library.getBooks()) {
      System.out.println(book.getTitle() + " - " + book.getAuthor());
    }

    library.removeBook(book2);
    System.out.println("\n移除書籍：" + book2.getTitle() + " 之後，圖書館剩下：");
    for (Book book : library.getBooks()) {
      System.out.println(book.getTitle() + " - " + book.getAuthor());
    }
  }
}