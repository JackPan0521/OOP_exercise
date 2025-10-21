設計一個簡單的 書籍管理系統，每本書包含標題 (title)、作者 (author) 和 ISBN 編號。
系統需要能夠：
1 新增書籍到收藏中。
2 顯示目前所有書籍資訊。
3 移除特定書籍並再次顯示收藏內容。

import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    Book book1 = new Book( "Design Patterns" , "GoF" , "978-0201633610" );
    Book book2 = new Book( "Effective Java" , "Joshua Bloch" , "978-0134685991" );
    Book.add_Book(book1);
    Book.add_Book(book2);
    ArrayList < Book > bookCollection = Book.get_BookCollection();
    System.out.println( "目前的書籍收藏：" );
    for (Book book: bookCollection) {
      System.out.println(book.get_Title() + " | " + book.get_Author() + " | " + book.get_ISBN());
    }
    Book.remove_Book(book1);
    System.out.println( "已移除書籍：Design Patterns" + book1.get_Title() +" | " );
    System.out.println( "更新後的書籍收藏：" );
    for (Book book: bookCollection) {
      System.out.println(book.get_Title() + " | " + book.get_Author() + " | " + book.get_ISBN());
    }
  }
}

輸出：
目前的書籍收藏：
Design Patterns | GoF | 978-0201633610
Effective Java | Joshua Bloch | 978-0134685991
已移除書籍：Design Patterns
更新後的書籍收藏：
Effective Java | Joshua Bloch | 978-0134685991
提示： 1. static 成員的應用: bookCollection 是靜態屬性，表示所有書籍共享的集合，方便集中管理。
2. 集合操作 (ArrayList): 使用 ArrayList 來儲存並迭代所有書籍物件。