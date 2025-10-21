請設計一個 圖書館系統 (Library System)：
1 每本書 (Book) 包含 書名 (title) 與 作者 (author)。
2 圖書館 (Library) 可儲存多本書，並提供 新增 (addBook) 與 移除 (removeBook) 功能。
3 使用者 (Main) 可以：
3.1 建立多本書並加入圖書館。
3.2 列出圖書館目前的所有書籍。
3.3 移除指定的一本書，再次顯示圖書館剩下的書籍。

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


輸出：
圖書館目前的藏書：
Design Patterns - Gamma
Effective Java - Joshua Bloch
Clean Code - Robert C. Martin
Refactoring - Martin Fowler

移除書籍：Effective Java 之後，圖書館剩下：
Design Patterns - Gamma
Clean Code - Robert C. Martin
Refactoring - Martin Fowler

提示：
1. 物件導向設計：Book 類別封裝了屬性與方法 (title, author)。
Library 使用集合 (ArrayList) 管理 Book 物件。
2. 關聯關係 (Association)：Library 擁有多個 Book → 一對多關係。